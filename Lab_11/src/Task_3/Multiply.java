package Task_3;

public class Multiply extends Operations
{
    public Multiply(Const left, Variable vRight) {
        super(left, vRight);
    }

    public Multiply(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Multiply(Variable vLeft, Const right) {
        super(vLeft, right);
    }

    public Multiply(Operations oLeft, Const right){
        super(oLeft, right);
    }

    public Multiply(Const left, Operations oRight){
        super(left, oRight);
    }

    public Multiply(Variable vLeft, Operations oRight){
        super(vLeft, oRight);
    }

    public Multiply(Operations oLeft, Variable vRight){
        super(oLeft, vRight);
    }
    public Multiply(Operations oLeft, Operations oRight){
        super(oLeft, oRight);
    }
    public Multiply(Const left, Const right) {
        super(left, right);
    }

    @Override
    public double output(double n1, double n2) {
        return n1 * n2;
    }
}
