package com.pluralsight;
import java.io.FileWriter;   // Capital 'W'
import java.io.BufferedWriter;
import java.io.IOException;


public class ContractFileManager {
    public void saveContract(Contract contract) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv", true));
            // you'll write contract data here
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
