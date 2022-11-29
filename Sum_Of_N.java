public class Sum_Of_N {
    public static int SumOf_n(int n){
        if(n==0){
            return 0;
        }
       int sum=n+SumOf_n(n-1);
       return sum;
    
        
    }

    public static void main(String[] args) {
        int a=SumOf_n(5);
        System.out.println(a);
    }
        
    }
    
