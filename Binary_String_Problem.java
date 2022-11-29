public class Binary_String_Problem {
    //Print all possible binary string of size N without cosecutive ones......
        public static void WithoutConsecutiveOnes(int n,int LastPlace,String str){
            if(n==0){
                System.out.println(str);
                return;
          }
         WithoutConsecutiveOnes(n-1,0, str+"0");
         if(LastPlace==0){
            WithoutConsecutiveOnes(n-1, 1, str+"1");

         }
        }
    public static void main(String[] args) {
        WithoutConsecutiveOnes(3, 0, "");
        
    }
    
}
