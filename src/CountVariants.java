public class CountVariants {
    public static void main(String args[]) {
        int stairs = 12;
        System.out.println(countVariants(stairs));
    }

    static int countVariants(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        } else {
            return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
        }
    }
}