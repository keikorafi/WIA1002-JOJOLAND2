package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class main {
    
        
    public static void main(String args[]) {
        String residentFilePath = "resident.csv";
        String standFilePath = "stand.csv";

        loadFile loadSystemFile = new loadFile();
        ArrayList<resident> resident = loadSystemFile.loadresidentFromFile("resident.csv");
        ArrayList<stand> stand = loadSystemFile.loadstandFromFile("stand.csv");
        

        /*// Accessing the loaded resident data
        for (resident residents : resident) {
            System.out.println(residents.toString());
        }

        System.out.println();

        // Accessing the loaded stand data
        for (stand stands : stand) {
            System.out.println(stands.toString());
        }
        */
        loadSystemFile.displayResidentsInArea(loadSystemFile.selectResidentialArea());
    }
    
    
}
