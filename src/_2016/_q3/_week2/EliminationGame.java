package _2016._q3._week2;
//#390
public class EliminationGame {
    static int lastRemaining(int n) {
        int start = 1, step = 1, remain = n;
        boolean right = true;
        while (remain > 1) {
            if (right || remain % 2 == 1) start += step;
            remain /= 2;
            step *= 2;
            right = !right;
        }
        return start;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(lastRemaining(n));
    }
}
