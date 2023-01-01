package _leetcode._2023._q1._01Jan;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }
    static int countDigits(int num) {
        int temp = num, count = 0;
        while (temp != 0) {
            int d = temp % 10;
            temp /= 10;
            if (d > 0 && num % d == 0)
                count++;
        }
        return count;
    }
}
