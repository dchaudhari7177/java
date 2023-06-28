//wap to print first 50 prime numbers
public class thirty3 {

    public static void main(String[] args) {

        int num = 50, count;

        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }

        }
    }
}

