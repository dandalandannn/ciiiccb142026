import java.util.Scanner;

class Task5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter third number: ");
        int num3 = s.nextInt();

         if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest number is: " + num2);
        } else {
            System.out.println("Largest number is: " + num3);
        }

        s.close();

    }
}