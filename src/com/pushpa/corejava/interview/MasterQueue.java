package com.pushpa.corejava.interview;

public class MasterQueue{
    public static void main(String[] args)
    {
        Queue ob=new Queue();
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        ob.display();
        ob.dequeue();
        ob.dequeue();
        ob.display();
        System.out.println("done");
    }
}
