package exercises;

import com.codewithmosh.Array;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public String toString() {
            return value + " ";

        }
    }

    private Node first;
    private Node last;
    private int size;

    public void reversing() {
        Node current = first;
        Node previousNode = null;
        Node oldFirst = first;
        while (current != null) {
            Node nextNode = current.next;
            if (current == last) {
                first = new Node(current.value);
                first.next = previousNode;
                last = new Node(oldFirst.value);
                last.next = null;
                System.out.println(last);
            } else {
                current.next = previousNode;
            }
            previousNode = current;
            current = nextNode;
        }
    }

    public void addFirst(int value) {
        Node newFirst = new Node(value);
        if (first == null) {
            first = last = newFirst;
        } else {
            newFirst.next = first;
            first = newFirst;
        }
        size++;
    }

    public void addLast(int value) {
        Node newLast = new Node(value);
        if (first == null) {
            last = first = newLast;
        } else {
            last.next = newLast;
            newLast.next = null;
            last = newLast;
        }
        size++;
    }

    public void deleteFirst() {
        if (first == null) {
            return;
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void deleteLast() {
        if (first == null) {
            return;
        }
        if (first == last) {
            first = last = null;
        } else {
            var current = first;
            while (current != null) {
                if (current.next == last) {
                    last = current;
                    last.next = null;
                } else {
                    current = current.next;
                }
            }
        }
        size--;
    }

    public boolean contains(Node item) {
        if (first != null) {
            var current = first;
            while (current != null) {
                if (current.next == item) {
                    return true;
                } else {
                    current = current.next;
                }
            }
        }
        return false;
    }

    public int indexOf(Node item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public Node[] convertToArray() {
        Node[] newArray = new Node[size];
        var current = first;
        var i = 0;
        while (current != null) {
            newArray[i] = current;
            i++;
            current = current.next;
        }
        for (int y = 0; y < newArray.length; y++) {
            System.out.println(newArray[y]);
        }
        return newArray;
    }

    public String toString() {
        var current = first;
        var i = 0;
        String msg = new String();
        while (current != null) {
            msg += current.value + " ";
            i++;
            current = current.next;
        }
        return msg;
    }
}
