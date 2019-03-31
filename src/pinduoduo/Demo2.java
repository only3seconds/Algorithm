package pinduoduo;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            char c = 'z';
            for(int i =0;i< str.length();i++) {
                if(c == 'a') {
                    System.out.println(Character.toLowerCase(c));
                    return;
                } else if(-1 != str.indexOf(String.valueOf(str.charAt(i)),i+1)) {
                    if(Character.toLowerCase(str.charAt(i)) - c <0) {
                        c = Character.toLowerCase(str.charAt(i));
                    }
                } else if(Character.toLowerCase(str.charAt(i)) - c <0) {
                    c = Character.toLowerCase(str.charAt(i));
                    System.out.println(Character.toLowerCase(c));
                    return;
                }
            }
            System.out.println(Character.toLowerCase(c));
            return;
        }
    }
}
