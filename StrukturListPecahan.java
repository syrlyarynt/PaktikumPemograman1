/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author syrly
 */
public class StrukturListPecahan {
    // deklarasi head sebagai node pertama dalam linked list
    private NodePecahan HEAD;

    // Fungsi untuk menambahkan node di akhir linked list
    public void addTail(double data) {
        NodePecahan newNode = new NodePecahan(data); // Buat node baru dengan data yang diberikan

        // Jika linked kosong, maka node baru menjadi head
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            // jika tidak, iterasikan sampai ke node terakhir
            NodePecahan curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            // Menambahkan newNode setelah node terakhir
            curNode.setNext(newNode);
        }
    }
    
    //method untuk menambahkan node pertama dalam linked list
    public void addHead(double data) {
        // membuat node baru dengan data yang diberikan
        NodePecahan newNode = new NodePecahan(data);
        // jika linked list kosong, node baru menjadi head
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            // jika tidak, node baru menjadi head baru, menggantikan head lama
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //method untuk menambahkan node di posisi tengah dalam linked list
    public void addMiddle(double data, int position) {
        NodePecahan newNode = new NodePecahan(data); // buat node baru dengan data yang diberikan

        //jika linked list kosong atau posisi adalah 1, node baru menjadi head
        if (HEAD == null || position == 1) {
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            // jika tidak, iterasikan sampai ke posisi yang ditentukan
            NodePecahan curNode = HEAD;
            NodePecahan posNode = null;
            int i = 1;
            while (curNode != null && i < position) {
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }

            // jika posisi ditemukan, masukkan newNode di antara posNode dan curNode
            if (curNode != null) {
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            } else {
                // jika posisi melebihi jumlah node yang ada, tambahkan node baru di akhir list
                posNode.setNext(newNode);
            }
        }
    }

    // Method untuk mengecek apakah list kosong atau tidak
    public boolean isEmpty() {
        return HEAD == null;
    }

    // method untuk menampilkan semua elemen dalam linked list
    public void displayElement() {
        NodePecahan curNode = HEAD; 
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
