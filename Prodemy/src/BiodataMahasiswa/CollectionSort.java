package BiodataMahasiswa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(HitungUmur.mhs1);
        mahasiswaList.add(HitungUmur.mhs2);
        mahasiswaList.add(HitungUmur.mhs3);
        mahasiswaList.add(HitungUmur.mhs4);
        mahasiswaList.add(HitungUmur.mhs5);

        Collections.sort(mahasiswaList);
        System.out.println(mahasiswaList);
    }
}
