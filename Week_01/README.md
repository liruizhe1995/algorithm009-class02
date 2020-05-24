# Week 1

## 学习总结

1. 改写Deque

```java
Deque<String> deque = new LinkedList<String>();

deque.addFirst("a");
deque.addFirst("b");
deque.addFirst("c");

String str = deque.peekFirst();
System.out.println(str);
System.out.println(deque);

while(deque.size() > 0) {
  System.out.println(deque.removeFirst());
}
System.out.println(deque);
```

2. Queue和Priority Queue源代码分析

Queue是一个先进先出的数据结构。 

boolean add(E e) 插入指定元素e进queue的后端(rear)，如果插入成功返回true，如果不成功throws exception。

boolean offer(E e) 插入指定元素e进queue的后端(rear)，如果插入成功返回true，如果没有目前可用的空间返回false。

E remove() 检索并删除队列的头元素(front)，如果队列是空的throws exception。

E poll() 检索并删除队列的头元素，如果队列是空的返回null。

E element() 检索但不删除队列头元素，如果队列是空的返回null。


Priority Queue

创建优先队列对象，默认大小为11. 队列中元素可以以自然顺序排序或者制定比较器(comparator)进行排序。

add(E e)直接调用offer(E e), offer(E e)先检查e是否为null，如果为null，throw nullPointerException。如果优先队列不够，进行扩容操作(grow)，否则将元素假如到数组末尾，并用(siftUp)向上调整。

grow(int minCapacity)，如果原来长度小，扩容为两倍，否则1.5倍。

siftIp(int k, E x)，将元素x插入到queue[k]位置上。自下而上堆化，一直往上跟父节点比较，如果比父节点小，就和父节点交换位置，直到出现比父节点打位止。

移除元素remove()直接调用poll()，将队列首元素弹出，将队列末元素移到队首，再做自上而下到堆化，一直往下与最小到子节点比较，如果比最小的子节点大，交换位置，再继续与最小的子节点比较。 如果比最小的子节点小，结束。

取队首元素element(), peek()，如果有元素取下标0的元素，没有元素返回null，element()抛出异常。



## 作业
[26. 删除排序数组中的重复项](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/26.java)

[189. 旋转数组](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/189.java)

[21. 合并两个有序链表](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/21.java)

[88. 合并两个有序数组](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/88.java)

[1. 两数之和](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/1.java)

[283. 移动零](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/283.java)

[66. 加一](https://github.com/liruizhe1995/algorithm009-class02/blob/master/Week_01/66.java)
