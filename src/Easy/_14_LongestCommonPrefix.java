package Easy;

public class _14_LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            // Start with the first string in the array as the prefix
            String prefix = strs[0];

            // i = 1; flower = flow ; i = 2 flow = fl
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) { // khi chưa tìm thấy sẽ return -1(base indexOf) - tìm thấy sẽ return 0
                    // sau mỗi lần không tìm thấy length sẽ -1
                    prefix = prefix.substring(0, prefix.length() - 1);  // vd step 1 : 0,6 ( 6 là điểm kết thúc nên sẽ cut 0-5)
                    if (prefix.isEmpty()) return "";
                }
            }

            return prefix;
        }

        /*
        * vòng lặp while sẽ chạy đến khi tìm thấy , có nghĩa là hiện tại đang thỏa mãn điều kiện khi vòng lặp while !=0 (indexOf return -1)vì không tìm thấy,
        * khi nó ==0 tức là nó đã tìm thấy ,nó sẽ trả về index đầu tiên và sẽ dừng vòng while , đồng thời tăng i lên 1 đơn vị và lặp lại hành động*/


    // Example usage:
        public static void main(String[] args) {

            String[] strs1 = {"flower", "flow", "flight"};
            System.out.println(longestCommonPrefix(strs1));  // Output: "fl"

            String[] strs2 = {"dog", "racecar", "car"};
            System.out.println(longestCommonPrefix(strs2));  // Output: ""

    }

}
