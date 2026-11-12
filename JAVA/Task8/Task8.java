public class Task8 {

    public static int calculateSum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            System.out.println("Sum of 1 to " + num + " = " + sum);

            total += sum;
        }

        return total;
    }

    public static void main(String[] args) {

        int result = calculateSum(4, 5, 10);

        System.out.println("Total Sum = " + result);
    }
}