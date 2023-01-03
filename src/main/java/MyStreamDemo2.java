import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MyStreamDemo2 {
    /**
     * 数据流方法
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("aaa");
        list.add("BBB");
        list.add("ccc");
        list.add("ddd");
        list.add("ddd");

        // 第一个limit:截取
        limitStreamMethos(list);
        System.out.println("------------------");

        // skip:截取后边
        skipStreamMethod(list);
        System.out.println("------------------");

        // 第三个：排重distinct
        distinctStreamMethod(list);
        System.out.println("------------------");

        // 第四个，合并
        concatStreamMethod(list);

    }

    private static void skipStreamMethod(ArrayList<String> list) {
        list.stream().skip(2).forEach(s -> System.out.println(s));
    }

    private static void limitStreamMethos(ArrayList<String> list) {
        list.stream().limit(2).forEach(s -> System.out.println(s));
    }

    private static void distinctStreamMethod(ArrayList<String> list) {
        list.stream().distinct().forEach(s -> System.out.println(s));
    }

    private static void concatStreamMethod(ArrayList<String> list) {
        Stream.concat(list.stream(), new ArrayList<String>().stream()).forEach(s -> System.out.println(s));
    }
}
