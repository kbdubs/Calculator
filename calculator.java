import java.util.Scanner;
public class calculator{
    private static double num1;
    private static double num2;
    private static double result;
    static String opp;
    public calculator(){
        num1 = 0;
        num2 = 0;
        result = 0;
        opp = "";
    }
    public static void main(String[] args){ 
        Scanner kb = new Scanner(System.in); 
        calculator calculator = new calculator();
        System.out.println("First Number:");
        num1 = kb.nextDouble();
        System.out.println("Second Number:");
        num2 = kb.nextDouble();
        kb.nextLine();
        System.out.println("Operation: ");
        opp = kb.nextLine();
        calculator.calc();
    }
    public void calc(){
        if(opp.equals("Addition")){
            result = num1 + num2;
        }
        else if(opp.equals("Subtraction")){
            result = num1 - num2;
        }
        else if(opp.equals("Multiplication")){
            result = num1 * num2;
        }
        else if(opp.equals("Division")){
            if(num2 == 0){
                System.out.println("Error: Division by zero!");
            }
            else{
            result = num1 / num2;
            }
        }
        else{
            System.out.println("Not a proper input");
        }
        System.out.println("Result: " + result);
    }
}