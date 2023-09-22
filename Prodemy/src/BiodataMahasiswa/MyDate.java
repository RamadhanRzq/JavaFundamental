package BiodataMahasiswa;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) throws Exception{
        if (day < 1){
            throw new Exception("Tanggal Tidak Valid");
        } else {
            this.day = day;
        }
    }
    public void setMonth(int month) throws Exception{
        if (month < 1 || month > 12)  throw new Exception("Bulan Tidak Valid");
        this.month = month;
    }
    public void setYear(int year) throws Exception{
        if (year < 1) throw new Exception("Tahun Tidak Valid");
        this.year = year;
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return day + "-" + month + "-" + year;
    }
    public MyDate (){}
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
