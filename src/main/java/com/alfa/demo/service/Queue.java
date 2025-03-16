package com.alfa.demo.service;


import com.alfa.demo.entity.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> back;
    private int size;

    public Queue() {
        front = back = null;
        size = 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);

        if (back == null) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }

        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            back = null;
        }

        size--;
        return data;
    }

    public List<T> showAll() {
        var arr = new ArrayList<T>();
        Node<T> current = front;

        while (current != null) {
            if (current.data == Object.class) {
                var msg = (Message) current.data;
                System.out.println(msg.toString());
            }
            arr.add(current.data);
            current = current.next;
        }

        return arr;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
