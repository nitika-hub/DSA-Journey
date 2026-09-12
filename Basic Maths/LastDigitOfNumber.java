import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int last_digit = Math.abs(n%10);
        System.out.println(last_digit);
    }
}