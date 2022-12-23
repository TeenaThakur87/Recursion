public class SortedRotated_ArraySearch {
    public static int Search(int arr[], int si, int ei,int target){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //case found
        if(arr[mid]==target){
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid]){
        //case a: left 
        if(arr[si]<=target && target<=arr[mid]){
           return Search(arr, si, mid-1, target);

        }
            //case b:right
         else{
            return Search(arr, mid+1, ei, target);
         }
    }

        //mid on l2
        else{
            //case c: right
            if(arr[mid]<=target && target<=arr[ei]){
               return Search(arr, mid+1, ei, target);
            }
            //case d: left
            else{
               return Search(arr, si, mid-1, target);
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={6,7,8,0,1,2,3,4,5};
        int target=3;
        System.out.println(Search(arr, 0, arr.length-1,target));
       
        
    }
    
}
