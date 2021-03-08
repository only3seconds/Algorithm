package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author thinking-ppp 2020/8/5
 */
public class PhoneNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    while (sc.hasNextLine()) {
      list.add(sc.nextLine().toString());
    }


  }

}
