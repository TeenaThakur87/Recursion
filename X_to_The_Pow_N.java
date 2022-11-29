public class X_to_The_Pow_N {
    public static int Pow(int i,int n){
        if(n==0){
            return 1;
        }
        int Half=Pow(i, n/2);
        int Power=Half*Half;
        if(n%2!=0){
             Power=i*Half*Half;
        }
        return Power;

    }
    public static void main(String[] args) {
        System.out.println(Pow(2, 5));
    }
}
