
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /***methods pre-made for test***/
    MyQueueDLLBImplTest() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        this.queueOfInts.enqueue(4);
        this.queueOfInts.enqueue(2);
        this.queueOfInts.enqueue(1);
        Assertions.assertEquals(4, (Integer)this.queueOfInts.dequeue());
        /***we dequeue (meaning we get the firt value of the queue) and compare
         *  it to 4(since we know it is the fist value, meaning we did enqueue them in the right order***/
    }

    @Test
    void dequeue() {
        this.queueOfInts.enqueue(4);
        this.queueOfInts.enqueue(2);
        this.queueOfInts.enqueue(1);
        this.queueOfInts.dequeue();
        Assertions.assertEquals(2, this.queueOfInts.numOfElems());
        /***we add 3 elements and we dequeue an element and them compare the size of the queue with 2 (its estimated size afterwards)***/
    }

    @Test
    void numOfElems() {
        this.queueOfInts.enqueue(6);
        this.queueOfInts.enqueue(2);
        this.queueOfInts.enqueue(1);
        Assertions.assertEquals(3, this.queueOfInts.numOfElems());
        /***we count the number of element we have in the queue after adding 3 and comparing to 3**/
    }

    @Test
    void peek() {
        this.queueOfInts.enqueue(6);
        this.queueOfInts.enqueue(2);
        this.queueOfInts.enqueue(9);
        Assertions.assertEquals(9, (Integer)this.queueOfInts.peek());
        /***peek means we get the last element of the queue, should be 9***/
    }
}
