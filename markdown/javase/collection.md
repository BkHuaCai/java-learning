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

### ArrayList和LinkedList区别