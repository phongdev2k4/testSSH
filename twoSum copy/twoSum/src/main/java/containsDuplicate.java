
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author duyphong
 */
public class containsDuplicate {
       public static boolean containsDuplicate(int[] nums) {
           HashMap<Integer,Integer> map = new HashMap<>();
           int count = 0;
           for(int i=0 ; i<nums.length;i++){
               if(map.containsKey(nums[i])){
                   count++;
               }
               map.put(nums[i], i);
           }
           return count>0;                  
    }
        public static void main(String[] args){
            int[] nums = {2, 7, 2};
            
            System.out.print(containsDuplicate(nums));
        }
}
