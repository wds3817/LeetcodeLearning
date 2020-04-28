package LeetcodeLearning.src;

public class strStr {
    public static void main(String[] args) {
        String a = "afucker";
        String b = "fuck";
        strStr str = new strStr();
        int c = str.strStr(a, b);
        System.out.println(c);
    }
    public int strStr(String source, String target) {
        if (source == null || target == null) return -1;
        int i, j;
        for (i = 0; i < source.length() - target.length() + 1; i++) {
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
    }
}
