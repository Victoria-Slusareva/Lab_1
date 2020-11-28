package Task_3;

public abstract class Operations implements General {

    protected Operations oLeft, oRight;
    protected Const left, right;
    protected Variable vLeft, vRight;

    public Operations(Const left, Const right) {
        this.left = left;
        this.right = right;
    }

    public Operations(Const left, Variable vRight) {
        this.left = left;
        this.vRight = vRight;
    }

    public Operations(Variable vLeft, Const right) {
        this.vLeft = vLeft;
        this.right = right;
    }

    public Operations(Variable vLeft, Variable vRight) {
        this.vLeft = vLeft;
        this.vRight = vRight;
    }

    public Operations(Operations oLeft, Const right){
        this.oLeft = oLeft;
        this.right = right;
    }

    public Operations(Const left, Operations oRight){
        this.left = left;
        this.oRight = oRight;
    }

    public Operations(Variable vLeft, Operations oRight){
        this.vLeft = vLeft;
        this.oRight = oRight;
    }

    public Operations(Operations oLeft, Variable vRight){
        this.oLeft = oLeft;
        this.vRight = vRight;
    }
    public Operations(Operations oLeft, Operations oRight){
        this.oLeft = oLeft;
        this.oRight = oRight;
    }

    @Override
    public abstract double output(double n1, double n2);

    public double evaluate(double number) {
        if(vRight != null)
        {
            right = vRight.toConst(number);
        }
        if(vLeft != null)
        {
            left = vLeft.toConst(number);
        }
        if(oLeft != null)
        {
            if (oRight == null) return output(oLeft.evaluate(number), right.getValue());
        }
        if(oRight != null)
        {
            if (oLeft == null) return output(oRight.evaluate(number), left.getValue());
            else return output(oLeft.evaluate(number), oRight.evaluate(number));
        }
        return output(left.getValue(), right.getValue());
    }
}