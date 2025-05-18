package com.pluralsight;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class ContractFileManager {
    public void saveContract(Contract contract) {

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("contracts.csv", true));

                Vehicle vehicle = contract.getVehicleSold();
                String type = "";
                if (contract instanceof SalesContract) {
                    type = "SALE";
                } else if (contract instanceof LeaseContract) {
                    type = "LEASE";
                }
                String line = type + "," +
                        contract.getDate() + "," +
                        contract.getCustomerName() + "," +
                        contract.getCustomerEmail() + "," +
                        vehicle.getVin() + "," +
                        vehicle.getYear() + "," +
                        vehicle.getMake() + "," +
                        vehicle.getModel() + "," +
                        vehicle.getPrice() + "," +
                        contract.getTotalPrice() + "," +
                        contract.getMonthlyPayment();


                writer.write(line);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




