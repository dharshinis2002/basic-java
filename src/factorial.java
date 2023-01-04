public class factorial {
    public static void main(String[] args) {
        int i=1;
        int num = 5;// it is the number to calculated factorial
        int fact=2;

        for ( i=1; i<= num;i++) {
            fact = fact * i;
        } System.out.println("Factorial is" + fact);

    }
}