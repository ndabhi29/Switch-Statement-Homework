import java.util.Scanner;

public class CalculatorOfSwitch {

 public static void main(String[]args){
     Scanner scanner = new Scanner (System.in);
     System.out.print("Enter First Number:");
     int num1=scanner.nextInt();
     System.out.print("Enter second Number:");
     int num2= scanner.nextInt();

     System.out.print("Enter an operator (+,-,*,/):");
     char operator= scanner.next().charAt(0);

     switch(operator) {

         case '+':
             System.out.println(num1+"+"+num2+"="+(num1+num2));
             break;
         case '-':
             System.out.println( num1+"-"+num2+"="+(num1+num2));
             break;
         case '*':
             System.out.println( num1+"*"+num2+"="+(num1+num2));
             break;
         case '/':
             System.out.println(num1+"/"+num2+"="+(num1+num2));
             break;
         default:
             System.out.println("Error! operator is not correct");

                return;
     }

     }


 }


