public class MinValue{
    public static void main(String[]args){
        int arr[]={1,1,3,5,2,8,9,12};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MinValue in Array : " + min);
    }

}