import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Procedure procedure = new Procedure();
        Scanner scanner =new Scanner(System.in);
        procedure.printInfoAboutProgram(); // print info about our program

        try {
            boolean flag = scanner.nextLine().equals("+");
            if (flag)
            {
                String operation = procedure.initOperation();
                double item = procedure.initItem();
                Operation calculator = procedure.getTargetOperation(operation); // get target operation (a+b, a-b, or smth else)
                procedure.doOperation(calculator, item, item); // calculating
                procedure.getOperationResult(calculator); // print result
            }
            else {
                double firstItem = procedure.initItem(); // initialization first num
                String operation = procedure.initOperation(); // initialization operator (+, - or smth else)
                double secondItem = procedure.initItem(); // initialization second num
                Operation calculator = procedure.getTargetOperation(operation); // get target operation (a+b, a-b, or smth else)
                procedure.doOperation(calculator, firstItem, secondItem); // calculating
                procedure.getOperationResult(calculator); // print result
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
