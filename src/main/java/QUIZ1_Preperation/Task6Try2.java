package QUIZ1_Preperation;

public class Task6Try2 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("ANAVOLIMILOVANA"));
        System.out.println(isPalindrome("KONTRAARTNOK"));
        System.out.println(isPalindrome("FARISGIGIC"));


    }

    public static Boolean isPalindrome(String str){

        for (int i=0, j=str.length()-1; i<=j; i++,j--){
            if(str.charAt(i)==str.charAt(j)){
                continue;

            }
            else{
                return false;
            }
        }
        return true;
    }
}
