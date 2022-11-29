public class Contiguous_Substring {
    public static void Check_String(String str,int index,char letter,StringBuilder newStr){
        if(index==str.length()-1){
            return;
        }       
        if(letter!=str.charAt(index)){
            newStr.append(str.charAt(index));

        }
        else{
            
            System.out.print(newStr.append(str.charAt(index))+" ");
        }
        Check_String(str, index+1, letter, newStr);

    }
    public static void substring(String str,int index){
        if(index==str.length()){
            return;
        }
        char letter=str.charAt(index);
        Check_String(str, index, letter,new StringBuilder(""));
        substring(str, index+1);
       
 }
    public static void main(String[] args) {
        substring("abacadab",0);
    }
    
}
