package TugasBidangDatar;

class Lingkaran extends BidangDatar {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getLuas() {
        return Math.PI * radius * radius;
    }
}
