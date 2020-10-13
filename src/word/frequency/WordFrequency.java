/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.frequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author leandroestevez
 */
public class WordFrequency {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        File inputFile = new File("words.txt");
        
        Scanner in = null;
        
        try {
            in = new Scanner(inputFile);
        }
        catch(FileNotFoundException exception) {
            
            System.out.println("File not found");
            System.exit(0);
            
        }
        
        Map<String, Integer> frequency = new TreeMap<>();
        
        while(in.hasNext()) {
            
            String word = in.next();
            
            if(frequency.get(word) == null) {
                
                frequency.put(word, 1);
                
            } else {
                
                frequency.put(word, frequency.get(word) + 1);
                
            }
            
        }
        
        for(String key : frequency.keySet()) {
            
            System.out.println(frequency.get(key) + " " + key);
            
        }
        
    }
    
}
