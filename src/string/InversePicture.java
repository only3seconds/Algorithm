package string;

/**
 * @author thinking-ppp 2021/2/24
 */
public class InversePicture {

  public static void main(String[] args) {
    int[][] test = {{1, 1, 0}, {0, 0, 1}, {0, 0, 0}};
    int[][] result = flipAndInvertImage(test);
  }

  public static int[][] flipAndInvertImage(int[][] A) {
    int[][] result = new int[A.length][A[0].length];

    for (int i = 0; i < A.length; i++) {
      StringBuffer sb = new StringBuffer();
      for (int j = 0; j < A[0].length; j++) {
        sb.append(A[i][j]);
      }
      sb.reverse();

      for (int k = 0; k < sb.toString().length(); k++) {
        int s = Integer.valueOf(sb.toString().substring(k,k+1));
        if (s == 0) {
          result[i][k] = 1;
        } else {
          result[i][k] =0;
        }

      }

    }

    return result;

  }

}
