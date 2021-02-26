package com.example.seckill.demo.model;

public class LazyExample {

//    private static int ticket = 100;
    private static LazyExample lazyExample = null;

    //防止外部访问该类
    private LazyExample() {}

    //单例懒汉式
    public static synchronized LazyExample getLazyExample() {
        if (lazyExample == null) {
            lazyExample = new LazyExample();
        }
        return lazyExample;
    }

    /*//同步访问票数
    private static synchronized int setReTicket() {
        if (ticket != 0) {
            ticket--;
            System.out.println(ticket);
        }
        return ticket;
    }

    //提供外部调用票数的方法
    public int getTicket() {
        return setReTicket();
    }*/

}
