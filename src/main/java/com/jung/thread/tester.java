package com.jung.thread;

import static java.lang.Thread.sleep;

public class tester {
    public static void main(String[] args) {
        //1st thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread:" + i);
        }
        //2nd thread is anonymous
        Thread tr = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread:" + i);
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        tr.start();
        //mythread
        MyThread mtr = new MyThread();
        mtr.start();
        //runnable interface is also anonymous
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("runnable:" + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // another thread
        Thread r = new Thread(runnable);
        r.start();

        //runnable -lambda
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread:" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("end");
    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
