import java.util.ArrayList;
import java.util.function.Consumer;

public class MyStreamDemo3 {
    /**
     * 数据流中的forEach
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("BBB");
        list.add("ccc");

        // 使用匿名内部类实现
        firstMethodForForeach(list);
        System.out.println("------------------");

        // 使用lambda表达式
        secordMethosForForeach(list);
        System.out.println("------------------");

        // lambda简化版
        thirdMethodForForeach(list);

    }

    private static void firstMethodForForeach(ArrayList<String> list) {
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    private static void secordMethosForForeach(ArrayList<String> list) {
        list.stream().forEach((String str) -> {
            System.out.println(str);
        });
    }

    private static void thirdMethodForForeach(ArrayList<String> list) {
        list.stream().forEach(str -> System.out.println(str));
    }

}
