import java.util.ArrayList;


public class HousingSociety {
    private String societyId;
    private String name;
    private String city;
    private int establishedYear;
    private ArrayList<Block> blocks = new ArrayList<>();

    public HousingSociety(String societyId, String name, String city, int establishedYear) {
        this.societyId = societyId;
        this.name = name;
        this.city = city;
        this.establishedYear = establishedYear;
    }

    public void addBlock(Block b) {
        blocks.add(b);
    }

    public boolean removeBlock(String blockId) {
        Block b = findBlock(blockId);
        if (b != null) {
            blocks.remove(b);
            return true;
        }
        return false;
    }

    public Block findBlock(String blockId) {
        for (Block b : blocks) {
            if (b.getBlockId().equals(blockId)) {
                return b;
            }
        }
        return null;
    }

    public int getTotalPlots() {
        int total = 0;
        for (Block b : blocks) {
            total = total + b.getPlotCount();
        }
        return total;
    }

    public ArrayList<Plot> getAvailablePlots() {
        ArrayList<Plot> available = new ArrayList<>();
        for (Block b : blocks) {
            available.addAll(b.getAvailablePlots());
        }
        return available;
    }

    public void displaySocietyInfo() {
        System.out.println("Society : " + name + " (" + societyId + ")");
        System.out.println("City    : " + city);
        System.out.println("Year    : " + establishedYear);
        System.out.println("Blocks  : " + blocks.size());
        System.out.println("Plots   : " + getTotalPlots());
        System.out.println("Available plots: " + getAvailablePlots().size());
    }

    public ArrayList<Block> getBlocks() { return blocks; }
}