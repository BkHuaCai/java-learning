# 基础篇

### String和StringBuffer和StringBuilder区别
三者底层都是char[]存储数据，JDK1.9之后使用的是byte[]，因为我们存储的基本都是端字符串，使用byte[]更加节省空间。<p>
由于String底层char[]有final修饰，因此每次对String操作都会在内存中开辟一块新空间，生成新的对象，所以String不可变。
但是String并不是线程安全的，因为没有加锁，内部可以被并发的修改。<p>
StringBuffer和StringBuilder是可变字符串，因为没有final修饰，适合字符串拼接。StringBuffer是线程安全的，
方法有synchronized修饰，所以性能 较低。StringBuilder的线程不安全的，方法没有synchronized修饰。<p>
从性能角度考虑，StringBuilder > StringBuffer > String。

### ==和equals的区别
 对于基本类型，==比较的是数值的大小，equals不能用于基本数据类型。<p>
 对于引用类型，==比较的是内容的地址，equals比较的也是内容的地址，
 如果该引用类型重写了equals方法，那么equals比较的就是数据的内容。
 