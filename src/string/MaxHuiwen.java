package string;

/**
 * @author thinking-ppp 2020/7/19
 */
public class MaxHuiwen {

  public static void main(String[] args) {
    String s = "babad";
    longestPalindrome(s);

  }
  public static String longestPalindrome(String s) {
    int len = s.length();
    for (int i = len; i >= 2; i--) {
      //System.out.println(i);
      for (int j = 0; j+i-1 < s.length(); j++) {
        String tar = s.substring(j, j+i);
        //System.out.println(tar);
        if (isHuiwen(tar)) {
          return tar;
        }

      }
    }

    return "";


  }

  public static boolean isHuiwen(String s) {
    StringBuffer sb = new StringBuffer(s);
    String reverseStr = sb.reverse().toString();

    return s.equals(reverseStr);
  }

}
