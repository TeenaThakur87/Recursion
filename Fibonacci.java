public class Fibonacci {
    public static int FibSum(int n){
        if(n==0||n==1){
            return n;
        }
        int fibm2=FibSum(n-1);
        int fibm1=FibSum(n-2);
        int fib=fibm1+fibm2;
        return fib;

        
    }
    public static void main(String[] args) {
        System.out.println(FibSum(25));
    }
    
}
