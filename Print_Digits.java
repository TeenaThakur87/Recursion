public class Print_Digits {
    static String Digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintDigit(int num){
        if(num==0){
            return;
        }
        int lastdigit=(num%10); 
        PrintDigit(num/10);
       System.out.print(Digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        PrintDigit(1947);
    }
}
