# 数据结构和算法

## 一.数据结构

### 1. 数组

- 数组具有随机访问特性，灵活使用数组的索引；

- 数组有序的话，问题往往会变得简单；

- 对于有序或局部有序的一维数组，要想到二分查找算法,并学会随机应变；

- 遍历二维数组，用行指针和列指针，通过行列指针移动定位某个特定的元素；

- 对于元素特殊的数组，注意寻找特殊点，比如有序的临界点，二维数组的四个角；

- 对于二维数组，定位某个特定元素需要 行指针i和列指针j；定位一个二维数组的子数组则需要 row1,row2,col1,col2. 

- 注意二维数组只有一行或一列的特殊情况。

- 数组的快速排序算法要熟记于心，并且注意partition函数的应用,partition函数每次确定一个元素（记作target)的最终位置，并返回该位置，该位置之前的元素都小于target,该位置之后的元素都大于 target。我们可以判断该返回位置是否满足一定条件来提前结束快速排序。

- 对数组排序可以用 Arrays.sort(array, new Comparator<>())，并且可以自定义比较器，很强大～

**剑指Offer**

[二维数组中的查找](https://blog.csdn.net/journey_TripleP/article/details/89574463)

[旋转数组的最小数字](https://blog.csdn.net/journey_TripleP/article/details/89574588)

[调整数组的顺序使奇数位于偶数前面](https://blog.csdn.net/journey_TripleP/article/details/89574737)

[顺时针打印矩阵](https://blog.csdn.net/journey_TripleP/article/details/89574843)

[数组中出现次数超过一半的数字](https://blog.csdn.net/journey_TripleP/article/details/89574940)

[最小k个数](https://blog.csdn.net/journey_TripleP/article/details/89575026)

[连续子数组的最大和](https://blog.csdn.net/journey_TripleP/article/details/89575071)

[把数组排成最小的数](https://blog.csdn.net/journey_TripleP/article/details/89575130)

[丑数](https://blog.csdn.net/journey_TripleP/article/details/89606757)

[数组中的逆序对](https://blog.csdn.net/journey_TripleP/article/details/89643268)

[数字在排序数组中的出现的次数](https://blog.csdn.net/journey_TripleP/article/details/89645876)

[数组中只出现一次的数字](https://blog.csdn.net/journey_TripleP/article/details/89706485)

[和为S的两个数字](https://blog.csdn.net/journey_TripleP/article/details/89708647)

[扑克顺子](https://blog.csdn.net/journey_TripleP/article/details/89711371)

[数组中重复的数字](https://blog.csdn.net/journey_TripleP/article/details/89891013)

[构建乘积数组](https://blog.csdn.net/journey_TripleP/article/details/89914801)

[滑动窗口的最大值](https://blog.csdn.net/journey_TripleP/article/details/89919647)

[矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

**经典题目**

[寻找一个数组中出现次数最多的元素]()


### 2. 链表 

- 链表递归遍历；

- ArrayList 的 add(index, elem)方法可以用来逆序存储链表的值；

- 链表中经常使用快慢指针slow和fast解决一些问题；

- 链表中常用三指针法进行修改指针等操作；

- 灵活使用链表的头插法、尾插法；

- 链表中插入一个结点，要先挂后断.

**剑指Offer**

[从尾到头打印列表](https://blog.csdn.net/journey_TripleP/article/details/89964446)

[链表中倒数第k个节点](https://blog.csdn.net/journey_TripleP/article/details/89968190)

[反转链表](https://blog.csdn.net/journey_TripleP/article/details/89971491)

[合并两个排序的链表](https://blog.csdn.net/journey_TripleP/article/details/90025067)

[复杂链表的复制](https://blog.csdn.net/journey_TripleP/article/details/90108383)

[两个链表的第一个公共节点](https://blog.csdn.net/journey_TripleP/article/details/90109949)

[链表中环的入口结点](https://blog.csdn.net/journey_TripleP/article/details/90200947)

[删除链表中重复的结点](https://blog.csdn.net/journey_TripleP/article/details/90230860)

**经典题目**

[判断一个链表是否有环](https://blog.csdn.net/journey_TripleP/article/details/90200947)

### 3. 栈和队列 5,7,9,20,21,22,30,31

**剑指Offer**

[用两个栈实现队列](https://blog.csdn.net/journey_TripleP/article/details/90232236)

[包含min函数的栈](https://blog.csdn.net/journey_TripleP/article/details/90233293)

[栈的压入弹出序列](https://blog.csdn.net/journey_TripleP/article/details/90260840)

[滑动窗口的最大值](https://blog.csdn.net/journey_TripleP/article/details/89919647)

### 4. 树

- 树的算法常用递归结构(递归一定要注意递归出口）；

- 掌握树的常用遍历算法：先序、中序和后序遍历；层次遍历；

- 树的深度优先遍历（DFS）就是先序遍历，树的广度优先遍历（BFS）就是层次遍历。



**剑指Offer**

[重建二叉树](https://blog.csdn.net/journey_TripleP/article/details/90379434)

[树的子结构](https://blog.csdn.net/journey_TripleP/article/details/90511948)

[二叉树的镜像](https://blog.csdn.net/journey_TripleP/article/details/90513648)

[从上往下打印二叉树](https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树的后序遍历序列](https://blog.csdn.net/journey_TripleP/article/details/90514175)

[二叉树中和为某一值的路径](https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉搜索树与双向链表](https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5?tpId=13&tqId=11179&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树的深度](https://www.nowcoder.com/practice/435fb86331474282a3499955f0a41e8b?tpId=13&tqId=11191&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[平衡二叉树](https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=13&tqId=11192&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树的下一个结点](https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e?tpId=13&tqId=11210&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[对称的二叉树](https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb?tpId=13&tqId=11211&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[按之字形顺序打印二叉树](https://www.nowcoder.com/practice/91b69814117f4e8097390d107d2efbe0?tpId=13&tqId=11212&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[把二叉树打印成多行](https://www.nowcoder.com/practice/445c44d982d04483b04a54f298796288?tpId=13&tqId=11213&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[序列化二叉树](https://www.nowcoder.com/practice/cf7e25aa97c04cc1a68c8f040e71fb84?tpId=13&tqId=11214&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉搜索树的第K个节点](https://www.nowcoder.com/practice/ef068f602dde4d28aab2b210e859150a?tpId=13&tqId=11215&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 5. 堆

**剑指Offer**

[最小k个数](https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tqId=11182&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

**经典题目**

[Java 实现](https://github.com/only3seconds/Algorithm/tree/master/src/heap)

### 6. 字符串 2,4,5,12,20,27,28,34,43,44,46,49,50,52,53,58,67

**剑指Offer**

[替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[字符串的排列](https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[第一个只出现一次的字符](https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[左旋转字符串](https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&tqId=11196&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[翻转单词顺序列](https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&tqId=11197&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[把字符串转换成整数](https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e?tpId=13&tqId=11202&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[正则表达式匹配](https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c?tpId=13&tqId=11205&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[表示数值的字符串](https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2?tpId=13&tqId=11206&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[字符流中第一个不重复的字符](https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720?tpId=13&tqId=11207&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)
## 二. 常见算法

### 1. 位运算 15

**剑指Offer**

[二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数组中只出现一次的数字](https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tqId=11193&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[不用加减乘除做加法](https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215?tpId=13&tqId=11201&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

**其他**
[数组a中只有一个数出现一次，其他数字都出现了3次，找出这个数字]()


### 2. 查找 4,8,11,50,53

[寻找一个数组中出现次数最多的元素]()

### 3. 排序 39,40

**经典排序算法**

[冒泡排序]()
[快速排序]()
[归并排序]()

**剑指Offer**

[调整数组的顺序使奇数位于偶数前面](https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 4. 递归

- 思考递归的时候一定不要去一步一步看它执行了什么，思考的正确打开方式应该是，首先假设子问题都已经完美处理，我们只需要处理一下最终的问题即可。子问题的处理方式与最终那个处理方式一样，只需要将问题规模要以1的进制缩小。最后一定要注意一下递归出口条件。

[斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[跳台阶](https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[变态跳台阶](https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[矩形覆盖](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 5. 分治

[快速排序]()
[归并排序]()


### 6. 动态规划 9,31,34,45

[连续子数组的最大和](https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=13&tqId=11183&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 7. 回溯法 66,67

[矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[机器人的运动范围](https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8?tpId=13&tqId=11219&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)



### 其他

**剑指Offer**

[整数中1出现的次数](https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6?tpId=13&tqId=11184&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[和为s的连续正数序列](https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&tqId=11194&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[孩子们的游戏](https://www.nowcoder.com/practice/f78a359491e64a50bce2d89cff857eb6?tpId=13&tqId=11199&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[求1+2+3+•••+n](https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1?tpId=13&tqId=11200&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数据流中的中位数](https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1?tpId=13&tqId=11216&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


