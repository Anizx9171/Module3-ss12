package bt.bt1.bt2;

import java.util.TreeMap;

public class FindSoLonThu2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3, 10};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int num : arr) {
            treeMap.put(num, 0);
        }

        int maxKey = treeMap.lastKey();
        treeMap.remove(maxKey);

        if (treeMap.isEmpty()) {
            System.out.println("Không có phần tử lớn thứ hai trong mảng.");
        } else {
            int secondLargest = treeMap.lastKey();
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondLargest);
        }
        }
}
