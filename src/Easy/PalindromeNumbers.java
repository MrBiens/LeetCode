package Easy;
// đảo ngược số
public class PalindromeNumbers {
    public boolean isPalindrome(int x){
        if(x <0){
            return false;
        }
        int original = x;
        int reversed =0;
        while(x != 0){
            int digit= x % 10 ; //121 -> 1.digit = 1  ; 2. = 2 ; 3.=1
            x = x/10; // giảm số lượng pt
            reversed = reversed * 10 + digit; // 1 2 1
        }
        return original==reversed;
    }
    public static void main(String[] args) {
        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();
        System.out.println(palindromeNumbers.isPalindrome(121));
        System.out.println(palindromeNumbers.isPalindrome(1234));
        System.out.println(palindromeNumbers.isPalindrome(-121));
    }
}
