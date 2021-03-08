package greedy;

/**
 * @author thinking-ppp 2020/8/18
 */
public class PostMan {

  public static void main(String[] args) {
    int[] mails = {1, 0, 1, 0, 0, 1, 0, 1};
    System.out.println(minPostMan(mails));

  }

  public static int minPostMan(int[] mails) {
    if (mails == null || mails.length == 0) {
      return 0;
    }

    int res = 0;
    for (int i = 0; i < mails.length; i++) {
      if (mails[i] == 1) {
        res++;
        i = i + 3;

      } else {

      }
    }

    return res;
  }

}
