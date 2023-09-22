package BiodataMahasiswa;
import java.util.Arrays;
public class Soal123 {
    public static void main(String[] args) {
        int[] bilangan = {33,20,44,56,19,78,90,105,67,89};
        int bilTerkecil = bilangan[0];
        int bilTerbesar = bilangan[0];

        for(int i = 0; i < bilangan.length; i++){
            if (bilTerkecil > bilangan[i]){
                bilTerkecil = bilangan[i];
            }
            if (bilTerbesar < bilangan[i]){
                bilTerbesar = bilangan[i];
            }
        }

        System.out.println("Angka di dalam array = "+ Arrays.toString(bilangan));
        //Bilangan Terkecil
        System.out.println("Bilangan terkecil dalam array tersebut adalah = "+bilTerkecil);
        //Bilangan Terbesar
        System.out.println("Bilangan terbesar dalam array tersebut adalah = "+bilTerbesar);

        //Urutkan Bilangan
        urutkan(bilangan);
        System.out.println("Array setelah diurutkan:");
        for (int i : bilangan){
            System.out.print(i + ",");
        }
    }
    public static void urutkan(int[] bilangan){
        for (int i = 0; i < bilangan.length ; i++) {
            for (int j=i+1; j < bilangan.length; j++){
                if (bilangan[i] > bilangan[j]){
                    int bilUrut = bilangan[i];
                    bilangan[i] = bilangan[j];
                    bilangan[j] = bilUrut;
                }
            }
        }
        System.out.println(Arrays.toString(bilangan));
    }
}
