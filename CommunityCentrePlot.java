public class CommunityCentrePlot extends Plot {
    private String purpose;
    private int capacity;
    private String managedBy;

    public CommunityCentrePlot(String plotNumber, double length, double width, double pricePerMarla,
                               String purpose, int capacity, String managedBy) {
        super(plotNumber, length, width, pricePerMarla);
        this.purpose = purpose;
        this.capacity = capacity;
        this.managedBy = managedBy;
    }

    public String getPurpose()   { return purpose; }
    public int getCapacity()     { return capacity; }
    public String getManagedBy() { return managedBy; }

    public String getPlotType() {
        return "Community Centre";
    }
}





