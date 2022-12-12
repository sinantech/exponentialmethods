public class exponentialCalculatorTwo {
    static int exp(int base, int power) {

        if (power < 1) {
            return 1;
        } else {
            return base * exp(base, power - 1);
        }
    }


    public static void main(String[] args) {

        System.out.println(exp(2, 3));
    }
}
