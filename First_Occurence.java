public class First_Occurence {
    public static int FirtOccur(int arr[],int i,int key){
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        int a=FirtOccur(arr, i+1, key);
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,4,5,6,7};
        System.out.println(FirtOccur(a, 0, 5));
    }
    
}
