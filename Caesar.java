import java.util.*;
public class Caesar{
    private int n;

    public Caesar(int n){
        if(n < 1 || n > 25){
            throw new IllegalArgumentException();
        }
        this.n = n; 
    }

    public String cipher(String s){
         char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(!(Character.isLetter(s.charAt(i)))){
                 throw new IllegalArgumentException();
            }else{
                int a = (int)s.charAt(i) + n;
                c[i] =  (char)a;
              
            }

        }
        return String.valueOf(c);
    }

    public String decipher(String s){
         char[] c = s.toCharArray();
         for(int i = 0; i < s.length(); i++){
            if(!(Character.isLetter(s.charAt(i)))){
                 throw new IllegalArgumentException();
            }else{ 
                int a = (int)s.charAt(i) - n;
                c[i] =  (char)a;
              
            }

        }
        return String.valueOf(c);
    }


}