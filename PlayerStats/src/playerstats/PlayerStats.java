/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kiaka
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String []names = new String[80];
        int[]scores = new int [80];
        
        readNamesAndScores(names, scores, args[0]);
       }
    
        private static void readNamesAndScores (String[]names, int[]scores, String filename){
        try {
            Scanner scan = new Scanner(new File(filename));
            
            int currIndex = 0;
            while(scan.hasNext()){
                String[] line = scan.nextLine().split(" ");
                names[currIndex]= line[0];
                scores[currIndex] = Integer.parseInt(line[1]);
                
                currIndex++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File could not be found in readNamesAndScores");
        }
         
    }
}
