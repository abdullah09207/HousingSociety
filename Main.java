public class Main {
    public static void main(String[] args) {
        HousingSociety society = new HousingSociety("HS-01", "Green Valley", "Lahore", 2015);

        Block blockA = new Block("A", "Block A");
        Block blockB = new Block("B", "Block B");
        society.addBlock(blockA);
        society.addBlock(blockB);

        blockA.addPlot(new ResidentialPlot("A-1", 45, 30, 1500000, 2, true, true));
        blockA.addPlot(new ResidentialPlot("A-2", 60, 45, 1500000, 1, false, false));
        blockB.addPlot(new CommercialPlot("B-1", 90, 60, 4000000, "Shopping mall", true, 5));
        blockB.addPlot(new CommunityCentrePlot("B-2", 60, 45, 0, "Community hall", 200, "Society office"));

        Owner ali = new Owner("O-1", "Ali Raza", "35202-1234567-1", "0300-1234567",
                              "ali@example.com", "Model Town, Lahore");
        blockA.findPlot("A-1").assignOwner(ali);

        society.displaySocietyInfo();

        System.out.println();
        for (Block b : society.getBlocks()) {
            System.out.println("--- " + b.getBlockName() + " ---");
            for (Plot p : b.getPlots()) {
                System.out.println(p.getPlotNumber() + " | " + p.getPlotType()
                        + " | " + p.calculateMarlas() + " marla | " + p.getSize());
            }
        }

        System.out.println();
        blockA.findPlot("A-1").displayOwnerDetails();
        System.out.println();
        blockA.findPlot("A-2").displayOwnerDetails();
    }
}