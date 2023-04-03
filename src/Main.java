public class Main {
    public static void main(String[] args) {

        int a = 11;
        int b = 2;
        int c = 4;
        int d = 7;

        int sum1 = a + b;
        int sum2 = c + d;

        Boolean result1 = sum1 > sum2;

        sum1++;
        sum2-= 2;

        Boolean result2 = sum1 > sum2;

        int rem1 = sum1 % 2;
        int rem2 = sum2 % 2;

        Boolean result3 = rem1 == 0 || rem2 == 0;

        System.out.println("First sum is bigger than second sum: " + result1);
        System.out.println("After changes - first sum is bigger than second sum: " + result2);
        System.out.println("One of the resulting sum is even: " + result3);
    }
}