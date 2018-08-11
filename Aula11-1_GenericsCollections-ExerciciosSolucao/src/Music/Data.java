/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * @author Sebastián
 */
public class Data {

    private static final String MUSIC = "music.txt";
    private Map<String, Integer> map = new HashMap<>();

    public Data() {
        readData();
    }

    public void showRawData() {
        map.keySet().forEach((key) -> {
            Integer value = map.get(key);
            System.out.println(key + " " + value.toString());
        });
    }

    private void readData() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(MUSIC));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.equals("")) {

                        Integer i = map.get(word);
                        if (i == null) {
                            map.put(word, 1);
                        } else {
                            map.put(word, i + 1);
                        }
                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void showSortedData(){
        map.entrySet().stream().sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
        
    }

}
