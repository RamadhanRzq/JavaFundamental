package ClassDanObject;

class Mahasiswa{
    String nama;
    int nim;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.nim = 12234;
        mhs1.jurusan = "Teknik Informatika";
        mhs1.IPK = 3.71;
        mhs1.umur = 24;

        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);
        System.out.println(mhs1.IPK);
        System.out.println(mhs1.umur);        
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Rudi";
        mhs2.nim = 12235;
        mhs2.jurusan = "Teknik Informatika";
        mhs2.IPK = 3.5;
        mhs2.umur = 24;

        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);
        System.out.println(mhs2.IPK);
        System.out.println(mhs2.umur);
    }
}
