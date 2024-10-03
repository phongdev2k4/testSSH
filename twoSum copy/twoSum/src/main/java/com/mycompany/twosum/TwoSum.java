/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.twosum;

/**
 *
 * @author duyphong
 */
public class TwoSum {

    public class Main {

        public static void main(String[] args) {
            // Example usage
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(nums, target);
            System.out.print(result[0] + "," + result[1]);
        }

        public static int[] twoSum(int[] nums, int target) {
            int a = 0;
            int b = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {  // Fix: j should be less than nums.length
                    if (nums[i] + nums[j] == target) {  // Fix: compare the values in the array, not the indices
                        a = i;
                        b = j;
                        break;  // Fix: exit the loop once a pair is found
                    }
                }
            }

            int wtf[] = {a, b};
            return wtf;
        }
    }

}
