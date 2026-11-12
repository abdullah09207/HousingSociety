public abstract class Plot {
    private String plotNumber;
    private double length;
    private double width;
    private PlotSize size;
    private Owner owner;
    private boolean sold;
    private double pricePerMarla;

    public Plot(String plotNumber, double length, double width, double pricePerMarla) {
        this.plotNumber = plotNumber;
        this.length = length;
        this.width = width;
        this.pricePerMarla = pricePerMarla;
        this.sold = false;
        this.size = determineSize();
    }

    public double calculateMarlas() {
        return (length * width) / 272.25;
    }

    public PlotSize determineSize() {
        double marlas = calculateMarlas();
        if (marlas < 7.5) {
            return PlotSize.MARLA_5;
        } else if (marlas < 15) {
            return PlotSize.MARLA_10;
        } else {
            return PlotSize.CANAL_1;
        }
    }

    public double calculatePrice() {
        return calculateMarlas() * pricePerMarla;
    }

    public void assignOwner(Owner owner) {
        this.owner = owner;
        this.sold = true;
    }

    public void displayOwnerDetails() {
        System.out.println("Plot " + plotNumber + " (" + getPlotType() + ", " + size + ")");
        if (owner == null) {
            System.out.println("No owner yet. Plot is available.");
        } else {
            owner.displayDetails();
        }
    }

    public abstract String getPlotType();

    public String getPlotNumber() { return plotNumber; }
    public double getLength()     { return length; }
    public double getWidth()      { return width; }
    public PlotSize getSize()     { return size; }
    public Owner getOwner()       { return owner; }
    public boolean isSold()       { return sold; }
}