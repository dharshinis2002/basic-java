import java. util.Scanner;
     public class ScannerEx{
         public static void main(String[]args){
             Scanner obj=new Scanner(System.in);
            //addition

             System.out.println("enter the first number");
             int a=obj.nextInt();
             System.out.println("enter the second number");
             int b= obj.nextInt();

             int c=a+b;
             System.out.println("addition:"+c);

             //substraction
             int d=a-b;
             System.out.println("substraction:"+d);

             //multiplication
             int e=a*b;
             System.out.println("multiplication:"+e);

             //division
             int i=a/b;
             float f=a/b;
             int h=a%b;
             System.out.println("division:"+i);
             System.out.println("quotient:"+f);
             System.out.println("reminder:"+h);
             //modulus
             int g=a%b;
             System.out.println("modulus:"+g);




         }

}
