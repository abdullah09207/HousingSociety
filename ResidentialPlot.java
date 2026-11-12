 public class ResidentialPlot extends Plot {
    private int numberOfFloors;
    private boolean constructed;
    private boolean cornerPlot;

    public ResidentialPlot(String plotNumber, double length, double width, double pricePerMarla,
                           int numberOfFloors, boolean constructed, boolean cornerPlot) {
        super(plotNumber, length, width, pricePerMarla);
        this.numberOfFloors = numberOfFloors;
        this.constructed = constructed;
        this.cornerPlot = cornerPlot;
    }

    public int getNumberOfFloors() { return numberOfFloors; }
    public boolean isConstructed() { return constructed; }
    public boolean isCornerPlot()  { return cornerPlot; }

    public String getPlotType() {
        return "Residential";
    }
}
