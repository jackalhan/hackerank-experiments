package com.hackerrank.test.challenging;

import java.util.Scanner;

/**
 * Created by jackalhan on 2/5/17.
 */
public class Abstract_Class {
    static abstract class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    static class MyBook extends Book {

        @Override
        void setTitle(String s) {
            super.title = s;
        }
    }

    public static void main(String[] args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}
