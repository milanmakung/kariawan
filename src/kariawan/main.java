
package kariawan;

public class main {

    public static void main(String[] args) {

        // Membuat 3 object karyawan
        Kariawan k1 = new Kariawan(
            "K001", "Milan", "Programmer", 4500000
        );

        Kariawan k2 = new Kariawan(
            "K002", "handy", "Admin", 3500000
        );

        Kariawan k3 = new Kariawan(
            "K003", "faesal", "Manager", 6000000
        );

        // Menampilkan data karyawan
        k1.tampilkanData();
        k1.bekerja();

        k2.tampilkanData();
        k2.bekerja();

        k3.tampilkanData();
        k3.bekerja();
    }
}
