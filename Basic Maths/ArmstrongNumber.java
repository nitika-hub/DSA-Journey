class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int count = 0;
        while(temp>0){
            count +=1;
            temp = temp/10;
        }
        temp =n;
        int num=0;
        int arm =0;
        int sum = 0;
        while(temp>0){
            num = temp%10;
            arm = (int)Math.pow(num,count);
            temp = temp/10;
            sum += arm;
        }
        if(sum == n){
            return true;
            
        }
        else{
            return false;
        }
    }
}