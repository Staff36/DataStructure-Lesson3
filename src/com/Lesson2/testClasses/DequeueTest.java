package com.Lesson2.testClasses;

import com.Lesson2.dequeue.DequeueImpl;

public class DequeueTest {
    public static void testDequeue() {
        DequeueImpl <Integer> iDequeue=new DequeueImpl<>(10);
        for (int i = 0; i < 4; i++) {
            iDequeue.insertRight(i);
            iDequeue.insertLeft(i*10);
        }
        System.out.println(iDequeue);
        iDequeue.removeLeft();
        iDequeue.removeLeft();

        iDequeue.removeRight();
        System.out.println(iDequeue);
    }
}
