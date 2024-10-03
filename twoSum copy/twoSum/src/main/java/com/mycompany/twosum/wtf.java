/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.twosum;

/**
 *
 * @author duyphong
 */
class wtf {
        public int[] twoSum(int[] nums, int target) {
            int[] a = {};
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {  // Fix: j should be less than nums.length
                    if (nums[i] + nums[j] == target) {  // Fix: compare the values in the array, not the indices
                        a = new int[]{i, j};        
                    }
                }
            }
            return a;
        }
    
}
