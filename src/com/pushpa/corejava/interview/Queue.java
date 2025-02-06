package com.pushpa.corejava.interview;
class Queue{
    int front;
    int rear;
    int[] arr;
    int maxSize;
    int currentSize;
    Queue()
    {
        front=rear=-1;
        arr=new int[10];
        maxSize = arr.length;
        currentSize = 0;
    }
    void enqueue(int a)
    {
        //Logic here
        if (currentSize == maxSize) {
            System.out.println("Queue is full. So cannot add more elements.");
        } else {
            rear = (rear + 1) % maxSize;
            arr[rear] = a;
            currentSize++;
            System.out.println("Added value: " + a);
        }
    }
    void dequeue()
    {
        //Logic here
        if (currentSize == 0) {
            System.out.println("Queue is empty. So cannot remove elements.");
        } else {
            front = (front + 1) % maxSize;
            int value = arr[front];
            currentSize--;
            System.out.println("Removed value: " + value);
        }
    }
    void display()
    {
        //Logic here
        if (currentSize == 0)
            System.out.println("Queue is empty.");
        else {
            System.out.print("Queue elements are : ");
            for (int i = 1; i <= currentSize; i++) {
                System.out.print(arr[(front + i) % maxSize] + "  ");
            }
            System.out.println();
        }
    }
}



