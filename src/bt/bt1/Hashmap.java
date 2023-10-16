package bt.bt1;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 1, 2, 4, 5, 4};
        Map<Integer, Integer>  hashMap = new HashMap<>();
        for (int num: arr) {
            if (hashMap.containsKey(num)) {
                int count = hashMap.get(num);
                hashMap.put(num, count + 1);
            }else{
                hashMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int  key = entry.getKey();
            int count = entry.getValue();
            System.out.printf("Số %d xuất hiện %d lần \n", key,count);
        }
    }
}
