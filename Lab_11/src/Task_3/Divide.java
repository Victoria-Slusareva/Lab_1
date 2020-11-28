package Task_3;

public class Divide extends Operations
{
    public Divide(Const left, Variable vRight) {
        super(left, vRight);
    }

    public Divide(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Divide(Variable vLeft, Const right) {
        super(vLeft, right);
    }

    public Divide(Const left, Const right) {
        super(left, right);
    }

    public Divide(Operations oLeft, Const right){
        super(oLeft, right);
    }

    public Divide(Const left, Operations oRight){
        super(left, oRight);
    }

    public Divide(Variable vLeft, Operations oRight){
        super(vLeft, oRight);
    }

    public Divide(Operations oLeft, Variable vRight){
        super(oLeft, vRight);
    }
    public Divide(Operations oLeft, Operations oRight){
        super(oLeft, oRight);
    }

    @Override
    public double output(double n1, double n2) {
        return n1 / n2;
    }
}
