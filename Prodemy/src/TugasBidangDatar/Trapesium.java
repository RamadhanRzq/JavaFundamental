package TugasBidangDatar;

class Trapesium extends BidangDatar {
    private double alasAtas;
    private double alasBawah;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public Trapesium(double alasAtas, double alasBawah, double tinggi, double sisi1, double sisi2) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    double getKeliling() {
        return alasAtas + alasBawah + sisi1 + sisi2;
    }

    @Override
    double getLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }
}
