package string;

import java.util.Arrays;

/**
 * @author thinking-ppp 2020/7/26
 */
class Solution {
  public int countCharacters(String[] words, String chars) {
    int[] alph = new int[26];
    int result = 0;

    for (int i = 0; i < chars.length(); i++) {
      char ch = chars.charAt(i);
      alph[ch - 'a']++;
    }

    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      int[] tempAlph = Arrays.copyOfRange(alph, 0, alph.length);
      int j = 0;
      for (; j < word.length(); j++) {
        if (tempAlph[word.charAt(j) - 'a'] > 0) {
          tempAlph[word.charAt(j) - 'a']--;
        } else {
          break;
        }
      }

      if (j == word.length()) {
        result += word.length();
      }
    }
    return result;

  }
}
