### Java中的集合体系
**Collection接口**<p>
List:
- ArrayList: 底层数据结构是动态数组，查询性能高，增删性能低。
- Vector: 底层数据结构是数组，查询性能高，增删性能低。
- LinkedList: 底层数据结构是双向链表，查询性能低，增删性能高。<br>


Set:
- HashSet: 无序不重复的，使用HashMap的key存储元素，判断重复依据是hashCode()和equals()。
- TreeSet: 有序不重复的，底层使用TreeMap的key存储元素，排序方式分为自然排序，比较器排序。

**Map接口**<p>
- HashMap: key的值没有顺序，线程不安全。
- TreeMap: key的值可以自然排序，线程不安全。
- Hashtable: key和value都不可以为null，线程安全。
- Properties: key和value都是String类型的，线程安全。

### HashMap和Hashtable的区别
HashMap:
- 线程不安全，效率高。
- 可以存储null的key和value，但null作为键的只能有一个，null作为值的可以有多个。
- 在jdk1.8的时候更改底层为[数组+链表+红黑树]。

Hashtable
- 线程安全（内部的方法基本都经过synchronized修饰），古老的实现类，效率低，实现原理、功能和HashMap相同，基本被淘汰，基本不使用。
- 不允许有null键和null值，否则会抛出空指针异常。
- 底层为[数组+链表]。

### ArrayList和LinkedList区别
ArrayList:
- 底层有数组实现，可以动态扩容，需要连续内存。
- 有索引，查询效率高。
- 增加或删除尾部元素效率高，但是增删元素到其他位置，需要将数组批量移动，效率不高。

LinkedList
- 底层由双向链表实现，不需要连续的内存。
- 没有索引，查询需要遍历链表，效率低。
- 增删尾部或头部的元素效率高，但是增删元素到其他位置需要先遍历链表找到元素位置，效率较低（在已经找到的前提下，增删的效率是很高的）。
