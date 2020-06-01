public class odajd {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == i - 1) {
                    System.out.println(i);
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
