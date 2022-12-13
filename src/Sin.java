public class Sin implements Operation{
    public double item;
    public double answer;
    @Override
    public void doOperate() {
        this.answer = Math.sin(item);
    }

    @Override
    public void getResult() {
        System.out.print("\nAnswer: " + this.answer);
    }

    @Override
    public void getOperationName() {
        System.out.print("\nOperation: "+Sin.class.getName());
    }

    @Override
    public void setFirstItem(double a) {
        this.item = a;
    }

    @Override
    public void setSecondItem(double b) {
        this.item = b;
    }
}
