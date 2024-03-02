public class LongestPrefix {
    public static void main(String[] args) {
        String[] array={"extract","exhale", "excavate"};
        System.out.print(longestPrefix(array));
    }

    static String longestPrefix(String[] array) {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (!array[i].startsWith(prefix)) {
                if (prefix.isEmpty()) {
                    return "";
                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
