class Main{
    public static void main(String[] args){
        String s = "computer";

        Caesar c = new Caesar(3);
        System.out.println(s);
        String a =c.cipher(s);
        System.out.println(a);
         
        System.out.println( c.decipher(a));
    }
}