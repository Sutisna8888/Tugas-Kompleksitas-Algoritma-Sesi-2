import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan bilangan Yang ingin dipangkatkan: ");
        int bilangan = angka.nextInt();
        
        int hasil = 0;
        for (int i = 0; i < bilangan; i++) {
            hasil += bilangan; 
        }
        
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah: " + hasil);
    }
}



/* ANALISIS KOMPLEKSITAS ALGORITMA
 * Konpleksitas Waktu
 *      arena ada dua iterasi tetap, kompleksitas waktunya adalah O(1), 
 *      artinya waktu eksekusi konstan dan tidak tergantung pada nilai input.
 * 
 * Kompleksitas Ruang
 *  Kompleksitas ruangnya juga O(1), karena hanya menggunakan variabel tetap
 *  (bilangan dan hasil), tanpa memperhatikan ukuran input.
 * 
 */


/** SIMULASI PERHITUNGAN DATA :
 *  Misal angka yang diinputkan adalah 4 maka:
 *  Iterasi 1 : hasil = 0 + 4 = 4
 *  Iterasi 2 : hasil = 4 + 4 = 8
 *  Iterasi 3 : hasil = 8 + 4 = 12
 *  Iterasi 4 : hasil = 12 + 4 = 16
 *  Hasil akhir atau output yang dihasilkan adalah 16, sesuai dengan 4 pangkat 2.
 * */ 
