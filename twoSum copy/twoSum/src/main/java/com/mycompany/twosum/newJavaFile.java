/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author duyphong
 */
public class newJavaFile {
    public void twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    int[] pair = {i, j};
//                    System.out.print("[" + pair[0] + "," + pair[1] + "] ");
//                }
//            }
//        }
//   HashMap<Integer, Integer> hashMap = new HashMap<>();
//    for (int i = 0 ; i < nums.length;i++){
//        int complement = target - nums[i];
//        if(hashMap.containsKey(complement)){
//                System.out.print("[" + hashMap.get(complement) + "," + i + "] ");
//        }
//        hashMap.put(nums[i], i);
//    }
        HashMap<Integer, Integer> numMap = new HashMap<>();
 
           int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
          
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i ) {
                 System.out.print("[" + numMap.get(complement) + "," + i + "] ");
            }
        }
    }
    

    public static void main(String args[]) {
        newJavaFile mainInstance = new newJavaFile();  // Create an instance of the class
         int [] nums = {11,7,2,15};
         int target = 9;
        mainInstance.twoSum(nums, target);  // Call the method on the instance
    }


}
