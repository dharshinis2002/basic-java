import java.util.Scanner;
public class Scannerex2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        //String
      /*  System.out.println("enter the name of x");
        String x = name.nextLine();
        System.out.println("enter the name of y");
        String y = name.nextLine();
        if (x.equals(y)) {
            System.out.println("the name is equals");
        } else {
            System.out.println("the name is not equals");
        }*/
//integer
            System.out.println("enter the first mark");
             int a= name.nextInt();
            System.out.println("enter the second mark");
            int b= name.nextInt();
            if(a<b){
                System.out.println("mark is good" );

            }if(a<=b){
            System.out.println("mark is very bad");
        }
            if(a==b){
                System.out.println("mark is equal");
            if(a!=b) {
                System.out.println("mark is not equal");
            }
            }


    }}