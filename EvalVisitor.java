import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.lang.Math;
import java.util.*;

public class EvalVisitor extends Project2BaseVisitor<String> {

    private String caseValue = "";
    private Boolean isNotAFunction = true;
    private String functionVal = "";
    private int functionLevel = 0;
    private boolean functionParam = false;
    private Scanner sc = new Scanner(System.in);
    private HashMap<String, Pair> memory = new HashMap<String, Pair>();
    private HashMap<String, Project2Parser.FuncdefContext> functionDefs = new HashMap<String, Project2Parser.FuncdefContext>();
    private HashMap<String, Project2Parser.ProcdefContext> procedureDefs = new HashMap<String, Project2Parser.ProcdefContext>();
    private ArrayList<Frame> frames = new ArrayList<Frame>();
    private ArrayList<String> functionNames = new ArrayList<String>();
    private ArrayList<String> functionParams = new ArrayList<String>();
    private int scopelevel = 0;

    public void addToMap(String name, String type, String value)
    {
            boolean notInPrevScopes = true;
            boolean notAFunction = true;
            for (int i = scopelevel; i > 0 && notInPrevScopes && notAFunction; i--)
            {
                if (scopelevel != 0 && frames.get(i - 1).getMemory().containsKey(name))
                {
                    notInPrevScopes = false;
                }
                else if (scopelevel != 0 && frames.get(i - 1).getIsFunc())
                {
                    notAFunction = false;
                }
            }
            if (scopelevel == 0 && !memory.containsKey(name))
            {
                Pair pair = new Pair(type, value);
                memory.put(name, pair);
            }
            else if (scopelevel != 0 && !frames.get(scopelevel - 1).getMemory().containsKey(name) && notInPrevScopes)
            {
                frames.get(scopelevel - 1).addValue(name,type, value);
            }
    }

    public void changeValue(String name, String value)
    {
            int i = scopelevel;
            boolean notAFunction = true;
            boolean found = false;
            while (i > 0 && notAFunction)
            {
                if (frames.get(i - 1).getMemory().containsKey(name))
                {
                    frames.get(i - 1).getMemory().get(name).setValue(value);
                    found = true;
                }
                if (frames.get(i - 1).getIsFunc())
                {
                    notAFunction = false;
                }
                --i;
            }
            if (memory.containsKey(name))
            {
                memory.get(name).setValue(value);
                found = true;
            }
            if (!found)
            {
                System.out.println("Variable " + name + " has not been declared");
            }
    }

    public String getVariableValue(String name)
    {
        String result = "";
        int i = scopelevel;
        boolean found = false;
        boolean notAFunction = true;
        while (i > 0 && notAFunction)
        {
            if (frames.get(i - 1).getMemory().containsKey(name))
            {
                result = frames.get(i - 1).getMemory().get(name).getValue();
                found = true;
            }
            if (frames.get(i - 1).getIsFunc())
            {
                notAFunction = false;
            }
            --i;
        }
        if (memory.containsKey(name))
        {
            result = memory.get(name).getValue();
            found = true;
        }
        if (!found)
        {
            System.out.println("Variable " + name + " does not exist");
        }
        return result;
    }

    public String getVariableValueParameters(String name)
    {
        String result = "";
        int i = scopelevel - 1;
        boolean found = false;
        int notAFunction = 0;
        while (i > 0 && notAFunction < 1)
        {
            if (frames.get(i - 1).getMemory().containsKey(name))
            {
                result = frames.get(i - 1).getMemory().get(name).getValue();
                found = true;
            }
            if (frames.get(i - 1).getIsFunc())
            {
                notAFunction++;
            }
            --i;
        }
        if (memory.containsKey(name))
        {
            result = memory.get(name).getValue();
            found = true;
        }
        if (!found)
        {
            System.out.println("Variable " + name + " does not exist");
        }
        return result;
    }

    public String getVariableType(String name)
    {
        String result = "";
        int i = scopelevel;
        boolean found = false;
        boolean notAFunction = true;
        while (i > 0 && notAFunction)
        {
            if (frames.get(i - 1).getMemory().containsKey(name))
            {
                result = frames.get(i - 1).getMemory().get(name).getType();
                found = true;
            }
            if (frames.get(i - 1).getIsFunc())
            {
                notAFunction = false;
            }
            --i;
        }
        if (memory.containsKey(name))
        {
            result = memory.get(name).getType();
            found = true;
        }
        return result;
    }

    /*

        Program

    */

    @Override
    public String visitProgram(Project2Parser.ProgramContext ctx) {
        this.visit(ctx.vardec());
        for (int i = 0; i < ctx.funcdef().size(); i++)
        {
            this.visit(ctx.funcdef(i));
        }
        for (int i = 0; i < ctx.procdef().size(); i++)
        {
            this.visit(ctx.procdef(i));
        }
        this.visit(ctx.mainblock());
        return "";
    }

    /*

        block

    */
    @Override
    public String visitMainblock(Project2Parser.MainblockContext ctx) {
        String result = this.visit(ctx.lines());
        return result;
    }

    @Override
    public String visitBlock(Project2Parser.BlockContext ctx) {
        scopelevel++;
        frames.add(new Frame(false));
        if (ctx.vardec() != null)
        {
            this.visit(ctx.vardec());
        }
        String result = this.visit(ctx.lines());
        frames.remove(scopelevel - 1);
        scopelevel--;
        if (result.equals("continue"))
        {
            result = "";
        }
        if ((scopelevel == 0 && result.equals("break")))
        {
            result = "";
        }
        return result;
    }

    /*
        lines
    */

    @Override
    public String visitLines(Project2Parser.LinesContext ctx) {
        String result = "";
        for (int i = 0; i < ctx.line().size(); i++)
        {
            result = this.visit(ctx.line(i));
            if (result.equals("break"))
            {
                break;
            }
            else if (result.equals("continue"))
            {
                result = "";
                break;
            }
        }
        return result;
    }

    /*

        Function

    */

    @Override
    public String visitFuncdef(Project2Parser.FuncdefContext ctx) {
        functionDefs.put(this.visit(ctx.name).toLowerCase(), ctx);
        return "";
    }
    

    @Override
    public String visitCallfunc(Project2Parser.CallfuncContext ctx) {
        functionLevel++;
        Project2Parser.FuncdefContext definition = functionDefs.get(this.visit(ctx.name).toLowerCase());
        functionNames.add(this.visit(ctx.name).toLowerCase() + Integer.toString(functionLevel));
        String result = "";
        scopelevel++;
        frames.add(new Frame(true));
        for (int i = 0; i < definition.funcvardef().size(); i++)
        {
            this.visit(definition.funcvardef(i));
        }
        functionParam = true;
        for (int i = 0; i < functionParams.size(); i++)
        {
            String value = this.visit(ctx.funcparam(i));
            String name = functionParams.get(i);
            changeValue(name, value);
        }
        functionParam = false;
        functionParams.clear();
        if (definition.vardec() != null)
        {
            this.visit(definition.vardec());
        }
        if (definition.op.getText().toLowerCase().equals("real"))
        {
            addToMap(this.visit(ctx.name).toLowerCase() + Integer.toString(functionLevel), "real", "0.0");
        }
        else
        {
            addToMap(this.visit(ctx.name).toLowerCase() + Integer.toString(functionLevel), "boolean", "false");   
        }
        for (int i = 0; i < definition.line().size() && !result.contains("stop"); i++)
        {
            result = this.visit(definition.line(i));
        }
        if (functionNames.size() > 0)
        {
            functionNames.remove(functionNames.size() - 1);
        }
        frames.remove(scopelevel - 1);
        scopelevel--;
        functionLevel--;
        changeValue(this.visit(ctx.var(0)).toLowerCase(), functionVal);
        functionVal = "";
        return "";
    }

    @Override
    public String visitFuncvardef(Project2Parser.FuncvardefContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++)
        {
            String name = this.visit(ctx.var(i)).toLowerCase();
            String type = ctx.op.getText().toLowerCase();
            functionParams.add(name);
            if (type.equals("real"))
            {
                addToMap(name, type, "0.0");
            }
            else 
            {
                addToMap(name, type, "False");
            }
        }
        return "";
    }

    @Override
    public String visitFuncparam(Project2Parser.FuncparamContext ctx) {
        String value = "";
        if (ctx.var() != null) 
        {
            value = getVariableValueParameters(this.visit(ctx.var()));
        }
        else if (ctx.exprff() != null)
        {
            value = this.visit(ctx.exprff());
        }
        else
        {
            value = this.visit(ctx.exprb());
        }
        return value;
    }
    /*

        Procedure

    */

    @Override
    public String visitProcdef(Project2Parser.ProcdefContext ctx) {
        procedureDefs.put(this.visit(ctx.name), ctx);
        return "";
    }

    @Override
    public String visitCallproc(Project2Parser.CallprocContext ctx) {
        functionLevel++;
        Project2Parser.ProcdefContext definition = procedureDefs.get(this.visit(ctx.name).toLowerCase());
        String result = "";
        scopelevel++;
        frames.add(new Frame(true));
        for (int i = 0; i < definition.funcvardef().size(); i++)
        {
            this.visit(definition.funcvardef(i));
        }
        functionParam = true;
        for (int i = 0; i < functionParams.size(); i++)
        {
            String value = this.visit(ctx.funcparam(i));
            String name = functionParams.get(i);
            changeValue(name, value);
        }
        functionParam = false;
        functionParams.clear();
        if (definition.vardec() != null)
        {
            this.visit(definition.vardec());
        }
        if (definition.op.getText().toLowerCase().equals("real"))
        {
            addToMap(this.visit(definition.ret).toLowerCase(), "real", "0.0");
        }
        else
        {
            addToMap(this.visit(definition.ret).toLowerCase(), "boolean", "false");   
        }
        for (int i = 0; i < definition.line().size() && !result.equals("stop"); i++)
        {
            result = this.visit(definition.line(i));
        }
        functionVal = getVariableValue(this.visit(definition.ret).toLowerCase());
        frames.remove(scopelevel - 1);
        scopelevel--;
        functionLevel--;
        changeValue(this.visit(ctx.variable), functionVal);
        functionVal = "";
        return "";
    }

    /*

        For loop

    */

    @Override
    public String visitFordoto(Project2Parser.FordotoContext ctx) {
        String result = "";
        scopelevel++;
        frames.add(new Frame(false));
        if (ctx.vardec() != null)
        {
            this.visit(ctx.vardec());
        }
        String name = this.visit(ctx.varre()).toLowerCase();
        String compare = this.visit(ctx.exprff());
        Float tempValue = 0.0f;
        for (Float.parseFloat(getVariableValue(name));Float.parseFloat(getVariableValue(name)) <= Float.parseFloat(compare) && !result.equals("break") && !result.equals("continue");) {   
            for (int i = 0; i < ctx.line().size() && !result.equals("break") && !result.equals("continue"); i++)
            {
             result = this.visit(ctx.line(i));
            }
            tempValue = Float.parseFloat(getVariableValue(name));
            tempValue += 1.0f;
            changeValue(name, Float.toString(tempValue));
        }
        frames.remove(scopelevel - 1);
        scopelevel--;
        if (result.equals("continue"))
        {
            result = "";
        }
        if ((scopelevel == 0 && result.equals("break")))
        {
            result = "";
        }        
        return result;
    }

    @Override
    public String visitFordodownto(Project2Parser.FordodowntoContext ctx) {
        String result = "";
        scopelevel++;
        frames.add(new Frame(false));
        if (ctx.vardec() != null)
        {
            this.visit(ctx.vardec());
        }
        String name = this.visit(ctx.varre()).toLowerCase();
        String compare = this.visit(ctx.exprff());
        Float tempValue = 0.0f;
        for (Float.parseFloat(getVariableValue(name));Float.parseFloat(getVariableValue(name)) >= Float.parseFloat(compare) && !result.equals("break") && !result.equals("continue");) {   
            for (int i = 0; i < ctx.line().size() && !result.equals("break") && !result.equals("continue"); i++)
            {
             result = this.visit(ctx.line(i));
            }
            tempValue = Float.parseFloat(getVariableValue(name));
            tempValue -= 1.0f;
            changeValue(name, Float.toString(tempValue));
        }
        frames.remove(scopelevel - 1);
        scopelevel--;
        if (result.equals("continue"))
        {
            result = "";
        }
        if ((scopelevel == 0 && result.equals("break")))
        {
            result = "";
        }
        return result;
    }

    /*

        while loop

    */

    @Override
    public String visitWhiledo(Project2Parser.WhiledoContext ctx) {
        String result = "";
        scopelevel++;
        frames.add(new Frame(false));
        if (ctx.vardec() != null)
        {
            this.visit(ctx.vardec());
        }
        while (Boolean.parseBoolean(this.visit(ctx.exprb())) && !result.equals("break") && !result.equals("continue")) {   
            for (int i = 0; i < ctx.line().size() && !result.equals("break") && !result.equals("continue"); i++)
            {
             result = this.visit(ctx.line(i));
            }
        }
        frames.remove(scopelevel - 1);
        scopelevel--;
        if (result.equals("continue"))
        {
            result = "";
        }
        if ((scopelevel == 0 && result.equals("break")))
        {
            result = "";
        }
        return result;
    }
    
    /*

        if statement

    */

    @Override
    public String visitIfstate(Project2Parser.IfstateContext ctx) {
        String result = "";
        boolean condition = Boolean.parseBoolean(this.visit(ctx.ex));
        if (condition)
        {
            result = this.visit(ctx.thenstate());
        }
        else
        {
            for (int i = 0; i < ctx.elseifstate().size() && !result.equals("break") && !result.equals("continue"); i++)
            {
                result = this.visit(ctx.elseifstate(i));
            }
            if (!result.equals("break") && !result.equals("continue") && ctx.elsestate() != null)
            {
                result = this.visit(ctx.elsestate());
            }
        }
        if (result.equals("continue"))
        {
            result = "";
        }
        return result;
    }

    @Override
    public String visitThenstateBlock(Project2Parser.ThenstateBlockContext ctx) {
        String result = this.visit(ctx.block());
        return result;
    }

    @Override
    public String visitThenstateLine(Project2Parser.ThenstateLineContext ctx) {
        String result = this.visit(ctx.line());
        return result;
    }

    @Override
    public String visitElseifstateline(Project2Parser.ElseifstatelineContext ctx) {
        String result = "";
        boolean condition = Boolean.parseBoolean(this.visit(ctx.exprb()));
        if (condition)
        {
            result = this.visit(ctx.line());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    @Override
    public String visitElseifstateblock(Project2Parser.ElseifstateblockContext ctx) {
        String result = "";
        boolean condition = Boolean.parseBoolean(this.visit(ctx.exprb()));
        if (condition)
        {
            result = this.visit(ctx.block());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    @Override
    public String visitElsestateLine(Project2Parser.ElsestateLineContext ctx) {
        String result = this.visit(ctx.line());
        return result;
    }

    @Override
    public String visitElsestateBlock(Project2Parser.ElsestateBlockContext ctx) {
        String result = this.visit(ctx.block());
        return result;
    }

    /*

        case statement

    */

    @Override
    public String visitCasestate(Project2Parser.CasestateContext ctx) {
        String result = "";
        String value = getVariableValue(this.visit(ctx.va).toLowerCase());
        caseValue = value;
        for (int i = 0; i < ctx.cases().size(); i++)
        {
            result = this.visit(ctx.cases(i));
            if (result.equals("break"))
            {
                break;
            }
            else if (result.equals("continue"))
            {
                result = "";
                break;
            }
        }
        caseValue = "";
        return result;
    }

    @Override
    public String visitCasesExprffBlock(Project2Parser.CasesExprffBlockContext ctx) {
        String result = "";
        float check = Float.parseFloat(this.visit(ctx.exprff()));
        if (Float.parseFloat(caseValue) == check)
        {
            result = this.visit(ctx.block());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    @Override
    public String visitCasesExprffLine(Project2Parser.CasesExprffLineContext ctx) {
        String result = "";
        float check = Float.parseFloat(this.visit(ctx.exprff()));
        if (Float.parseFloat(caseValue) == check)
        {
            result = this.visit(ctx.line());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    @Override
    public String visitCasesExprbBlock(Project2Parser.CasesExprbBlockContext ctx) {
        String result = "";
        boolean check = Boolean.parseBoolean(this.visit(ctx.exprb()));
        if (Boolean.parseBoolean(caseValue) == check)
        {
            result = this.visit(ctx.block());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    @Override
    public String visitCasesExprbLine(Project2Parser.CasesExprbLineContext ctx) {
        String result = "";
        boolean check = Boolean.parseBoolean(this.visit(ctx.exprb()));
        if (Boolean.parseBoolean(caseValue) == check)
        {
            result = this.visit(ctx.line());
            if (!result.equals("break"))
            {
                result = "continue";
            }
        }
        return result;
    }

    /*

        line

    */

    @Override
    public String visitBlockline(Project2Parser.BlocklineContext ctx) {
        String result = this.visit(ctx.block());
        return result;
    }

    @Override
    public String visitWriteline(Project2Parser.WritelineContext ctx) {
        this.visit(ctx.writeln());
        return "";
    }

    @Override
    public String visitStdinline(Project2Parser.StdinlineContext ctx) {
        this.visit(ctx.stdin());
        return "";
    }

    @Override
    public String visitCallfuncline(Project2Parser.CallfunclineContext ctx) {
        this.visit(ctx.callfunc());
        return "";
    }

    @Override
    public String visitCallIfstate(Project2Parser.CallIfstateContext ctx) {
        String result = this.visit(ctx.ifstate());
        return result;
    }

    @Override
    public String visitCallcasestate(Project2Parser.CallcasestateContext ctx) {
        String result = this.visit(ctx.casestate());
        return result;
    }

    @Override
    public String visitCallprocline(Project2Parser.CallproclineContext ctx) {
        this.visit(ctx.callproc());
        return "";
    }

    @Override
    public String visitCallfordo(Project2Parser.CallfordoContext ctx) {
        String result = this.visit(ctx.fordo());
        return result;
    }

    @Override
    public String visitCallwhiledo(Project2Parser.CallwhiledoContext ctx) {
        String result = this.visit(ctx.whiledo());
        return result;
    }

    @Override
    public String visitBreak(Project2Parser.BreakContext ctx) {
        return "break";
    }

    @Override
    public String visitContinue(Project2Parser.ContinueContext ctx) {
        return "continue";
    }

    @Override
    public String visitVarreline(Project2Parser.VarrelineContext ctx) {
        String result = this.visit(ctx.varre());
        return result;
    }

    /*
    *

        Variable declaration
    *
    */
    @Override
    public String visitVardec(Project2Parser.VardecContext ctx) {
        for (int i = 0; i < ctx.varinit().size(); i++)
        {
            this.visit(ctx.varinit(i));
        }
        return "";
    }

    @Override
    public String visitVarinitequalBool(Project2Parser.VarinitequalBoolContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String value = this.visit(ctx.er);
        addToMap(name, "boolean", value);
        return "";
    }

    @Override
    public String visitVarinitequalReal(Project2Parser.VarinitequalRealContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String value = this.visit(ctx.exprff());
        addToMap(name, "real", value);
        return "";
    }

    @Override
    public String visitVarinitRealVar(Project2Parser.VarinitRealVarContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String name2 = this.visit(ctx.vr).toLowerCase();
        String value = getVariableValue(name2);
        addToMap(name, "real", value);
        return "";
    }

    @Override
    public String visitVarinitBoolVar(Project2Parser.VarinitBoolVarContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String name2 = this.visit(ctx.vr).toLowerCase();
        String value = getVariableValue(name2);
        addToMap(name, "boolean", value);
        return "";
    }

    @Override
    public String visitVarinitBool(Project2Parser.VarinitBoolContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++)
        {
            String name = this.visit(ctx.var(i)).toLowerCase();
            addToMap(name, "boolean", "False");
        }
        return "";
    }

    @Override
    public String visitVarinitReal(Project2Parser.VarinitRealContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++)
        {
            String name = this.visit(ctx.var(i)).toLowerCase();
            addToMap(name, "real", "0.0");
        }
        return "";
    }

    /*

        Change Variable Values

    */

    @Override
    public String visitVarreExprb(Project2Parser.VarreExprbContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String value = this.visit(ctx.er);
        if (functionNames.size() > 0)
        {
            if ((name + Integer.toString(functionLevel)).equals(functionNames.get(functionNames.size() - 1)))
            {
                functionVal = value;
                return "stop";
            }
        }
        changeValue(name, value);
        return name;
    }

    @Override
    public String visitVarreExprff(Project2Parser.VarreExprffContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String value = this.visit(ctx.el);
        if (functionNames.size() > 0)
        {
            if ((name + Integer.toString(functionLevel)).equals(functionNames.get(functionNames.size() - 1)))
            {
                functionVal = value;
                return "stop";
            }
        }
        changeValue(name, value);
        return name;
    }

    @Override
    public String visitVarreVar(Project2Parser.VarreVarContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String name2 = this.visit(ctx.vr).toLowerCase();
        boolean isfunction = true;
        String type1 = getVariableType(name + Integer.toString(functionLevel));
        if (type1.equals(""))
        {
            type1 = getVariableType(name);
            isfunction = false;
        }
        String type2 = getVariableType(name2);
        //System.out.println(type2);
        if (type1.equals(type2));
        {
            //System.out.println(Boolean.toString(functionNames.size() > 0));
            if (functionNames.size() > 0 && isfunction)
            {
                if ((name + Integer.toString(functionLevel)).equals(functionNames.get(functionNames.size() - 1)))
                {
                    functionVal = getVariableValue(name2);
                    return "stop";
                }
            }
            changeValue(name, getVariableValue(name2));
        }
        return name;
    }

    /*

        stdin

    */

    @Override
    public String visitRead(Project2Parser.ReadContext ctx) {
        String name = this.visit(ctx.va).toLowerCase();
        String type = getVariableType(name);
        if (type.equals("real"))
        {
            changeValue(name, Float.toString(sc.nextFloat()));
        }
        else
        {
            changeValue(name, Boolean.toString(sc.nextBoolean()));
        }
        return "";
    }

    /*
    *
        writln
    *
    */
    @Override
    public String visitWriteExprb(Project2Parser.WriteExprbContext ctx) {
        String val = this.visit(ctx.exprb());
        System.out.println(val);
        return "";
    }

    @Override
    public String visitWriteExprff(Project2Parser.WriteExprffContext ctx) {
        String val = this.visit(ctx.exprff());
        System.out.println(val);
        return "";
    }

    @Override
    public String visitWriteVar(Project2Parser.WriteVarContext ctx) {
        String name = this.visit(ctx.var());
        String val = getVariableValue(name);
        System.out.println(val);
        return "";
    }

    /*
    *
        Real Expressions
    *
    */
    @Override
    public String visitExprffSpec(Project2Parser.ExprffSpecContext ctx) {
        String operator = ctx.op.getText();
        String operand = this.visit(ctx.ex);
        if (operator.toLowerCase().equals("sin"))
        {
            return Float.toString((float)Math.sin((double)Float.parseFloat(operand)));
        }
        else if (operator.toLowerCase().equals("cos"))
        {
            return Float.toString((float)Math.cos((double)Float.parseFloat(operand)));
        }
        else if (operator.toLowerCase().equals("ln"))
        {
            return Float.toString((float)Math.log((double)Float.parseFloat(operand)));
        }
        else if (operator.toLowerCase().equals("exp"))
        {
            return Float.toString((float)Math.exp((double)Float.parseFloat(operand)));
        }
        else
        {
            return Float.toString((float)Math.sqrt((double)Float.parseFloat(operand)));
        }
    }

    @Override
    public String visitExprffReal(Project2Parser.ExprffRealContext ctx) {
        String val = ctx.ex.getText();
        return val;
    }

    @Override
    public String visitExprffMULDIVMOD(Project2Parser.ExprffMULDIVMODContext ctx) {
        String operator = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        if (operator.equals("*"))
        {
            return Float.toString(Float.parseFloat(left) * Float.parseFloat(right));
        }
        else if (operator.toLowerCase().equals("/"))
        {
            return Float.toString(Float.parseFloat(left) / Float.parseFloat(right));
        }
        else
        {
            //System.out.println(Float.toString(((Float.parseFloat(left) % Float.parseFloat(right)))));
            return Float.toString(((float)(Float.parseFloat(left) % Float.parseFloat(right))));
        }
    }

    @Override
    public String visitExprffPLUSMINUS(Project2Parser.ExprffPLUSMINUSContext ctx) {
        String operator = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        if (operator.equals("+"))
        {
            return Float.toString(Float.parseFloat(left) + Float.parseFloat(right));
        }
        else
        {
            return Float.toString(Float.parseFloat(left) - Float.parseFloat(right));
        }
    }

    @Override
    public String visitExprffParen(Project2Parser.ExprffParenContext ctx) {
        String val = this.visit(ctx.el);
        return val;
    }

    @Override
    public String visitExprffVar(Project2Parser.ExprffVarContext ctx) {
        String name = this.visit(ctx.var());
        String value = "";
        if (functionParam)
        {
            value = getVariableValueParameters(name);
        }
        else
        {
            value = getVariableValue(name);
        }
        return value;
    }

   /*
    *
        Boolean Expressions
    *   
    */
    @Override
    public String visitExprbParen(Project2Parser.ExprbParenContext ctx) {
        String val = this.visit(ctx.e);
        return val;
    }

    @Override
    public String visitExprbNOT(Project2Parser.ExprbNOTContext ctx) {
        String operand = this.visit(ctx.exprb());
        return Boolean.toString(!(Boolean.parseBoolean(operand)));
    }

    @Override
    public String visitExprbAND(Project2Parser.ExprbANDContext ctx) {
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return Boolean.toString((Boolean.parseBoolean(left)) && (Boolean.parseBoolean(right)));
    }

    @Override
    public String visitExprbOR(Project2Parser.ExprbORContext ctx) {
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        return Boolean.toString((Boolean.parseBoolean(left)) || (Boolean.parseBoolean(right)));
    }

    @Override
    public String visitExprbReals(Project2Parser.ExprbRealsContext ctx) {
        String operator = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        if (operator.equals("<"))
        {
            return Boolean.toString(Float.parseFloat(left) < Float.parseFloat(right));
        }
        else if (operator.equals(">"))
        {
            return Boolean.toString(Float.parseFloat(left) > Float.parseFloat(right));
        }
        else if (operator.equals("<="))
        {
            return Boolean.toString(Float.parseFloat(left) <= Float.parseFloat(right));
        }
        else if (operator.equals(">="))
        {
            return Boolean.toString(Float.parseFloat(left) >= Float.parseFloat(right));
        }
        else if (operator.equals("="))
        {
            return Boolean.toString(Float.parseFloat(left) == Float.parseFloat(right));
        }
        else
        {
            return Boolean.toString(Float.parseFloat(left) != Float.parseFloat(right));
        }
    }

    @Override
    public String visitExprbEQUAL(Project2Parser.ExprbEQUALContext ctx) {
        String operator = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        if (operator.equals("="))
        {
            return Boolean.toString(Boolean.parseBoolean(left) == Boolean.parseBoolean(right));
        }
        else
        {
            return Boolean.toString(Boolean.parseBoolean(left) != Boolean.parseBoolean(right));
        }
    }

    @Override
    public String visitExprbELSETHEN(Project2Parser.ExprbELSETHENContext ctx) {
        String operator = ctx.op.getText();
        String left = this.visit(ctx.left);
        String right = this.visit(ctx.right);
        if (operator.toLowerCase().equals("and then"))
        {
            return Boolean.toString(Boolean.parseBoolean(left) && Boolean.parseBoolean(right));
        }
        else
        {
            return Boolean.toString(Boolean.parseBoolean(left) || Boolean.parseBoolean(right));
        }
    }

    @Override
    public String visitExprbBool(Project2Parser.ExprbBoolContext ctx) {
        String val = ctx.bool.getText();
        return val;
    }

    @Override
    public String visitExprbVar(Project2Parser.ExprbVarContext ctx) {
        String name = this.visit(ctx.var());
        String val = "";
        if (functionParam)
        {
            val = getVariableValueParameters(name);
        }
        else
        {
            val = getVariableValue(name);
        }
        return val;
    }

    /*

        Var

    */

    @Override
    public String visitVarname(Project2Parser.VarnameContext ctx) {
        String name = ctx.va.getText().toLowerCase();
        return name;
    }

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            //no file provided to run
        }
        else{
            System.out.println("parsing: " + args[0]);

            Project2Lexer lexer = new Project2Lexer(new ANTLRFileStream(args[0]));
            Project2Parser parser = new Project2Parser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            EvalVisitor visitor = new EvalVisitor();
            visitor.visit(tree);
            //System.out.println(tree);
        }

        
    }
}