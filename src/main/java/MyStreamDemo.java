import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MyStreamDemo {
    /**
     * 数据流方式获取内容
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("BBB");
        list.add("ccc");

        // 第一种单列集合
        singleDateStream(list);
        System.out.println("--------------------");

        // 第二种多列集合
        mulmitDateStream();
        System.out.println("--------------------");

        // 第三种数组
        arrayDateStream();
        System.out.println("--------------------");

        // 第四种其他同类型数据
        matchDateTypeStream();
        System.out.println("--------------------");

    }

    private static void singleDateStream(ArrayList<String> list) {
        list.stream().forEach(s -> System.out.println(s));
    }

    private static void mulmitDateStream() {
        Map<String, String> map = new HashMap<>();
        map.put("001", "zhangsan");
        map.put("002", "lisi");
        map.put("003", "wangwu");
        map.put("004", "zhaoliu");
        map.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("--------------------");
        map.entrySet().stream().forEach(stringStringEntry -> System.out.println(stringStringEntry));
    }

    private static void arrayDateStream() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void matchDateTypeStream() {
        Stream.of("01", "02", "03", "04").forEach(s -> System.out.println(s));
    }

}
