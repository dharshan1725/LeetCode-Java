import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elememts: ");
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }

         System.out.println("enter the element to search: ");
         int key=sc.nextInt();

         int result=linearSearch(arr,key);

         if(result!=-1){
            System.out.println("Element found at index: " + result);
         }
         else{
            System.out.println("Element not found fucck you");
         }
    }
    public static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
      }
    }
      return -1;
    }
}