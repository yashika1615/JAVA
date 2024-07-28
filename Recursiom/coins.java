package Recursiom;

public class coins {
    public static int coinsCombination(int n, String ans) {
        if (ans == 0) {
            System.out.println(ans);
            return;
        } else {
            int count = 0;
            if (!ans.endsWith("H")) {
                count += coinsCombination(n - 1, ans + "H");
            }
            count += coinsCombination(n - 1, ans + "T");
        }
    }

    public static void main(String[] args) {
        coinsCombination(n, null);
    }
}
