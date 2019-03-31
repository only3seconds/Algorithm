//package huawei;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNext()) {
//            long n = sc.nextLong();
//            String str = sc.nextLine();
//
//            List<String> strList = new ArrayList<>();
//            char flag = str.charAt(0);
//            StringBuilder sb = new StringBuilder();
//
//            for (int i=0; i<str.length(); i++) {
//                if (str.charAt(i) == '0' || str.charAt(i) == '1') {
//                    if (flag == '0' && !sb.toString().isEmpty()) {
//                        strList.add(sb.reverse().toString());
//                    }
//                    sb = new StringBuilder();
//                    flag = str.charAt(i);
//                } else {
//                    sb.append(str.charAt(i));
//                }
//
//            }
//
//            if (!sb.toString().isEmpty()) {
//                if (flag == '0') {
//                    strList.add(sb.reverse().toString());
//                } else {
//                    strList.add(sb.toString());
//                }
//            }
//            for (int i=0; i<strList.size(); i++) {
//                if (i == 0) {
//                    System.out.print(strList.get(0));
//                } else {
//                    System.out.print(" " + strList.get(i));
//                }
//            }
//
//
//        }
//    }
//}
