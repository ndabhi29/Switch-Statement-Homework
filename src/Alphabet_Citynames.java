import java.util.Scanner;

public class Alphabet_Citynames {
    public static void main(String[]args){
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name:");
        ch= scanner.next().charAt(0);
        switch (ch) {
            case('a'):
                System.out.println("Andheri");
                break;
            case('b'):
                System.out.println("Bandra");
                break;
            case('c'):
                System.out.println("Church gate");
                break;
            case('d'):
                System.out.println("Dadar");
                break;
            case('e'):
                System.out.println("Elora");
                break;
                default:
                    System.out.println("invalid entry");
                    break;





        }

    }
}
