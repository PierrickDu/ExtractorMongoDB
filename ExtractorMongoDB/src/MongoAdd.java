import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoAdd {
    public void addClient(Client clientToAdd, String fileName) {
        if(!clientToAdd.check()){
            return;
        }
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase client = mongoClient.getDatabase("projetBigData");        
        MongoCollection<Document> client12 = client.getCollection(fileName);
        client12.insertOne(new Document()                
                .append("age", clientToAdd.age)
                .append("sexe", clientToAdd.sexe)
                .append("taux", clientToAdd.taux)
                .append("situationFamiliale", clientToAdd.fam)
                .append("nbEnfantsAcharge", clientToAdd.nbenfant)                
                .append("2emevoiture", clientToAdd.ndvoiture)
                .append("immatriculation", clientToAdd.immatriculation));
        mongoClient.close();
    }

    public void addMarketing(Marketing marketingToAdd, String fileName) {
        if(!marketingToAdd.check()){
            return;
        }
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase client = mongoClient.getDatabase("projetBigData");
        MongoCollection<Document> marketing = client.getCollection(fileName);
        marketing.insertOne(new Document()                
                .append("age", marketingToAdd.age)
                .append("sexe", marketingToAdd.sexe)
                .append("taux", marketingToAdd.taux)
                .append("situationFamiliale", marketingToAdd.fam)
                .append("nbEnfantsAcharge", marketingToAdd.nbenfant)                
                .append("2emevoiture", marketingToAdd.ndvoiture));
        mongoClient.close();
    }

    public void addCatalogue(Catalogue catalogueToAdd, String fileName) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase client = mongoClient.getDatabase("projetBigData");        
        MongoCollection<Document> catalogue = client.getCollection(fileName);
        catalogue.insertOne(new Document()                
                .append("marque", catalogueToAdd.marque)
                .append("nom", catalogueToAdd.nom)
                .append("puissance", catalogueToAdd.puissance)
                .append("longueur", catalogueToAdd.longueur)
                .append("nbPlaces", catalogueToAdd.nbPlaces)                
                .append("nbPortes", catalogueToAdd.nbPortes)
                .append("couleur", catalogueToAdd.couleur)
                .append("occasion", catalogueToAdd.occasion)
                .append("prix", catalogueToAdd.prix));
        mongoClient.close();
    }
}
