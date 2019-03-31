
import java.util.*;

public class Demo3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long d = input.nextLong();

        List<Bank> backList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            long b = input.nextLong();
            backList.add(new Bank(a, b));
        }

        handleBank(backList, n, d);
    }

    public static void handleBank(List<Bank> backListA, int n, long d) {
        long maxPrice = 0L;

        Collections.sort(backListA, new MyComprator());

        for (int i = 0, j = 0; i < n && j < n; ) {
            if (backListA.get(i).position - backListA.get(j).position > d) {
                maxPrice = Math.max(maxPrice, backListA.get(i).price + backListA.get(j).price);
                for (int m = j + 1; m < n; m++) {
                    if (backListA.get(i).position - backListA.get(m).position > d) {
                        maxPrice = Math.max(maxPrice, backListA.get(i).price + backListA.get(m).price);
                    }
                }
                i++;
            } else {
                j++;
            }
        }

        System.out.println(maxPrice);
    }


    private static class Bank {
        public long position;
        public long price;

        public Bank(long a, long b) {
            this.position = a;
            this.price = b;
        }
    }

    public static class MyComprator implements Comparator {

        @Override
        public int compare(Object arg0, Object arg1) {
            Bank t1 = (Bank) arg0;
            Bank t2 = (Bank) arg1;

            return (int) (t2.position - t1.position);
        }
    }
}