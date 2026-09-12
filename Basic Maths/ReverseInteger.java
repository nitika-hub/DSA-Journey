class Solution {
    public int reverse(int x) {
        int temp = x;
        int remain = 0;
        long r_num = 0;
       while (temp!=0){
        remain = temp%10;
        r_num = r_num*10+remain;
        temp = temp/10;
       } 
       if(r_num<Integer.MIN_VALUE || r_num>Integer.MAX_VALUE){
            return 0;
        }
       return (int)r_num;
    }
}