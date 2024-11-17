package Easy;

import java.util.HashMap;
import java.util.Map;
//a[0] + a[1] = target
public class FindTwoSum {
        //for On2
        public int[] twoSumBasic(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if( (nums[i]+nums[j]) == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{};
        }

        //HashMap
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>(); //key - value
            for(int i=0;i<nums.length;i++){
                int numberToFind=target-nums[i];
                if(map.containsKey(numberToFind)){
                    return new int[]{map.get(numberToFind),i};
                }
                map.put(nums[i], i); //Lưu giá trị vào HashMap} map.put(nums[i], i);
            }
            return new int[]{}; // Trả về một mảng trống nếu không tìm thấy cặp nào
        }



}

