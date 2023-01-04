public class Gettersetter {
    private String name;
    int id;

   //name
    public String getName(){
       return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    //id
   public int getId(){
        return  id;
   }public void setId(int id) {
        this.id = id;
    }
    public static void main(String[] args) {
        Gettersetter obj=new Gettersetter();
        obj.setName("deepi");
        obj.setId(753);
        System.out.println(obj.getName());
        System.out.println(obj.getId());

    }  }