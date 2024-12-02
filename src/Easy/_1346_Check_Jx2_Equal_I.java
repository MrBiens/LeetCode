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

    public boolean checkIfExist2(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr.length;j++){
                if( i!=j && arr[i]==arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }

}
