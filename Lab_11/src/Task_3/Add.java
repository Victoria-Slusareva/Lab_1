package Task_3;

public class Add extends Operations
{
    public Add(Const left, Const right)
    {
        super(left, right);
    }

    public Add(Const left, Variable vRight) {
        super(left, vRight);
    }

    public Add(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Add(Variable vLeft, Const right) {
        super(vLeft, right);
    }

    public Add(Operations oLeft, Const right){
        super(oLeft, right);
    }

    public Add(Const left, Operations oRight){
        super(left, oRight);
    }

    public Add(Variable vLeft, Operations oRight){
        super(vLeft, oRight);
    }

    public Add(Operations oLeft, Variable vRight){
        super(oLeft, vRight);
    }
    public Add(Operations oLeft, Operations oRight){
        super(oLeft, oRight);
    }

    @Override
    public double output(double n1, double n2) {
        return n1 + n2;
    }
}
