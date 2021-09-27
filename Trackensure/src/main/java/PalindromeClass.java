
class PalindromeClass {

    public static void main(String args[]){
        int example1 = 323;
        int example2 = -45;

        solve(example1);
        solve(example2);
    }

    public static boolean solve(int k){
        int sum = 0;
        int temp, m;

        temp = k;
        while(k > 0) {
            m = k % 10;
            sum = (sum * 10) + m;
            k = k/10;
        }
        if(temp==sum) {
            System.out.println(temp + " is palindrome number ");
            return true;
        } else {
            System.out.println(temp + " is not palindrome");
            return false;
        }
    }
}