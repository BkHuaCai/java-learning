package com.huacai;

/**
 * @Date: 2023/5/24
 * @Author: BkHuaCai
 * @Description:
 */
public class base {

    // String和StringBuffer和StringBuilder区别
    public static void string() {
        String s1 = new String();
        StringBuffer s2 = new StringBuffer();
        StringBuilder s3 = new StringBuilder();
    }

    // ==和equals的区别
    public static void different() {
        int a = 1;
        int b = 1;
        System.out.println(a == b);// true
        //  System.out.println(a.equals(b)); //报错
        Integer c = 1;
        Integer d = 1;
        System.out.println(c == d); // true
        System.out.println(c.equals(d)); // true，因为 Integer 重写了equals方法。
    }

    public static void main(String[] args) {
        different();
    }
}
