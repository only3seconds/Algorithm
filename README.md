# 数据结构和算法

## 一.数据结构

### 1. 数组

- 数组具有随机访问特性，灵活使用数组的索引；

- 对于有序或局部有序的一维数组，要想到二分查找算法；

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

[数组中的逆序对]()

**经典题目**

[寻找一个数组中出现次数最多的元素]()


### 2. 链表 3,6,14,15,16,18,22,23,24,25,35,16,52,55,56

**剑指Offer**

[从尾到头打印列表](https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[链表中倒数第k个节点](https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[反转链表](https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[合并两个排序的链表](https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[复杂链表的复制](https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba?tpId=13&tqId=11178&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 3. 栈和队列 5,7,9,20,21,22,30,31

**剑指Offer**

[用两个栈实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[包含min函数的栈](https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[栈的压入弹出序列](https://www.nowcoder.com/practice/d77d11405cc7470d82554cb392585106?tpId=13&tqId=11174&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 4. 树 4,6,7,8,17,18,19,22,23,24,25,26,27,28,32,33,34,38,39,50,54,55,57,58,59,60,61,62,63,65

**剑指Offer**

[重建二叉树](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[树的子结构](https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树的镜像](https://www.nowcoder.com/practice/564f4c26aa584921bc75623e48ca3011?tpId=13&tqId=11171&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[从上往下打印二叉树](https://www.nowcoder.com/practice/7fe2212963db4790b57431d9ed259701?tpId=13&tqId=11175&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树的后序遍历序列](https://www.nowcoder.com/practice/a861533d45854474ac791d90e447bafd?tpId=13&tqId=11176&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉树中和为某一值的路径](https://www.nowcoder.com/practice/b736e784e3e34731af99065031301bca?tpId=13&tqId=11177&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[二叉搜索树与双向链表](https://www.nowcoder.com/practice/947f6eb80d944a84850b0538bf0ec3a5?tpId=13&tqId=11179&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

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

## 二. 常见算法

### 1. 位运算 15

[二进制中1的个数](https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

[数值的整数次方](https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 2. 查找 4,8,11,50,53

[寻找一个数组中出现次数最多的元素]()

### 3. 排序 39,40

**经典排序算法**

[冒泡排序]()
[快速排序]()

**剑指Offer**

[调整数组的顺序使奇数位于偶数前面](https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

### 4. 递归

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

### 其他

**剑指Offer**

[整数中1出现的次数](https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6?tpId=13&tqId=11184&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)


