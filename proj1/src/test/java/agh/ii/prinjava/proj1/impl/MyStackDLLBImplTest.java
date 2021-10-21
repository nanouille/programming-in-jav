
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /***methods pre-made for test***/
    MyStackDLLBImplTest() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        this.stackOfInts.push(4);
        this.stackOfInts.push(1);
        this.stackOfInts.pop();
        Assertions.assertEquals(" = 1,", this.stackOfInts.toString());
        /***we push(enter) two value and pop(get the last one entered/the one at the top) to compare it with 1***/
    }

    @Test
    void push() {
        this.stackOfInts.push(3);
        this.stackOfInts.push(2);
        Assertions.assertEquals(" = 3,2,", this.stackOfInts.toString());
        /***push add a number at the top of the stack***/
    }

    @Test
    void numOfElems() {
        this.stackOfInts.push(4);
        this.stackOfInts.push(4);
        this.stackOfInts.push(4);
        this.stackOfInts.push(3);
        this.stackOfInts.numOfElems();
        Assertions.assertEquals(4, this.stackOfInts.numOfElems());
        /***we count the number of elements present in our stack by adding 4***/
    }

    @Test
    void peek() {
        this.stackOfInts.push(4);
        this.stackOfInts.push(2);
        this.stackOfInts.push(1);
        Assertions.assertEquals(4, (Integer)this.stackOfInts.peek());
        /***we get the element at the bottom of the stack***/
    }
}
