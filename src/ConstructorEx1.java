import com.sun.jdi.connect.Connector;

public class ConstructorEx1 {
    public static void main(String[] args) {
        School myobj=new School("london","ond",16);
        System.out.println(myobj.name);
        System.out.println(myobj.address);
        System.out.println(myobj.age);
    }





}
class School {
    String name;
    int age;
    String address;




public  School (String name,String address,int age) {
    this.name=name;
    this.age =age;
    this.address =address;
}

}


