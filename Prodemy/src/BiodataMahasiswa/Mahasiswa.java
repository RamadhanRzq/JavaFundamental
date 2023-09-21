package BiodataMahasiswa;

public class Mahasiswa {
    private String nama;
    private int nim;
    private MyDate TanggalLahir;

    public Mahasiswa(){}
    public Mahasiswa(int nim, String nama, MyDate TanggalLahir) {
        this.nim = nim;
        this.nama = nama;
        this.TanggalLahir = TanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public void setTglLahir(MyDate tgl) {
        this.TanggalLahir = tgl;
    }
    public String getNama(){
        return this.nama;
    }
    public int getNim(){
        return nim;
    }
    public MyDate getTglLahir(){
        return TanggalLahir;
    }

    public String toString (){
        return "Nama : " + nama + "\n" + "Nim : " + nim + "\n" + "Tanggal Lahir : "+ TanggalLahir;
    }
}
