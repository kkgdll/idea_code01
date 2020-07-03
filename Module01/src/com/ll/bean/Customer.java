package com.ll.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

// 这是单行注释
/*
 *   执行 alt + r
 *   提示补全 alt + /
 *   单行注释 ctrl + /
 *   多行注释 ctrl+ shift + /
 *   向下复制一行 ctrl + alt + down
 *   删除一行 ctrl + d
 *   向上移动代码 alt + up
 *   向下移动代码 alt + down
 *   向下开始新的一行 shift + enter
 *   查看源代码(class) alt + 鼠标左键 或 ctrl + shift + t
 *   万能解错/生成返回值变量 alt + enter
 *   退回前一个编辑页面 alt + left
 *   查看继承关系 F4
 *   格式化代码 crtl + shift + f
 *   提示方法参数类型 ctrl + alt + /
 *   查看类的结构 ctrl + o
 *   重构(修改变量名与方法名) alt + shift + r
 *   大小写转换 ctrl + shift + y
 *   生成构造器/get/set/toStirng alt + shift + s
 *   查看文档说明 F2
 *   收起所有方法 alt + shift + c
 *   打开所有方法 alt + shift + x
 *   打开代码所在的文件夹 ctrl + shift + x
 *   生成try-catch alt + shift + z
 *   局部变量抽取为成员变量 alt + shift + f
 *   查找 ctrl + f
 *   全局查找 ctrl + h
 *   查找文件 双击shift
 *   查看继承结构图 ctrl + shift + u 和 F4 功能一样,但效果不同
 *   添加到收藏夹 ctrl + alt + f
 *   抽取选中代码为方法 alt + shift + m
 *   打开最近修改的文件 ctrl + e
 *   关闭当前打开的代码栏 ctrl + w
 *   关闭当前打开的所有代码栏 ctrl + shift + w
 *   快速搜索类中的错误 ctrl + shift + q
 *   选择要粘贴的内容 ctrl + shift + v
 *   查看方法的多层重写结构图 ctrl + alt + h
 *   查找方法在哪里被调用 ctrl + shift + h
 *
 * */
public class Customer extends Person {

    private static final int INITI = 10;
    private static int index;

    public static void main(String[] args) {
        index = 0;

        // 执行 alt+r
        //region Description
        SayHello();
        //endregion


        ArrayList list2 = new ArrayList();
        list2.add(0);

        method();

        //        synchronized ();

        Date date = new Date();


    }

    public static void SayHello() {
        System.out.println("Hello World!");

        System.out.println("Hello World!");

        System.out.println("Hello World!");

        System.out.println("Hello World!");

    }

    public static void method() {

        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void eat() {
        System.out.println("客户吃饭");
    }

}
