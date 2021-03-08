package test;

import java.util.Scanner;

public class Cisco1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uri = sc.nextLine().toString();

        int index = uri.indexOf("<sip:");
        uri = uri.substring(0, index);
        //System.out.println("uri: " + uri);

        int index1 = 0;
        int index2 = uri.length()-1;

        for (int i = 0; i < uri.length(); i++) {
            Character c = uri.charAt(i);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
                index1 = i;
                break;
            }
        }

        for (int j = uri.length()-1; j >= 0; j--) {
            Character c = uri.charAt(j);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
                index2 = j;
                break;
            }
        }

        //"%22Cisco%22"<sip:10000@189.9.0.7>
        System.out.println(uri.substring(index1, index2+1));
    }
}
