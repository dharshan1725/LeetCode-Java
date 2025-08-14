import java.util.*;
public class RearrangeAlternate{
    public static void main(String[] args) {
    int arr[]={2,-3,-4,3,5,6};
    System.out.println(Arrays.toString(RearrangeArray(arr)));
    }
    public static int[] RearrangeArray(int[] arr){
        int n=arr.length;
        ArrayList<Integer> positive= new ArrayList<>();
        ArrayList<Integer> negative= new ArrayList<>();
        for(int i=0;i<n;i++){
         if(arr[i]>0){
            positive.add(arr[i]);
         }
         else{
            negative.add(arr[i]);
         }
        }
        if(positive.size()>negative.size()){
            for(int i=0;i<negative.size();i++){
            arr[i*2]=positive.get(i);
            arr[i*2+1]=negative.get(i);
            }
            int index=negative.size()*2;
            for(int i=negative.size();i<positive.size();i++){
            arr[index]=positive.get(i);
            index++;
            }
        }
        else{
            for(int i=0;i<positive.size();i++){
            arr[i*2]=positive.get(i);
            arr[i*2+1]=negative.get(i);
            }
            int index=positive.size()*2;
            for(int i=positive.size();i<negative.size();i++){
            arr[index]=negative.get(i);
            index++;
            }
        }
       return arr;
    }
}