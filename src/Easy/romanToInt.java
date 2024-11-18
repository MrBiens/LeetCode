package Easy;

import java.util.HashMap;
import java.util.Map;

class romanToInt {
    public int romanToInt(String s) {
        // Bảng giá trị của các ký tự số La Mã
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // Lấy giá trị hiện tại
            int current = romanMap.get(s.charAt(i));
            // Nếu không phải ký tự cuối cùng và ký tự hiện tại nhỏ hơn ký tự tiếp theo
            if (i < s.length() - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
