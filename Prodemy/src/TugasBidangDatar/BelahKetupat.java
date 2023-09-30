package TugasBidangDatar;

class BelahKetupat extends BidangDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisi;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    @Override
    double getKeliling() {
        return 4 * sisi;
    }

    @Override
    double getLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }
}
