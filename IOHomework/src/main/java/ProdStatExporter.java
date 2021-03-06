import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProdStatExporter {
    public void writeStatsToFile(BestSellingProducts prodStats, TopCustomer custStats) throws IOException {
        File f = new File("stats.txt");
        if (f.exists()) {
            f.delete();
        } else {
            f.createNewFile();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            List<Product> products = prodStats.getProductsByPiecesSold();
            List<Customer> customerByNrOfOrders = custStats.getCustomerByNrOfOrders();
            List<Customer> customersByMoneySpent = custStats.getCustomerByMostMoneySpent();
            bw.append("Best Selling Products" + "\n");
            for (int i = 0; i < products.size(); i++) {
                if (i<10) {
                    bw.append("\n" + (i + 1) + ". " + products.get(i).getName() + " - " + products.get(i).getSoldPiecesCounter() + " Units sold!");
                    bw.newLine();
                } else {
                    break;
                }
            }
            bw.append("\n" + "Customers with most Orders:" + "\n");
            for (int i = 0; i < customerByNrOfOrders.size(); i++){
                if (i<10) {
                    bw.append("\n" + (i+1) + ". " + customerByNrOfOrders.get(i).getName() + " - " + customerByNrOfOrders.get(i).getNrOfOrders() + " orders");
                    bw.newLine();
                } else {
                    break;
                }
            }
            bw.append("\n" + "Top Customers" + "\n");
            for(int i = 0; i<customersByMoneySpent.size(); i++){
                if (i<10) {
                    bw.append("\n" + (i+1) + ". " + customersByMoneySpent.get(i).getName() + " - $" + customersByMoneySpent.get(i).getMoneySpent());
                    bw.newLine();
                } else {
                    break;
                }
            }


        }
    }
}
