public class Sorted {
    public static boolean IfSort(int i,int arr[]){
        if(i==arr.length-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IfSort(i+1, arr);
    }
    public static void main(String[] args) {
        int  a[]={1,2,3,4,5,6};
        System.out.println(IfSort(0, a));
    }

    
}
