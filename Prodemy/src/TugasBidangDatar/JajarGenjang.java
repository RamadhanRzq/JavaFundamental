package TugasBidangDatar;

class JajarGenjang extends BidangDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public JajarGenjang(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    double getKeliling() {
        return 2 * (sisi1 + sisi2);
    }

    @Override
    double getLuas() {
        return alas * tinggi;
    }
}
