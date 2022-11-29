public class pATTERN_2 {
          public static void print(int row){
            if(row==0){
                return;
            }
            System.out.print("*");
            print(row-1);
        }
      public static void PrintPattern(int row){
            if(row==0){
                return;
            }
            print(row);
            System.out.println();
            
            PrintPattern(row-1);
        }
    
    
        public static void main(String[] args) {
            PrintPattern(5);
        }
    }
    

    

