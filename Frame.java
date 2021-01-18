import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Frame {
    
    private Map<String, Pair> localmemory = new HashMap<String, Pair>();
    boolean isFunction;
    public Frame(boolean isfunc) {
        isFunction = isfunc;
    }

    public Pair getValue(String name)
    {
        return localmemory.get(name);
    }

    public void addValue(String name, String type, String value)
    {
        Pair pair = new Pair(type, value);
        localmemory.put(name, pair);
    }

    public Map<String, Pair> getMemory()
    {
        return localmemory;
    }

    public boolean getIsFunc()
    {
        return isFunction;
    }
}