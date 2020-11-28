package Task_3;
import java.util.*;

public class Variable {
    char variable;
    Variable(char variable){
        this.variable = variable;
    }
    public Const toConst(double v){
        return new Const(v);
    }
}
