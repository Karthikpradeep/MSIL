package p1;
class Math{
    public void Mul(int a,int b){
        System.out.println(a*b);
    }

}
public class LifeOfObject {
    public static void main(String[] args){
        Math obj = new Math();
        obj.Mul(2,3);
        obj = null;
        System.gc();


    }
}
