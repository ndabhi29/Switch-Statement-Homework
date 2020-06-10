import java.util.Scanner;

public class CheckOddEvenSwitch {
public static void main(String[]args){
    Scanner scanner = new Scanner (System.in); //  scanner object for input
    System.out.print("Enter the integer number:");
    int num = scanner.nextInt();

    switch(num%2){

        case 0:
              System.out.println(num+"is a Even number");
        break;

        case 1:
            System.out.println(num+"is a odd number");



    }






}







}
