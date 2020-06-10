public class GreatestNumber {
    public static void main(String[] args) {
        double num1 = -4.5, num2 = 3.9, num3 = 2.5;

        System.out.println(num1 + "is the largest Number");

        if (num1 >= num2 && num1 >= num3)
                System.out.println(num1 + "is the largest Number");

            else if(num2 >=num1 && num2 >= num3)
                System.out.println(num2 + "is the largest Number");
            else
                System.out.println(num3 + " is the largest Number");


        }


    }
