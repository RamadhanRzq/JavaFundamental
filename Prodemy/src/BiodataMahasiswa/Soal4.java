package BiodataMahasiswa;
public class Soal4 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(123,"Ahmad",new MyDate(1,10,2005));
        Mahasiswa mhs2 = new Mahasiswa(123,"Anwar",new MyDate(11,9,2005));
        Mahasiswa mhs3 = new Mahasiswa(123,"Aziz",new MyDate(17,11,2005));

        System.out.println(cetakUmur(mhs1));
        System.out.println(cetakUmur(mhs2));
        System.out.println(cetakUmur(mhs3));

        Mahasiswa[] mahasiswaArray = {mhs1, mhs2, mhs3};
        Mahasiswa mahasiswaTermuda = umurTermuda(mahasiswaArray);

        System.out.println("Mahasiswa termuda adalah " + cetakUmur(mahasiswaTermuda));
    }
    public static String cetakUmur(Mahasiswa m){
        int umur = 0;
        int bulanSekarangSejakAwalMasehi = 2023 * 12 + 9;
        int bulanLahirSejakAwalMasehi = m.getTglLahir().getYear() * 12 + m.getTglLahir().getMonth();
        umur = bulanSekarangSejakAwalMasehi - bulanLahirSejakAwalMasehi;
        int umurTahun = umur / 12;
        int umurBulan = umur % 12;

        return m.getNama() + " dengan umur " + umurTahun + " tahun " + umurBulan + " bulan";
    }
    public static int umurDalamBulan(Mahasiswa m) {
        int bulanSekarangSejakAwalMasehi = 2023 * 12 + 9;
        int bulanLahirSejakAwalMasehi = m.getTglLahir().getYear() * 12 + m.getTglLahir().getMonth();

        return bulanSekarangSejakAwalMasehi - bulanLahirSejakAwalMasehi;
    }
    public static Mahasiswa umurTermuda(Mahasiswa[] mahasiswaArray) {
        Mahasiswa termuda = mahasiswaArray[0];

        for (int i = 1; i < mahasiswaArray.length; i++) {
            if ( umurDalamBulan(termuda) > umurDalamBulan(mahasiswaArray[i]) ) {
                termuda = mahasiswaArray[i];
            }
        }
        return termuda;
    }
}
