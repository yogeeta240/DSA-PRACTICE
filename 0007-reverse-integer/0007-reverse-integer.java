class Solution{
    public int reverse(int n){
           long rev =0;
        while(n!=0){
            int last_digit = n%10;
            System.out.println("The last digits are: "+ last_digit);
             n=n/10;
          rev = (rev*10)+ last_digit;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
    return 0;
}
    System.out.println ("The reverse number is:"+ rev);
    return (int)rev;
    }
      public static void main(String[]args){
        Solution s = new Solution();
        s.reverse(10400);
    }
    
}