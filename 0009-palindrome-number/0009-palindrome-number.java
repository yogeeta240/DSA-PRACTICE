import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
         int rev=0;
         int original_number= x;
         boolean result;
        while(x>0){
            int last_digit = x%10;
            rev = (rev*10)+ last_digit;
                        x=x/10;
        }
        System.out.println("The reverse number is:"+ rev);
        return original_number==rev;
   

    }
    public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                            System.out.print("Enter a number:");
                            int  original_number = sc.nextInt();
                                    Solution s = new Solution();
                                    boolean result = s.isPalindrome(original_number);
         
         if (result==true){
            System.out.println("The number is palindrome.");
        }else{
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}