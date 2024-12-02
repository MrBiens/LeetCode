package Easy;

import java.util.HashSet;

public class _1346_Check_Jx2_Equal_I {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num)|| (num % 2 ==0 &&set.contains(num/2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
//10 2 5 3
//3 1 7 11
    public static boolean checkIfExist2(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr.length;j++){
                if( i!=j && arr[i]==arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }

        public static boolean checkIfExist3(int[] arr) {
            // Step 1: Iterate through all pairs of indices
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    // Step 2: Check the conditions
                    if (i != j && arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
            // No valid pair found
            return false;
        }


    public static void main(String[] args) {
        int arr[] = {10,2,5,3};
        int arr1[] = {7,1,14,11}; // nếu i[2] = 14 và j[1] = 1 thì sẽ bỏ ra trường hợp j[0]*2 = 14 -> j =1 là false
//        System.out.println(checkIfExist2(arr));
        System.out.println(checkIfExist3(arr1));

    }

}
