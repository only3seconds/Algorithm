package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 找出一个数组中最小的k个数
 */
public class PriorityQueueOperator {
    public static void main(String[] args) {
        int[] array = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(array, 4));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        if(input==null || input.length==0 || k > input.length || k <= 0){
            return result;
        }

        // 构建一个大小为 k 的大根堆
        PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll());
        }

        //如果需要按从小到大顺序输出的话。时间复杂度O(n)
        Collections.reverse(result);

        return result;
    }
}
