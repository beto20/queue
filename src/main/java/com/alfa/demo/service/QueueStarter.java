package com.alfa.demo.service;

public class QueueStarter<T> {
    private String name;
    private Queue<T> queue;

    public QueueStarter(String name) {
        this.name = name;
        this.queue = new Queue();
    }


    public String getName() {
        return name;
    }

    public void setQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public Queue<T> getQueue() {
        return queue;
    }
}
