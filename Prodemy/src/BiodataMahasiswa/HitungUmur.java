package BiodataMahasiswa;
public class HitungUmur {

    public static Mahasiswa mhs1 = new Mahasiswa(123,"Ahmad",new MyDate(1,2,2000));
    public static Mahasiswa mhs2 = new Mahasiswa(124,"Anwar",new MyDate(11,2,2000));
    public static Mahasiswa mhs3 = new Mahasiswa(125,"Aziz",new MyDate(17,9,2000));
    public static Mahasiswa mhs4 = new Mahasiswa(126,"Abdi",new MyDate(17,4,2000));
    public static Mahasiswa mhs5 = new Mahasiswa(127,"Agi",new MyDate(17,7,2000));
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(123,"Budi",new MyDate(1,10,2000));
        Mahasiswa mhs2 = new Mahasiswa(123,"Ahmad",new MyDate(11,2,2003));
        Mahasiswa mhs3 = new Mahasiswa(123,"Wawan",new MyDate(17,3,2005));

        System.out.println(cetakUmur(mhs1));
        System.out.println(cetakUmur(mhs2));
        System.out.println(cetakUmur(mhs3));
    }
    public static String cetakUmur(Mahasiswa m){
        int umurDalamBulan = 0;
        int bulanSekarangSejakAwalMasehi = 2023 * 12 + 9;
        int bulanLahirSejakAwalMasehi = m.getTglLahir().getYear() * 12 + m.getTglLahir().getMonth();

        umurDalamBulan = bulanSekarangSejakAwalMasehi - bulanLahirSejakAwalMasehi;
        return "Umur si " + m.getNama()+" adalah " + (umurDalamBulan / 12) + " tahun " + (umurDalamBulan % 12) + " bulan";
    }
}
