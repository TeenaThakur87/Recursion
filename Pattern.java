public class Pattern {
    static void print(int cr){
        if(cr==0){
            return;
        }
        System.out.print("*");
        print(cr-1);
    }
    static void PrintPattern(int row,int cr){
        if(row==0){
            return;
        }
        print(cr);
        System.out.println();
        
        PrintPattern(row-1, cr+1);
    }

    
    public static void main(String[] args) {
        PrintPattern(5,1);
    }
}
