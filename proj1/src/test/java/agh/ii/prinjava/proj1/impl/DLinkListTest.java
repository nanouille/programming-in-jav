
package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList();

    /***methods pre-made for test***/
    DLinkListTest() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addLast() {
        this.dLinkList.addLast(4); this.dLinkList.addLast(6); this.dLinkList.addLast(3);
        Assertions.assertEquals(3, (Integer)this.dLinkList.removeLast());
        /***It shows us the element placed at the end of our list, if it is 3, it means our function works***/
    }

    @Test
    void addFirst() {
        this.dLinkList.addFirst(5); this.dLinkList.addFirst(1); this.dLinkList.addFirst(3);
        Assertions.assertEquals(3, (Integer)this.dLinkList.removeFirst());
        /***It shows us the element placed at the front of our list, if it is 3, it means our function works***/
    }

    @Test
    void removeFirst() {
        this.dLinkList.addLast(5);this.dLinkList.addLast(3);this.dLinkList.addLast(1);this.dLinkList.removeFirst();
        Assertions.assertEquals(" = 3,1,", this.dLinkList.toString());
        /***It shows us the list after removing the first element***/
    }

    @Test
    void removeLast() {
        this.dLinkList.addLast(5);this.dLinkList.addLast(3);this.dLinkList.addLast(1);this.dLinkList.removeLast();
        Assertions.assertEquals(" = 5,3,", this.dLinkList.toString());
        /***It shows us the list after removing the last element***/
    }

    @Test
    void testToString() {
        System.out.println(this.dLinkList);
        this.dLinkList.addLast(5);this.dLinkList.addLast(2);this.dLinkList.addLast(3);
        System.out.println(this.dLinkList);
        Assertions.assertEquals(" = 5,2,3,", this.dLinkList.toString());
        /***It shows us the list after adding 3 elements in it***/
    }

    @Test
    void NumberElements() {
        this.dLinkList.addLast(2);
        this.dLinkList.addLast(6);
        this.dLinkList.addLast(4);
        this.dLinkList.addLast(1);
        this.dLinkList.addLast(3);
        this.dLinkList.addLast(4);
        this.dLinkList.NumberElements();
        Assertions.assertEquals(6, this.dLinkList.NumberElements());
        /***we test the number of elements we have in the list***/
        /***if it returns 6, we know it works***/
    }
}