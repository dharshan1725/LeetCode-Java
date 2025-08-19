import java.util.*;
public class Main{
    public static void main(String[] args){
        int arr[]={9,28,22,8,2,1};
        for(int i=0;i<arr.length;i++){
        int MinIndex=i;
        for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[MinIndex])
        {
             MinIndex=j;
        }
        }
            int temp = arr[i];
            arr[i]=arr[MinIndex];
            arr[MinIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}