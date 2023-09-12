public class Multiples {
    public static void main(String[] args) {
        int multiplesOf3and5 = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiplesOf3and5 += 1;
            }
            }
        System.out.println(multiplesOf3and5);
        }
    }

