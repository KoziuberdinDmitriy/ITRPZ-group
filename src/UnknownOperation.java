public class UnknownOperation implements Operation{
    @Override
    public void doOperate() {
        System.out.println("UNKNOWN OPERATION.");
    }

    @Override
    public void getResult() {
        System.out.println("I CAN'T GET RESULT FROM UNKNOWN OPERATION.");
    }

    public void getOperationName() {
        System.out.print("Operation: "+UnknownOperation.class.getName());
    }
    @Override
    public void setFirstItem(double a) {
        System.out.println("\nI CAN'T SET FIRST ITEM FROM UNKNOWN OPERATION.");
    }

    @Override
    public double getFirstItem() {
        return 0.0;
    }

    @Override
    public double getSecondItem() {
        System.out.println("I CAN'T GET SECOND ITEM FROM UNKNOWN OPERATION.");
        return 0.0;
    }

    public double getAnswer() {
        System.out.println("I CAN'T GET SECOND ITEM FROM UNKNOWN OPERATION.");
        return 0.0;
    }

    @Override
    public void setSecondItem(double b) {
        System.out.println("I CAN'T SET SECOND ITEM FROM UNKNOWN OPERATION.");
    }

}
