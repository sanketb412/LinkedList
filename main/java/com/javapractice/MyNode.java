package com.javapractice;

public class MyNode<K> {
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
    private K key;
    private MyNode next;

    public MyNode(K key) {
        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
