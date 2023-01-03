import java.util.*;

public class MyMapDemo {
    /**
     * 迭代器遍历获取内容
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("001", "25");
        map.put("002", "26");
        map.put("003", "27");

        // 打印集合
        System.out.println(myMapMethod(map));

        // 是否包含键
        boolean containKey = containKey(map);
        System.out.println(containKey);

        // 是否包含键
        boolean containValue = containValue(map);
        System.out.println(containValue);
    }

    private static boolean containValue(Map<String, String> map) {
        // 是否包含值
        boolean containsKey = map.containsKey("002");
        return containsKey;
    }

    private static boolean containKey(Map<String, String> map) {
        // 是否包含键
        boolean containsKey = map.containsValue("26");
        return containsKey;
    }

    private static Map<String, String> myMapMethod(Map<String, String> map) {
        System.out.println(map);
        return map;
    }
}
