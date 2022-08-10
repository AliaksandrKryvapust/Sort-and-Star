import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        String [] arr = new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        System.out.println(twoSort(arr).equals("b***i***t***c***o***i***n"));

    }
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String str = s[0];
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            res.append(str.charAt(i)).append("***");
        }
        res.append(str.charAt(str.length()-1));
        return res.toString();
    }
}
