package STRINGS;

import java.util.*;

public class Extractnumfromstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) < '9') {
                num = num * 10 + s.charAt(i) - '0';
                ans = Math.max(ans, num);
            } else {
                num = 0;
            }
        }
        System.out.println(ans);
    }
}
