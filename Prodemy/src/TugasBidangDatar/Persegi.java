package TugasBidangDatar;

class Persegi extends BidangDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double getKeliling() {
        return 4 * sisi;
    }

    @Override
    double getLuas() {
        return sisi * sisi;
    }
}