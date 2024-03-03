/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author syrly
 */
public class NodePecahan {
    private double data;
    private NodePecahan next;

    // Constructor
    public NodePecahan(double data) {
        this.data = data;
    }

    // Setter untuk data
    public void setData(double data) {
        this.data = data;
    }

    // Getter untuk data
    public double getData() {
        return data;
    }

    // Setter untuk next
    public void setNext(NodePecahan next) {
        this.next = next;
    }

    // Getter untuk next
    public NodePecahan getNext() {
        return next;
    }
}
