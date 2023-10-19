package p1;
class india{
    public void Language() {
        System.out.println("I can speak multiple languages");
    }
}
class kerala extends india{
    @Override
    public void Language() {
        System.out.println("I can speak malayalam");
    }
}
class tamilNadu extends india{
    public void Language() {
        System.out.println("I can speak tamil");
    }
}
public class RunPoly {
    public static void main(String[] args){
        india obj = new india();
        india obj1 = new kerala();
        obj.Language();
        obj1.Language();
    }
}
