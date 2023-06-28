public class thirty2 {
    public static void main(String[] args) {

        for (int i = 100; i <= 200; i++) {
            for (int c = 2; c < i; c++) {
                if (i % c == 0) {
                    break;
                }
                System.out.println(i);
                break;
            }
        }
    }
    }

