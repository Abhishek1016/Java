import java.util.Scanner;
class LongestPalindrome
{
    public static String Palindrome(String str, int low, int high) {
        while (low >= 0 && high < str.length() && (str.charAt(low) == str.charAt(high))) {
            low--;
            high++;
        }
        return str.substring(low + 1, high);
    }
    public static String PalindromeSubstring(String str)
    {
        if(str == null || str.length() == 0){
            return str;
        }
        String maxStr = "", currStr;
        int maxLength= 0, currLength; //stores the maximum length of substring
        for (int i=0; i<str.length(); i++){
            currStr = Palindrome(str, i, i);
            currLength = currStr.length();
            if(currLength > maxLength){
                maxLength = currLength;
                maxStr = currStr;
            }
            currStr = Palindrome(str, i, i+1);
            currLength = currStr.length();
            if (currLength> maxLength){
                maxLength= currLength;
                maxStr = currStr;
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = "";
        str = S.next();
        System.out.println(PalindromeSubstring(str));
    }

}