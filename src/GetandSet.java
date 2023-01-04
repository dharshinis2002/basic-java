public class GetandSet {
    private int num;
    private int account;
    private int money;

    //num
    public int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    //account
    public int getAccount()
    {
        return account;
    }

    public void setAccount(int account)
    {
        this.account = account;
    }

    //money
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public static void main(String[] args) {

        GetandSet Obj = new GetandSet();

        Obj.setNum(765409876);
        Obj.setAccount(65433);
        Obj.setMoney(46335);

        System.out.println("mynum is"+Obj.getNum());
        System.out.println("my acc is"+Obj.getAccount());
        System.out.println("mymoney is"+Obj.getMoney());
    }  }