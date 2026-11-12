
public class CommercialPlot extends Plot {
    private String businessCategory;
    private boolean mainRoadFacing;
    private int maxAllowedFloors;

    public CommercialPlot(String plotNumber, double length, double width, double pricePerMarla,
                          String businessCategory, boolean mainRoadFacing, int maxAllowedFloors) {
        super(plotNumber, length, width, pricePerMarla);
        this.businessCategory = businessCategory;
        this.mainRoadFacing = mainRoadFacing;
        this.maxAllowedFloors = maxAllowedFloors;
    }

    public String getBusinessCategory() { return businessCategory; }
    public boolean isMainRoadFacing()   { return mainRoadFacing; }
    public int getMaxAllowedFloors()    { return maxAllowedFloors; }

    public String getPlotType() {
        return "Commercial";
    }
}






