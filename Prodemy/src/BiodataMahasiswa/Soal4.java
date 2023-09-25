package BiodataMahasiswa;
public class Soal4 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(123,"Ahmad",new MyDate(1,2,2003));
        Mahasiswa mhs2 = new Mahasiswa(124,"Anwar",new MyDate(11,2,2006));
        Mahasiswa mhs3 = new Mahasiswa(125,"Aziz",new MyDate(17,9,2008));
        Mahasiswa mhs4 = new Mahasiswa(126,"Abdi",new MyDate(17,4,2001));
        Mahasiswa mhs5 = new Mahasiswa(127,"Agi",new MyDate(17,7,2001));

        Mahasiswa[] mahasiswaArray = {mhs1, mhs2, mhs3,mhs4,mhs5};

        for (Mahasiswa i : mahasiswaArray){
            System.out.println(cetakUmur(i));
        }

        Mahasiswa mahasiswaTermuda = umurTermuda(mahasiswaArray);
        System.out.println("\n");
        System.out.println("Mahasiswa termuda adalah " + cetakUmur(mahasiswaTermuda) + "\n");

        System.out.println("Mengurutkan mahasiswa dari yang termuda = ");
        urutkan(mahasiswaArray);
        cetakUmurArr(mahasiswaArray);
    }
    public static String cetakUmur(Mahasiswa m){
        int umur;
        int bulanSekarangSejakAwalMasehi = 2023 * 12 + 9;
        int bulanLahirSejakAwalMasehi = m.getTglLahir().getYear() * 12 + m.getTglLahir().getMonth();
        umur = bulanSekarangSejakAwalMasehi - bulanLahirSejakAwalMasehi;
        int umurTahun = umur / 12;
        int umurBulan = umur % 12;

        return m.getNama() + " dengan umur " + umurTahun + " tahun " + umurBulan + " bulan" + ", tanggal lahir : "+ m.getTglLahir();
    }

    public static void cetakUmurArr(Mahasiswa[] m){
        for (Mahasiswa mahasiswa : m) {
            int umur;
            int bulanSekarangSejakAwalMasehi = 2023 * 12 + 9;
            int bulanLahirSejakAwalMasehi = mahasiswa.getTglLahir().getYear() * 12 + mahasiswa.getTglLahir().getMonth();
            umur = bulanSekarangSejakAwalMasehi - bulanLahirSejakAwalMasehi;
            int umurTahun = umur / 12;
            int umurBulan = umur % 12;

            System.out.println(mahasiswa.getNama() + " dengan umur " + umurTahun + " tahun " + umurBulan + " bulan" + ", tanggal lahir : "+ mahasiswa.getTglLahir());
        }
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
    public static void urutkan(Mahasiswa[] mahasiswaArray) {
        for (int i = 0; i < mahasiswaArray.length ; i++) {
            for (int j=i+1; j < mahasiswaArray.length; j++){
                if (umurDalamBulan(mahasiswaArray[i]) > umurDalamBulan(mahasiswaArray[j])){
                    Mahasiswa mhsUrut = mahasiswaArray[i];
                    mahasiswaArray[i] = mahasiswaArray[j];
                    mahasiswaArray[j] = mhsUrut;
                }
            }
        }
    }
}
