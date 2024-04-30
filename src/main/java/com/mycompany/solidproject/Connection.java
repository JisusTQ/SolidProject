/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solidproject;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jisus
 */
public class Connection {
    public MongoClient createConnection(){
    MongoClient mongo = null;
    String server = "localhost";
    Integer port = 27017;
        try {
            mongo = MongoClients.create(
            MongoClientSettings.builder()
                .applyToClusterSettings(builder ->
                        builder.hosts(Arrays.asList(new ServerAddress(server, port))))
                .build());
            
            String databaseNames = mongo.getDatabase("solidProject").getName();
            JOptionPane.showMessageDialog(null, "Connected to Mongo successfully: ");
            JOptionPane.showMessageDialog(null, "The List is:  "+ databaseNames);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error in the Mongo Connetion, error: "+e.toString());
        }
        return mongo;
    };
    
}
