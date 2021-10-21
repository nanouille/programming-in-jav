
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList();

    public MyStackDLLBImpl() {
    }

    public E pop() {
        return this.elems.removeLast();
    }
    /***we get the top element of the stack***/

    public void push(E x) {
        this.elems.addLast(x);
        /***we add an element at the top of the stack***/
    }

    public int numOfElems() {
        return this.elems.NumberElements();
        /***we cunt the number of elements in the stack***/
    }

    public E peek() {
        E first = this.elems.removeFirst();
        this.elems.addFirst(first);
        return first;
        /***we remove the bottom element and put it back the stack at its place
         * we do this to get its value without changing the stack***/
    }

    public String toString() {
        return this.elems.toString();
        /***we display***/
    }
}
