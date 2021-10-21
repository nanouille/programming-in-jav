package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> node = null;


    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
        /***we initiate a list, the element and its surroundings***/

        public Node(T elem){
            this.elem=elem;
            /*** to create an element***/
        }

        public T getElem() {
            return elem;
            /***to get an element***/
        }
    }
    public void addLast(E e) {
        if (this.node == null) {
            this.node = new agh.ii.prinjava.proj1.impl.DLinkList.Node(e);
            /***if the list is empty, we create a node***/
        } else {
            agh.ii.prinjava.proj1.impl.DLinkList.Node cst;
            for(cst = this.node; cst.next != null; cst = cst.next) {
            }
            /***if an element is in the list, we go through the list until arriving to the end*/

            cst.next = new agh.ii.prinjava.proj1.impl.DLinkList.Node(e);
            cst.next.prev = cst;
            /***we then create a new node and attach it after the previous node*/
        }

    }

    public void addFirst(E e) {
        if (this.node == null) {
            this.node = new agh.ii.prinjava.proj1.impl.DLinkList.Node(e);
            /***if the list is empty, we just create a node*/
        } else {
            agh.ii.prinjava.proj1.impl.DLinkList.Node<E> cst = this.node;
            cst.prev = new agh.ii.prinjava.proj1.impl.DLinkList.Node(e);
            cst.prev.next = cst;
            this.node = cst.prev;
            /***if the list isn't empty, we create a new node and attach it BEFORE the first node of the list*/
        }

    }

    public E removeFirst() {
        if (this.node == null) {
            return null;
            /***if the list is empty, we can't remove anything*/
        } else {
            E cst = this.node.getElem();
            this.node = this.node.next;
            if (this.node != null) {
                this.node.prev = null;
                /***it the list isn't empty, we get the first node, and say the
                 * following node becomes the first one of the list and the node
                 * we wanted as a value of NULL, we removed it*/

            }

            return cst; /**we return the node previously at the first place*/
        }
    }

    public E removeLast() {
        if (this.node == null) {
            return null;
            /**if the list is empty we can't remove anything*/
        } else {
            agh.ii.prinjava.proj1.impl.DLinkList.Node cst;
            for(cst = this.node; cst.next != null; cst = cst.next) {
            }
            /**if the list isn't empty we go through the list until we are at the end*/
            E last = cst.getElem();
            if (cst.prev != null) {
                /**if the last node isn't also the first node*/
                cst.prev.next = null;
                /**we indicate that the previous node is the end of the list*/
            } else {
                this.node = null;
                /**if the last node is also the first node we just remove it*/
            }
            return last; /**we return our element*/
        }
    }

    public String toString() {
        if (this.node == null) {
            return "Nothing in this list :(";
            /**if the list is empty, we indicate it*/
        } else {
            String text = " = ";

            for(agh.ii.prinjava.proj1.impl.DLinkList.Node cst = this.node; cst != null; cst = cst.next) {
                text = text + cst.getElem().toString() + ",";
            }
            /**just the way I decided to print my results*/
            /**if the list is [4,3,5,2] it will display : " = 4,3,5,2" */

            return text;
        }
    }

    public int NumberElements() {
        /**method the get the number of elements in a list*/
        int compt = 0;/** we start with a compt of 0*/
        if (this.node == null) {
            return compt;
            /**if the list is empty, we return compt, meaning 0*/
        } else {
            for(agh.ii.prinjava.proj1.impl.DLinkList.Node cst = this.node; cst != null; cst = cst.next) {
                ++compt;
                /**if the list isn't empty, we go throught it, and each time we pass a node, our compt grows*/
            }

            System.out.println(compt);
            return compt;
            /**we print and return our result*/
        }
    }
}

