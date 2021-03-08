package string;

/**
 * @author thinking-ppp 2020/7/19
 */
public class LongestPre {

  public String longestCommonPrefix(String[] strs) {
    StringBuffer sb = new StringBuffer();
    int minLen = strs[0].length();
    for(int i = 1; i < strs.length; i++) {
      if(strs[i].length() < minLen) {
        minLen = strs[i].length();
      }
    }

    for(int i = 0; i < minLen; i++) {
      Character ch = strs[0].charAt(i);

      int j = 1;
      for (; j < strs.length; j++) {
        //只要有一个不等
        if(strs[j].charAt(i) != ch) {
          return sb.toString();
        }
      }

      //全部都等
      if (j == strs.length + 1) {
        sb.append(ch);
      }
    }

    return sb.toString();

  }

}
