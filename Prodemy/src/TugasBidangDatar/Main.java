package TugasBidangDatar;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(6, 8, 10, 7, 9);
        System.out.println("Keliling Segitiga: " + segitiga.getKeliling());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
        System.out.println("\n");

        BelahKetupat belahKetupat = new BelahKetupat(6, 8, 5);
        System.out.println("Keliling Belah Ketupat: " + belahKetupat.getKeliling());
        System.out.println("Luas Belah Ketupat: " + belahKetupat.getLuas());
        System.out.println("\n");

        LayangLayang layangLayang = new LayangLayang(6, 8, 5, 7);
        System.out.println("Keliling Layang-Layang: " + layangLayang.getKeliling());
        System.out.println("Luas Layang-Layang: " + layangLayang.getLuas());
        System.out.println("\n");

        Trapesium trapesium = new Trapesium(5, 7, 8, 6, 7);
        System.out.println("Keliling Trapesium: " + trapesium.getKeliling());
        System.out.println("Luas Trapesium: " + trapesium.getLuas());
        System.out.println("\n");

        Persegi persegi = new Persegi(4);
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("\n");

        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.getKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.getLuas());
        System.out.println("\n");

        JajarGenjang jajarGenjang = new JajarGenjang(6, 8, 5, 7);
        System.out.println("Keliling Jajar Genjang: " + jajarGenjang.getKeliling());
        System.out.println("Luas Jajar Genjang: " + jajarGenjang.getLuas());
        System.out.println("\n");

        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());

    }
}
