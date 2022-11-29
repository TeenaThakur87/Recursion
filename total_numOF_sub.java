public class total_numOF_sub {
    //print total sub strings in which first and last characters are same.... 
    //ex: "aba"=a b a aba.
    public static int countSubstrs(String str,int i,int j,int n) {
        if(n==1) {
            return 1;
        }
        if(n<=0) {
            return 0;
        }
        int e=countSubstrs(str,i+1,j,n-1);
        int r=countSubstrs(str,i,j-1,n-1);
        int s=countSubstrs(str,i+1,j-1,n-2); 
        int res=e+r-s;
        if(str.charAt(i) ==str.charAt(j))  {
            res++;
        }
        return res;

    }
    public static void main(String[] args) {
        String str="abcab";
        System.out.println(countSubstrs(str, 0, 4, 5));
    }
    
}
