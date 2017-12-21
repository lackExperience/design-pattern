package com.lkf.duck;

/**
 * 鸭子父类
 * Created by likaifeng on 2017/12/21.
 */
public abstract class Duck {

    /**
    *鸭子都会叫
    *@author lkf
    *@Date 2017/12/21 20:27
    */
    public void quack(){
        System.out.println("叫");
    }
    /**
    *鸭子都会游泳
    *@author lkf
    *@Date 2017/12/21 20:29
    */
    public void swim(){
        System.out.println("游泳");
    }
    /**
    *因为每个鸭子的外观不同，所以定义一个抽象方法
    *@author lkf
    *@Date 2017/12/21 20:27
    */
    public abstract void display();

    /**
    *飞
    *@author lkf
    *@Date 2017/12/21 20:37
    */
    public void fly(){
        System.out.println("飞");
    }
}
