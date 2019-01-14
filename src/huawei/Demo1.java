package huawei;

// https://www.nowcoder.com/practice/fe298c55694f4ed39e256170ff2c205f?tpId=37&tqId=21245&tPage=2&rp=&ru=/ta/huawei&qru=/ta/huawei/question-ranking
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt(); //空瓶
            int count = 0; //汽水
            if (n > 0) {
                while (n > 1) {
                    int a = n / 3;
                    int b = n % 3;
                    count += a;
                    n = a + b;
                    if (n == 2) {
                        n++; //借一瓶
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
