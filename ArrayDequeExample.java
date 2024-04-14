import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Membuat sebuah ArrayDeque untuk menyimpan data integer
        ArrayDeque<Integer> angkaDeque = new ArrayDeque<>();

        // Menambahkan elemen ke ArrayDeque
        angkaDeque.addFirst(1);
        angkaDeque.addLast(2);
        angkaDeque.addLast(3);

        // Menghapus elemen dari ArrayDeque dan menampilkannya
        System.out.println("Elemen yang dihapus dari ArrayDeque:");
        System.out.println(angkaDeque.removeFirst());
        System.out.println(angkaDeque.removeLast());

        // Menampilkan isi ArrayDeque
        System.out.println("Isi ArrayDeque angkaDeque:");
        for (int angka : angkaDeque) {
            System.out.println(angka);
        }
    }
}