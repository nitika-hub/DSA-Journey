class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(temp<0){
            return false;
        }
        int rev_num = 0;
        int remain = 0;
      while(temp!=0){
        remain = temp%10;
        rev_num = rev_num*10+remain;
        temp=temp/10;
      }  
      if(x==rev_num){
        return true;
      }
      else{
        return false;
      }
    }
}