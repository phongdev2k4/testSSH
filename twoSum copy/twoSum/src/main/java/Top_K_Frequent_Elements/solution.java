/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Top_K_Frequent_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author duyphong
 */
public class solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//       Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
//        C1;

       Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
              map.put(nums[i], map.get(nums[i]) + 1);

            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for ( Integer key : map.keySet() ) {
                list.add(key);
}
        list.sort((a, b) -> map.get(b) - map.get(a));
        int[] cc = new int [k];
        for (int i = 0 ; i <k;i++){
            cc [i]= list.get(i);
        }
                System.out.print(Arrays.toString(cc));
    }
    }
//        }
        //C2 . . . .  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//        int min = nums[0], max = nums[0];
//        for (int num : nums) {
//            if (num > max) {
//                max = num;
//            } else if (num < min) {
//                min = num;
//            }
//        }
//
//        int[] frequencies = new int[max - min + 1];
//        for (int num : nums) {
//            frequencies[num - min]++;
//        }
//
//        List<Integer>[] buckets = new List[nums.length + 1];
//        for (int i = min; i < max + 1; i++) {
//            int frequency = frequencies[i - min];
//            if (buckets[frequency] == null) {
//                buckets[frequency] = new ArrayList<>();
//            }
//            buckets[frequency].add(i);
//             
//        }
//        System.out.print(buckets.length - 1);
//       
//
//        int[] result = new int[k];
//        for (int i = buckets.length - 1; k > 0; i--) {
//            if (buckets[i] != null) {
//                for (int num : buckets[i]) {
//                    k -= 1;
//                    result[k] = num;
//                    if (k == 0) {
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.print(Arrays.toString(result));
        //C3 . . . .  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//                    int[] nums = {1, 1, 1, 2, 2, 2, 2, 3};
//                    int k = 2;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                      map.put(nums[i], (map.get(nums[i]))+1);
//
//            }
//            else{
//                 map.put(nums[i],1);
//            }
//        }
//  System.out.print(map.values());  
//                int[] a = new int [k];
//            for (int i = 0; i < nums.length; i--){
//      
//            }

    


