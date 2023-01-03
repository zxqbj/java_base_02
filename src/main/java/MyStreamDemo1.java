import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStreamDemo1 {
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
        firstMethod(list);
        System.out.println("-------------------");
        // lambda表达式方式
        lambdaMethod(list);
    }


    private static void firstMethod(ArrayList<String> list) {
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean booleanStr = s.startsWith("aaa") && s.length() ==3;
                return booleanStr;
            }
        }).forEach(System.out::println);
    }

    private static void lambdaMethod(ArrayList<String> list) {
        list.stream().filter( (String s) ->{
            boolean booleanStr = s.startsWith("aaa") && s.length() == 3;
            return booleanStr;
        }).forEach(s -> System.out.println(s));
    }
}
