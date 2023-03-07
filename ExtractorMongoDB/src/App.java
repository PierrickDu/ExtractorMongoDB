import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class App {
    public static void main(String[] args) throws Exception {        
        System.out.println("test test".replaceAll(" ", ""));
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase projetBigData = mongoClient.getDatabase("projetBigData");        
        projetBigData.drop();        
        projetBigData.createCollection("Clients_4");
        projetBigData.createCollection("Clients_12");
        projetBigData.createCollection("Marketing");
        projetBigData.createCollection("Catalogue");
        mongoClient.close();        
        ReadCsv reader = new ReadCsv();
        reader.readClient("Clients_4");
        reader.readClient("Clients_12");
        reader.readMarketing("Marketing");
        reader.readCatalogue("Catalogue");
    }
}
