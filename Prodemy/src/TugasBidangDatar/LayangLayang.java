package TugasBidangDatar;

class LayangLayang extends BidangDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisi1;
    private double sisi2;

    public LayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    double getKeliling() {
        return 2 * (sisi1 + sisi2);
    }

    @Override
    double getLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }
}