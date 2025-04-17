public class fun {
    public static void main(String[] args) {
        // System.out.println("helloworld");

        System.out.println(rec(12345678, 0));
    }

    static int rec(int num, int sum) {
        if (num < 10)
            return sum * 10 + num;
        else {
            sum = sum * 10 + num % 10;
            return rec(num / 10, sum);
        }

    }
}