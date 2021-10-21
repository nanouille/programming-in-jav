
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList();

    public MyQueueDLLBImpl() {
    }

    public void enqueue(E x) {
        this.elems.addLast(x);
    }
    /***since it is a queue, we add our element at the end***/

    public E dequeue() {
        return this.elems.removeFirst();
        /***since it is a queue, we remove the first element, the one at the front***/
    }

    public int numOfElems() {
        return this.elems.NumberElements();
        /***we count the number of element present in the queue***/
    }

    public E peek() {
        E last = this.elems.removeLast();
        this.elems.addLast(last);
        return last;
        /***we take the last one and put it back at the end, to get the value without changing the queue***/
    }
}
