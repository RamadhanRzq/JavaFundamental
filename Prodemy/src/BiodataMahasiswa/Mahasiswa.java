package BiodataMahasiswa;
public class Mahasiswa {
    private String nama;
    private int nim;
    private MyDate TanggalLahir;
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
        return nama;
    }
    public int getNim(){
        return nim;
    }
    public MyDate getTglLahir(){
        return TanggalLahir;
    }
    public String toString (){
        return "Nama : " + nama + ", Nim : " + nim + ", Tanggal Lahir : "+ TanggalLahir + "\n";
    }
    public Mahasiswa(){}
    public Mahasiswa(int nim, String nama, MyDate TanggalLahir) {
        this.nim = nim;
        this.nama = nama;
        this.TanggalLahir = TanggalLahir;
    }
}
