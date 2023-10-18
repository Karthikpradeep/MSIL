package p1;
class MobileDevices{
    void iPhone(){
        System.out.println("This is iphone 15 ....");
    }
    void iPad(){
        System.out.println("This is ipad air .....");
    }
    String iphone = "";
}
public class apple {
    public static void main(String[] args){
        MobileDevices m = new MobileDevices();
        m.iPhone();
        m.iPad();
        m.iphone ="Iphone 14";
        System.out.println("Name of the phone - "+ m.iphone);
    }
}
