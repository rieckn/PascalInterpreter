import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class Pair {
    
    private String type;
    private String value;

    public Pair(String type_, String value_) {
        type = type_;
        value = value_;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value_) {
        value = value_;
    }
}