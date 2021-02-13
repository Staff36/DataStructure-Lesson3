package com.Lesson2.testClasses;

import com.Lesson2.stack.StackImpl;

public class StackTest {
    public static void testReverse(){
        String text= "My test text";
        System.out.println(text);
        System.out.println(reverseText(text));

    }

    public static String reverseText(String text){
        StackImpl<Character> stack = new StackImpl<>(text.length());
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        StringBuilder reverseText= new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            reverseText.append(stack.pop());
        }
        return reverseText.toString();
    }

    //тоже же вроде без sb.reverse();
    public static String reverseText2(String text){
        StringBuilder reverseText= new StringBuilder();
        for (int i = text.length()-1; i >=0; i--) {
            reverseText.append(text.charAt(i));
        }
        return reverseText.toString();
    }
}
