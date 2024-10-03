/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package validAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author duyphong
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        String s = "phong";
        String t = "nagaram";
        boolean a = true;
        
        char[] sChars = s.toCharArray();

        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
                 System.out.print("" +Arrays.toString(sChars));
        Arrays.sort(tChars);
///
//        System.out.print("" +isAnagram(s, t));
////        System.out.print("" +Arrays.toString(tChars));
//
//        Map<Character, Integer> count = new HashMap<>();
//        
////         Count the frequency of characters in string s
//        for (char x : s.toCharArray()) {
//            count.put(x, count.getOrDefault(x, 0) + 1);
//            System.out.print(count);
//        }
//        // Decrement the frequency of characters in string t
//        for (char x : t.toCharArray())  { //nagaram
//            count.put(x, count.getOrDefault(x, 0) - 1);
//    
//        }
//    
////
////        // Check if any character has non-zero frequency
//        for (int val : count.values()) {
//            if (val != 0) {
//                a = false;
//            }         
//        }

      
    }
 

}
