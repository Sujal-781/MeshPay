package com.sujal.mesh_pay;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo implements Runnable{

    static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    public void run(){
        for(int i=0;i<1000;i++){
            map.merge("count", 1, Integer::sum);
        }
    }
    public static void main(String[] args) throws InterruptedException{

        ConcurrentHashMapDemo task = new ConcurrentHashMapDemo();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(map.get("count"));

    }
}