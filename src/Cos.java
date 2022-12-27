public class Cos implements Operation{
    private double item;
    private double answer;
    @Override
    public void doOperate() {
        this.answer = Math.cos(item);
    }

    @Override
    public void getResult() {
        System.out.print("\nAnswer: " + this.answer);
    }

    @Override
    public void getOperationName() {
        System.out.print("\nOperation: "+Cos.class.getName());
    }

    @Override
    public void setFirstItem(double a) {
        this.item = a;
    }

    @Override
    public double getFirstItem() {
        return this.item;
    }

    @Override
    public double getSecondItem() {
        return this.item;
    }

    public double getAnswer() {
        return this.answer;
    }

    @Override
    public void setSecondItem(double b) {
        this.item = b;
    }
}
