package com.Lesson2;

import com.Lesson2.testClasses.DequeueTest;
import com.Lesson2.testClasses.StackTest;

public class Main {
    public static void main(String[] args) {
        //Task2
        System.out.println("First test \"Reverse text\":");
        StackTest.testReverse();
        //Task3
        System.out.println("Second test \"Insert and Remove from dequeue\":");
        DequeueTest.testDequeue();

    }
}
