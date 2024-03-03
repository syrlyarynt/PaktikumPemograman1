/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author syrly
 */
public class ListTestPecahan {
 
    public static void main(String[] args) {
        // membuat objek mylist dri kelas strukturlist
        StrukturListPecahan myList = new StrukturListPecahan();
        
        // menambahkan node ke list menggunakan method addHead dan addTail
        myList.addHead(2.1);
        myList.addTail(3.4);
        myList.addTail(4.5);
        
        // menampilkan elemen list yang menggunakan method displayment
        myList.displayElement();
        System.out.println(); // tambahkan baris baru setelah menampilkan elemen list
            
    }
}
    
//    public static void main(String[] args) {
//        // membuat objek mylist dri kelas strukturlist
//        StrukturListPecahan myList = new StrukturListPecahan();
//        
//        // menambahkan node ke list menggunakan method addHead dan addTail
//        myList.addHead(3.4);
//        myList.addMiddle(2.1, 2);
//        myList.addTail(1.1);
//        myList.addTail(4.5);
//        myList.addTail(5.5);
//        
//        // menampilkan elemen list yang menggunakan method displayment
//        myList.displayElement();
//        System.out.println(); // tambahkan baris baru setelah menampilkan elemen list
//            
//    }
//}

 