package Task_3;

public class Subtract extends Operations
{
    public Subtract(Const left, Variable vRight) {
        super(left, vRight);
    }

    public Subtract(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Subtract(Variable vLeft, Const right) {
        super(vLeft, right);
    }

    public Subtract(Const left, Const right) {
        super(left, right);
    }

    public Subtract(Operations oLeft, Const right){
        super(oLeft, right);
    }

    public Subtract(Const left, Operations oRight){
        super(left, oRight);
    }

    public Subtract(Variable vLeft, Operations oRight){
        super(vLeft, oRight);
    }

    public Subtract(Operations oLeft, Variable vRight){
        super(oLeft, vRight);
    }
    public Subtract(Operations oLeft, Operations oRight){
        super(oLeft, oRight);
    }

    @Override
    public double output(double n1, double n2) {
        return n1 - n2;
    }
}
