import java.util.Scanner;

public class Scannerex5 {
    public static void main(String[]args){
        Scanner num=new Scanner(System.in);
     //
        System.out.println("enter divided value");
        int dividend =num.nextInt();
        System.out.println("enter divisor value");
        int divisor=num.nextInt();

        int quotient= dividend /divisor;
        int remainter=dividend%divisor;
        System.out.println("the quotient value is:"+quotient);
        System.out.println("the remainder value is:"+remainter);

    }
}
