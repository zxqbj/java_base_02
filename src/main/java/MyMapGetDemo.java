import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMapGetDemo {
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

        // 获取map集合的几种方式
        // 第一种方式：keySet
        keySetGetMapValue(map);

        System.out.println("---------------------------");
        // 第二种方式：keyEntry
        entrySetGetMapkeyOrValue(map);

        System.out.println("---------------------------");

        // 第三种方式
        lambdaGetMapKeyOrValue(map);
    }

    private static void lambdaGetMapKeyOrValue(Map<String, String> map) {
        map.forEach((String key, String value)->{
            System.out.println(key+"-------"+value);
        });
    }

    private static void entrySetGetMapkeyOrValue(Map<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-------"+value);
        }
    }

    private static void keySetGetMapValue(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        for(String keys : keySet){
            String key = keys;
            String value = map.get(keys);
            System.out.println(key+"-------"+value);
        }
    }
}
