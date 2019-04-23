package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 拼多多笔试
 * 给定一个含有N个用户的朋友列表，对于一个指定用户，找出这个用户最可能认识的人，
 * 最可能认识的人的定义为这个人和当前用户不是朋友关系，但有最多的共同朋友。
 * 朋友关系是相互的（如果A列出B为朋友，B也会列出A为朋友），
 * 如果两个用户都有同样多的共同朋友，返回用户序号（从0开始）小的用户。
 * 如果用户和所有人都没有共同朋友，返回-1。
 * 输入：
 * 第一行两个数，第一个数表示用户数目N（N小于等于100），第二个数为需要判断的用户序号。第2至N+1行表示序号为0到序号为N-1的每个用户的朋友序号列表，每个列表长度小于100。
 * 输出：
 * 给定用户最可能认识的人的用户序号
 * 输入：
 * 5 0
 * 1 2 3
 * 0 4
 * 0 4
 * 0 4
 * 1 2 3
 * 输出：
 * 4
 * 说明：
 * 用户0与用户1、2、3都相互认识，用户4与用户1、2、3都相互认识
 */
public class FriendRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> friendMap = new HashMap<>();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] strs = sc.nextLine().split(" ");

            for (int j = 0; j < strs.length; j++) {
                list.add(Integer.parseInt(strs[j]));
            }

            //只村target和不是target的朋友
            if(i == target || !list.contains(i)) {
                friendMap.put(i, list);
            }
        }

        ArrayList<Integer> targetFriends = friendMap.get(target);
        int maxCount = 0;
        int maxIndex = -1;

        for (Map.Entry<Integer, ArrayList<Integer>> entry : friendMap.entrySet()) {
            int count = 0;

            if (entry.getKey() != target) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    if (targetFriends.contains(entry.getValue().get(i))) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxIndex = entry.getKey();
                }
            }
        }

        System.out.println(maxIndex);
    }

}
