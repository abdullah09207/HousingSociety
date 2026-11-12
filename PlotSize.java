public enum PlotSize {
    MARLA_5(5),
    MARLA_10(10),
    CANAL_1(20);   

    private double marlas;

    PlotSize(double marlas) {
        this.marlas = marlas;
    }

    public double getMarlas() {
        return marlas;
    }

    public double getSqFt() {
        return marlas * 272.25;
    }
}