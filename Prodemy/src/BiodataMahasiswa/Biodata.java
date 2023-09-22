package BiodataMahasiswa;
public class Biodata {
    public static void main(String[] args) throws Exception {
        MyDate tglLahir = new MyDate();
        tglLahir.setDay(20);
        tglLahir.setMonth(9);
        tglLahir.setYear(2023);

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Rama");
        mhs.setNim(20092023);
        mhs.setTglLahir(tglLahir);

        System.out.println(mhs.getNama());
        System.out.println(mhs.getNim()+ "\n");
        System.out.println(tglLahir.getDay()+ "-" + tglLahir.getMonth() + "-" + tglLahir.getYear()+"\n");
        System.out.println(mhs + "\n");
        System.out.println("Tanggal Lahir : "+ mhs.getTglLahir());
    }
}