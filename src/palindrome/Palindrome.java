package palindrome;

public class Palindrome {

    public static boolean isPalindrome(String str) {

        String removedSpaces = str.replaceAll(" ", "");

        removedSpaces = removedSpaces.replaceAll("\\.", "");
        removedSpaces = removedSpaces.toLowerCase();

        String ss = "";
        
        for (int i = removedSpaces.split("").length-1; i >= 0; i--) {
            
            ss = ss + removedSpaces.split("")[i];
            
           // System.out.println(removedSpaces.split("")[i]);
        }
        
       // System.out.println(ss);

        // System.out.println(removedSpaces);
        
        if(ss.equals(removedSpaces)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Noel sees Leon."));
    }
}
