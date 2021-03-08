package string;

/**
 * @author thinking-ppp 2020/7/19
 */
public class ReverseWords {

  public static void main(String[] args) {
    String s = "a good   example";
    System.out.println(reverseWords(s));

  }
  public static String reverseWords(String s) {
    String[] strs = s.split(" ");

    for (int i = 0; i < strs.length; i++) {
      System.out.printf(strs[i] + ",");
    }

    StringBuffer sb = new StringBuffer();
    for(int i = strs.length-1; i >= 0; i--) {
      //System.out.printf(strs[i]);
      if (!strs[i].equals(" "))
      if(strs[i].length() != 0) {
        sb.append(strs[i]);
        sb.append(" ");
      }
    }

    return sb.toString().trim();

  }

}
