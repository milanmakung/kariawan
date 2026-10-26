
package kariawan;

public class Kariawan {

    String nik;
    String nama;
    String jabatan;
    double gaji;

    public Kariawan(String nik, String nama,
                    String jabatan, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void tampilkanData() {
        System.out.println("NIK     : " + nik);
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : Rp " + gaji);
        System.out.println("----------------------");
    }

    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }
}
