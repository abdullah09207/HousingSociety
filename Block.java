import java.util.ArrayList;

public class Block {
    private String blockId;
    private String blockName;
    private ArrayList<Plot> plots = new ArrayList<>();

    public Block(String blockId, String blockName) {
        this.blockId = blockId;
        this.blockName = blockName;
    }

    public void addPlot(Plot p) {
        plots.add(p);
    }

    public boolean removePlot(String plotNo) {
        Plot p = findPlot(plotNo);
        if (p != null) {
            plots.remove(p);
            return true;
        }
        return false;
    }

    public Plot findPlot(String plotNo) {
        for (Plot p : plots) {
            if (p.getPlotNumber().equals(plotNo)) {
                return p;
            }
        }
        return null;
    }

    public int getPlotCount() {
        return plots.size();
    }

    public ArrayList<Plot> getAvailablePlots() {
        ArrayList<Plot> available = new ArrayList<>();
        for (Plot p : plots) {
            if (!p.isSold()) {
                available.add(p);
            }
        }
        return available;
    }

    public String getBlockId()   { return blockId; }
    public String getBlockName() { return blockName; }
    public ArrayList<Plot> getPlots() { return plots; }
}