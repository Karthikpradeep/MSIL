package p1;

public class CompilePoly {
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sum(int x,int y, int z){
        System.out.println(x+y+z);
    }
    public void sum(float d, float e){
        System.out.println(d+e);
    }
    public static void main(String[] args){
        CompilePoly obj = new CompilePoly();
        obj.sum(2,3);
        obj.sum(2,4,6);
        obj.sum(2.1f,3.2f);
    }
}
