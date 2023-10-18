package p1;
public class a {
    public int age = 22;
    protected void msg() {
        System.out.println(age);
    }
}
 class b {
    public static void main(String[] args){
        a obj = new a();
        obj.msg();
    }
}
