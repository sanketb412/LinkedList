package com.javapractice;

public class MyNode<K> implements INode<K>{
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
    private K key;
    private MyNode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }


    public K getKey() {
        return key;
    }


    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyNode<K>) next;
    }
}
