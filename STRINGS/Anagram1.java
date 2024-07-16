import java.util.*;

public class Anagram1 {
    public static boolean isAnagram(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        int n1 = a.length;
        int n2 = b.length;
        if (n1 != n2)
            return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n1; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s, t));
    }

}
