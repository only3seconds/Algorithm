package array;

/**
 * @author thinking-ppp 2020/8/19
 */
public class CanPlaceFlowers {

  public static void main(String[] args) {
    int[] test = {1,0,0,0,1};
    System.out.println(canPlaceFlowers(test, 1));
  }
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        if (i == 0) {
          if (flowerbed[i+1] == 0) {
            flowerbed[i] = 1;
            count++;
          }

        } else if (i == flowerbed.length-1) {
          if (flowerbed[i-1] == 0) {
            flowerbed[i] = 1;
            count++;
          }

        } else {
          if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
            flowerbed[i] = 1;
            count++;
          }
        }
      }
    }

    return count >= n;
  }

}
