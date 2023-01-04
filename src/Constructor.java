import javax.xml.namespace.QName;

public  class Constructor{
     public static void main(String[]args){

    car myobj= new car("volvo","red", 36);
         System.out.println(myobj .name);
         System.out.println(myobj.colour);
         System.out.println(myobj.size);
     }



     }


 class car {
     String name;
     String colour;
     int size;


 public car (String name ,String colour,int size){
     this.name=name;
     this.colour=colour;
     this.size=size;

  }
 }