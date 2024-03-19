import java.util.ArrayList;

public class Keranjang {

    private int jmlBarang = 0;
    private ArrayList<Barang> listBarang = new ArrayList<>();

    public Keranjang() {
    }

    public void tambahBarang(Barang barang) {
        if (jmlBarang + barang.getJumlahBarang() <= 5) {
            listBarang.add(barang);
            jmlBarang += barang.getJumlahBarang();
            System.out.println("Berhasil memasukkan ke keranjang");
        } else {
            System.out.println("Keranjang sudah penuh!!");
        }
    }

    public int totalHarga() {
        int total = 0;
        for (Barang barang : listBarang) {
            total += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        return total;
    }

    public void printHasil() {
        System.out.println("Jumlah Barang Di Keranjang Saat Ini : " + jmlBarang);
        System.out.println("Barang Pada Keranjang:");
        for (Barang barang : listBarang) {
            System.out.println("# " + barang.getNamaBarang() + ", jumlah : " + barang.getJumlahBarang());
        }
        System.out.println("Total Harga Yang Harus di Bayar: " + totalHarga());
    }
}
