import java.util.Scanner;
public class ScannerEx3 {
    public static void main(String[]args){
         Scanner myObj=new Scanner(System.in);
         System.out.println("enter your name");

        String name= myObj.nextLine();
        System.out.println("my name is" +name);
    }

}
