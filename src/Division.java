public class Division implements Operation{
    private double firstItem;
    private double secondItem;
    private double answer;

    @Override
    public void doOperate(){
        this.answer = firstItem/secondItem;
    }

    @Override
    public void getResult() {
        System.out.print("\nAnswer: " + this.answer);
    }

    public void getOperationName() {
        System.out.print("\nOperation: "+Division.class.getName());
    }
    @Override
    public void setFirstItem(double a) {
        this.firstItem = a;
    }

    @Override
    public double getFirstItem() {
        return this.firstItem;
    }

    @Override
    public double getSecondItem() {
        return this.secondItem;
    }

    public double getAnswer() {
        return this.answer;
    }

    @Override
    public void setSecondItem(double a) {
        this.secondItem = a;
    }
}
