package TugasBidangDatar;

class PersegiPanjang extends BidangDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    double getLuas() {
        return panjang * lebar;
    }
}
