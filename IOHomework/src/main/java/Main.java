import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("sales.csv");
        Path path = file.toPath();

        FileReader fr = new FileReader(file);
        List<Order> orders = new OrderReader(fr).getOrders();


        BestSellingProducts prodStats = new BestSellingProducts();
        prodStats.addProducts(orders);
        prodStats.getProductsByPiecesSold();
        TopCustomer custStats = new TopCustomer();
        custStats.addCustomers(orders);
        custStats.getCustomerByNrOfOrders();

        ProdStatExporter exporter = new ProdStatExporter();
        exporter.writeStatsToFile(prodStats,custStats);
    }
}

