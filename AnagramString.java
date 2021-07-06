import java.util.*;

class CheckAnagramClass {

    boolean CheckAnagram(String S1, String S2) {

        int Count1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int Count2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        if (S1.length() != S2.length()) {
            return false;
        }

        char arr[] = S1.toCharArray();
        char brr[] = S2.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            Count1[arr[i] - 'a']++;
            Count2[brr[i] - 'a']++;

        }

        for (int i = 0; i < 26; i++) {

            if (Count1[i] != Count2[i]) {
                return false;
            }
        }

        return true;

    }
}

public class AnagramString {

    public static void main(String[] args) {

        String S1, S2;
        boolean Anagram;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the First string: ");
        S1 = sc.nextLine();
        System.out.println("Please enter the Second string: ");
        S2 = sc.nextLine();

        CheckAnagramClass obj = new CheckAnagramClass();
        Anagram = obj.CheckAnagram(S1, S2);
        if (Anagram) {
            System.out.println("Both Strings are Anagram");
        } else {
            System.out.println("Both Strings are not Anagram");
        }

    }
}