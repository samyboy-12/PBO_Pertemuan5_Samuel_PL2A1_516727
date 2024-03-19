import java.util.ArrayList;
import java.util.List;

class Barang {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    public Barang(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    // Getter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    // Getter untuk hargaBarang
    public int getHargaBarang() {
        return hargaBarang;
    }

    // Getter untuk jumlahBarang
    public int getJumlahBarang() {
        return jumlahBarang;
    }
}

class Keranjang {
    private List<Barang> daftarBarang;
    private int kapasitas = 5;

    public Keranjang() {
        daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        if (daftarBarang.size() < kapasitas) {
            daftarBarang.add(barang);
            System.out.println("Berhasil memasukan " + barang.getNamaBarang() + " ke keranjang");
        } else {
            System.out.println("Keranjang sudah penuh!!");
        }
    }

    public void printHasil() {
        System.out.println("\n===");
        System.out.println("Jumlah Barang Di Keranjang Saat Ini : " + daftarBarang.size());
        System.out.println("Barang Pada Keranjang:");
        int totalHarga = 0;
        for (Barang barang : daftarBarang) {
            System.out.println("# " + barang.getNamaBarang() + ", jumlah : " + barang.getJumlahBarang());
            totalHarga += barang.getHargaBarang() * barang.getJumlahBarang();
        }
        System.out.println("Total Harga Yang Harus di Bayar: " + totalHarga);
    }
}

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Beras", 50000, 1);
        Barang barang2 = new Barang("Sabun", 10000, 2);
        Barang barang3 = new Barang("Sampo", 15000, 2);
        Barang barang4 = new Barang("Gula", 5000, 3);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(barang1);
        keranjang1.tambahBarang(barang2);
        keranjang1.tambahBarang(barang3);
        keranjang1.tambahBarang(barang4);

        System.out.println("\n===");

        keranjang1.printHasil();
    }
}
