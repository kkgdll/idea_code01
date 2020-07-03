package com.ll.java;

import com.ll.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author LiuLong
 * @date 2020/7/3 - 15:23
 * <p>
 * IDEA中代码模板所处的位置:setting - Editor - Live Templates / postfix Completion
 */
public class TemplatesTest {

    //模板六: prsf: private static final 私有静态常量
    private static final Customer CUST = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 2;
    //psfs
    public static final String NATION = "chian";


    // 模板一: psvm
    public static void main(String[] args) {

        // 模板二: sout
        System.out.println("Hello");
        //变形: soutp, soutm, soutv, xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三: fori
        String[] arr = new String[]{"Tom", "jerry", "HanMeiMei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形: iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板四: list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            System.out.println(o);
        }

        //变形: list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形: list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五: ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        // ifn
        if (list == null) {

        }
        //变形:inn
        if (list != null) {

        }

        //变形: xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }
    }

}
