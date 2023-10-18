package p1;
public class loopExample {
    public static void main(String[] args){

        int arr[] ={2,1,4,5,7};
        int t =7;
        int i=0;
        for( i=0;i< arr.length;i++)
        {
            if(arr[i] == t ){
                System.out.println("Element found at index - " + i);
            }
        }
        int j=-4;

        do{
            System.out.println("Element found at index - "+ j);
            if(arr[j] == t){
                System.out.println("Element found at index - "+ j);
            }
            j--;
        }while(j>0);

    }
}
