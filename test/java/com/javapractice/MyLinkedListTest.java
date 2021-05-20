package com.javapractice;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() { /** adding 30 and 56 to 70 **/
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);

    }

    @Test
    public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToTop() { /** Appending 30 and 70 to 56 **/
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode); /** added append to SecondNode **/
        myLinkedList.append(myThirdNode);  /** added append to ThirdNode **/
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                         myLinkedList.head.getNext().equals(mySecondNode) &&
                         myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingToLinkedListShouldPassLinkedListResult() { /** inserting 30 between 56 and 70 **/
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given2NumbersWhenPopToLinkedListShouldBeDeleteTop() { /** delete first element from 30->70 **/
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popFirst();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.getNext().equals(myThirdNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given2NumbersWhenPopToLinkedListShouldBeDeleteTail() { /** delete Last element from 56->30 **/
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printDelete();
        boolean result = myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
}
