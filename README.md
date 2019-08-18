# 数据结构

## 一. 线性表

### 1. 数组

- 数组具有随机访问特性，灵活使用数组的索引

- 数组有序的话，问题往往会变得简单

- 对于有序或局部有序的一维数组，要想到二分查找算法,并学会随机应变

- 对于元素特殊的数组，注意寻找特殊点，比如有序的临界点，二维数组的四个角

- 对于二维数组，定位某个特定元素需要 行指针i和列指针j；定位一个二维数组的子数组则需要 row1,row2,col1,col2

- 注意二维数组只有一行或一列的特殊情况

- 数组的快速排序算法要熟记于心，并且注意partition函数的应用,partition函数每次确定一个元素（记作target)的最终位置，并返回该位置，该位置之前的元素都小于target,该位置之后的元素都大于 target。我们可以判断该返回位置是否满足一定条件来提前结束快速排序。

- 对数组排序可以用 Arrays.sort(array, new Comparator<>())，并且可以自定义比较器

**专题一：二分查找及其变形**

### 2. 链表

- 链表递归遍历

- ArrayList 的 add(index, elem)方法可以用来逆序存储链表的值

- 链表中经常使用快慢指针 slow和fast 解决一些问题

- 链表中常用三指针法进行修改指针等操作

- 灵活使用链表的头插法、尾插法

- 链表中插入一个结点，要先挂后断


## 二. 栈和队列

- 栈是一种先进后出的数据结构，队列是一种先进先出的数据结构


## 三. 树和二叉树

- 树的算法常用递归结构(递归一定要注意递归出口）

- 掌握树的常用遍历算法：深度优先遍历（先序、中序、后序）；广度优先遍历（层次遍历）

- 二叉树：二叉树是每个节点最多有两个子树的树结构
	
- 满二叉树： 高度为h，并且由2{h} –1个结点的二叉树，被称为满二叉树

- 完全二叉树：一棵二叉树中，只有最下面两层结点的度可以小于2，并且最下一层的叶结点集中在靠左的若干位置上。这样的二叉树称为完全二叉树。
	
- 二叉排序树（二叉搜索树）：左子树结点值＜根结点值＜右子树结点值。所以，对二叉排序树进行中序
遍历，可以得到一个递增的有序序列

- 平衡二叉树：任意结点的左、右子树高度差的绝对值不超过1，将这样的二叉树称为平衡二叉树，简称平衡树（AVL树）。

### 1. 二叉树

#### （1）二分查找法

#### （2）二叉树遍历


### 2. 二分搜索树

#### （1）深度优先遍历（前序、中序、后序遍历）

#### （2）广度优先遍历（层次序列）

### 3. AVL树

**平衡二叉树的插入调整规则**

	（1）插入点位于X的左子节点的左子树——左左 -> 右单旋；
	（2）插入点位于X的左子节点的右子树——左右 -> 自下而上，先左后右；
	（3）插入点位于X的右子节点的左子树——右左 -> 自下而上，先右后左 ；
	（4）插入点位于X的右子节点的右子树——右右 -> 左单旋.

### 4. 红黑树

**（1）为什么需要红黑树？**

普通的二叉查找树在极端情况下可退化成链表，此时的增删查效率都会比较低下。为了避免这种情况，就出现了一些自平衡的查找树，比如 AVL，红黑树等。这些自平衡的查找树通过定义一些性质，将任意节点的左右子树高度差控制在规定范围内，以达到平衡状态。
	
**（2）红黑树的性质**

1. 节点是红色或黑色。
2. 根是黑色。
3. 所有叶子都是黑色（叶子是NIL节点）。
4. 每个红色节点必须有两个黑色的子节点。（从每个叶子到根的所有路径上不能有两个连续的红色节点。）
5. 从任一节点到其每个叶子的所有简单路径都包含相同数目的黑色节点（简称黑高）。

性质4和性质5可保证任意节点到其每个叶子节点路径最长不会超过最短路径的2倍。

**（3）插入操作**

插入的节点是红色的。
	
（1）如果插入的是根结点，直接把此结点涂为黑色； 

（2）如果插入结点（N）的父结点(P)是黑色，直接插入红色节点即可；

（3）如果插入节点（N）的父结点（P）是红色且叔叔节点（U）是红色 -> 变色即可；

（4）如果插入节点（N）的父结点（P）是红色且叔叔节点（U）是黑色，插入节点是其父节点的左子 -> 父节点（P）变为黑色，祖父节点（G）变为红色，在祖父节点（G）为支点右旋。【变色+右旋】

（5）如果插入节点（N）的父结点（P）是红色且叔叔节点（U）是黑色，插入节点是其父节点的右子 -> 左旋，变成（4）的情况。

[红黑树详解](https://www.cnblogs.com/yyxt/p/4983967.html) 

### 5. B 和 B+ 树

## 四. 字符串和数组

# 算法思想

## 一. 排序

### 1. 选择排序

### 2. 插入排序

### 3. 冒泡排序

### 4. 快速排序

#### （1）普通快速排序

#### （2）双路快速排序

#### （3）三路快速排序

### 5. 希尔排序

### 6. 归并排序

### 7. 堆排序

#### （1）堆

[Java 实现](https://github.com/only3seconds/Algorithm/tree/master/src/heap)

#### （2）上浮和下沉

#### （3）插入元素

#### （4）删除最大元素

#### （5）堆排序

#### （6）堆排序的应用-TopK问题

### 8. 计数排序和流排序

### 9. 排序算法总结

## 二. 递归和回溯法

- 思考递归的时候一定不要去一步一步看它执行了什么，思考的正确打开方式应该是，首先假设子问题都已经完美处理，我们只需要处理一下最终的问题即可。子问题的处理方式与最终那个处理方式一样，只需要将问题规模要以1的进制缩小。最后一定要注意一下递归出口条件。

## 三. 动态规划

### 1. 斐波那契数列

### 2. 背包问题

### 3. 最长上升子序列

### 4. 最长公共子序列

## 四. 贪心算法

# 练习题

## 一. 剑指Offer

### 1. 数组

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

### 2. 链表 

[从尾到头打印列表](https://blog.csdn.net/journey_TripleP/article/details/89964446)

[链表中倒数第k个节点](https://blog.csdn.net/journey_TripleP/article/details/89968190)

[反转链表](https://blog.csdn.net/journey_TripleP/article/details/89971491)

[合并两个排序的链表](https://blog.csdn.net/journey_TripleP/article/details/90025067)

[复杂链表的复制](https://blog.csdn.net/journey_TripleP/article/details/90108383)

[两个链表的第一个公共节点](https://blog.csdn.net/journey_TripleP/article/details/90109949)

[链表中环的入口结点](https://blog.csdn.net/journey_TripleP/article/details/90200947)

[删除链表中重复的结点](https://blog.csdn.net/journey_TripleP/article/details/90230860)

### 3. 栈和队列

[用两个栈实现队列](https://blog.csdn.net/journey_TripleP/article/details/90232236)

[包含min函数的栈](https://blog.csdn.net/journey_TripleP/article/details/90233293)

[栈的压入弹出序列](https://blog.csdn.net/journey_TripleP/article/details/90260840)

[滑动窗口的最大值](https://blog.csdn.net/journey_TripleP/article/details/89919647)

### 4. 树

[重建二叉树](https://blog.csdn.net/journey_TripleP/article/details/90379434)

[树的子结构](https://blog.csdn.net/journey_TripleP/article/details/90511948)

[二叉树的镜像](https://blog.csdn.net/journey_TripleP/article/details/90513648)

[从上往下打印二叉树](https://blog.csdn.net/journey_TripleP/article/details/90514175)

[二叉搜索树的后序遍历序列](https://blog.csdn.net/journey_TripleP/article/details/90634500)

[二叉树中和为某一值的路径](https://blog.csdn.net/journey_TripleP/article/details/90639481)

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

[最小k个数](https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=13&tqId=11182&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 6. 字符串

[替换空格](https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[字符串的排列](https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&tqId=11180&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[第一个只出现一次的字符](https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&tqId=11187&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[左旋转字符串](https://www.nowcoder.com/practice/12d959b108cb42b1ab72cef4d36af5ec?tpId=13&tqId=11196&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[翻转单词顺序列](https://www.nowcoder.com/practice/3194a4f4cf814f63919d0790578d51f3?tpId=13&tqId=11197&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[把字符串转换成整数](https://www.nowcoder.com/practice/1277c681251b4372bdef344468e4f26e?tpId=13&tqId=11202&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[正则表达式匹配](https://www.nowcoder.com/practice/45327ae22b7b413ea21df13ee7d6429c?tpId=13&tqId=11205&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[表示数值的字符串](https://www.nowcoder.com/practice/6f8c901d091949a5837e24bb82a731f2?tpId=13&tqId=11206&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[字符流中第一个不重复的字符](https://www.nowcoder.com/practice/00de97733b8e4f97a3fb5c680ee10720?tpId=13&tqId=11207&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 7. 位运算

[二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数组中只出现一次的数字](https://www.nowcoder.com/practice/e02fdb54d7524710a7d664d082bb7811?tpId=13&tqId=11193&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[不用加减乘除做加法](https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215?tpId=13&tqId=11201&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


### 8. 递归和回溯

[斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[跳台阶](https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[变态跳台阶](https://www.nowcoder.com/practice/22243d016f6b47f2a6928b4313c85387?tpId=13&tqId=11162&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[矩形覆盖](https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[矩阵中的路径](https://www.nowcoder.com/practice/c61c6999eecb4b8f88a98f66b273a3cc?tpId=13&tqId=11218&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[机器人的运动范围](https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8?tpId=13&tqId=11219&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 9. 动态规划

[连续子数组的最大和](https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=13&tqId=11183&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 10. 排序 

[调整数组的顺序使奇数位于偶数前面](https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 11. 其他

[整数中1出现的次数](https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6?tpId=13&tqId=11184&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[和为s的连续正数序列](https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&tqId=11194&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[孩子们的游戏](https://www.nowcoder.com/practice/f78a359491e64a50bce2d89cff857eb6?tpId=13&tqId=11199&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[求1+2+3+•••+n](https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1?tpId=13&tqId=11200&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数据流中的中位数](https://www.nowcoder.com/practice/9be0172896bd43948f8a32fb954e1be1?tpId=13&tqId=11216&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 二. Leetcode

## 三. 公司笔试题