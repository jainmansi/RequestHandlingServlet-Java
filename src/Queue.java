
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Queue {
    private Node first;
    
    public void enqueue(int value, long time) {
        //TODO: implement logic
        Node new_node = new Node();
        new_node.value = value;
        new_node.next = first;
        new_node.startTime = time;
        first = new_node;
    }
    
    public Node dequeue() {
        //TODO: implement logic        
        if (first == null) {
            throw new NoSuchElementException("Queue doesn't contain any Nodes.");
        }

        if (first.next == null) {
            Node temp = first;
            first = first.next;
            return temp;
        }

        Node previous = null;
        Node current = first;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;
    }
    
    public int peek() {
        //TODO: implement logic
        try {
            return first.value;
        } catch (Exception e) {
            throw new NoSuchElementException("Queue doesn't contain any Nodes.");
        }
    }
    
    public boolean isEmpty() {
        //TODO: implement logic
        return (first == null);
    }
    
    public int size() {
        //TODO: implement logic
        int s = 0;

        try {
            if (first != null) {
                Node n = first;

                while (n.next != null) {
                    s++;
                    n = n.next;
                }
                return (s + 1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }

    }
    
}
