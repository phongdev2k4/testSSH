/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author duyphong
 */
public class GroupAnagrams {

 public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();       
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
    public static void main(String args[]) {
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
           String strs [] = {"eat","tea","tan","ate","nat","bat"};
            Map<String, List<String>> map = new HashMap<>();  
            
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            System.out.print(chars);
            String sortedWord = new String(chars);        
            if (!map.containsKey(sortedWord)) {
               map.put(sortedWord, new ArrayList<>());
            }

                map.get(sortedWord).add(word);
                   System.out.print(map.values());    
        }

            


//             aet
//             aet
//             ant
//             aet
//             ant
//             abt
         
    }
}
