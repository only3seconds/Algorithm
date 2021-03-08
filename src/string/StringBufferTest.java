package string;

/**
 * @author thinking-ppp 2020/8/26
 */
public class StringBufferTest {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("abc");
    char[] chars = {'d', 'e', 'f'};
    sb.append(chars, 1, 1);
    System.out.println(sb);
  }

}
