import java.util.Scanner;

class Task4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String inputString = s.nextLine();
        s.close();

        String reverse = new StringBuilder(inputString).reverse().toString();

        if (inputString.equalsIgnoreCase(reverse)){
            System.out.println("The input string is a palindrome");
        }else{
            System.out.println("The input string is not a palindrome");
        }
    }
}