/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solidproject;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author jisus
 */
public class Connection {

    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoClient createConnection() {
        MongoClient mongo = null;
        String server = "localhost";
        Integer port = 27017;
        try {
            mongo = MongoClients.create(
                    MongoClientSettings.builder()
                            .applyToClusterSettings(builder
                                    -> builder.hosts(Arrays.asList(new ServerAddress(server, port))))
                            .build());
            database = mongo.getDatabase("solidProject");
            collection = database.getCollection("products");

        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error in the Mongo Connetion, error: " + e.toString());
        }
        return mongo;
    }

    ;
        public void insertProduct(Product product) {
        Document document = new Document();
        document.put("id", product.getId());
        document.put("name", product.getName());
        document.put("stock", product.getStock());
        document.put("price", product.getPrice());
        collection.insertOne(document);
    }

    public void deleteProduct(int id) {
        collection.deleteOne(new BasicDBObject().append("id", id));
    }

    public void updateProduct(Product product) {
        BasicDBObject dataUpdated = new BasicDBObject();
        dataUpdated.append("name", product.getName());
        dataUpdated.append("stock", product.getStock());
        dataUpdated.append("price", product.getPrice());
        collection.updateOne(new BasicDBObject().append("id", product.getId()),
                new BasicDBObject().append("$set", dataUpdated));
    }

    public List<Product> findProducts() {
        List<Product> products = new ArrayList<>();
        for (Document document : collection.find()) {
            Product product = new Product();
            product.setId(document.getInteger("id"));
            product.setName(document.getString("name"));
            product.setStock(document.getInteger("stock"));
            product.setPrice(document.getDouble("price").floatValue());

            products.add(product);
        }
        return products;
    }

}
