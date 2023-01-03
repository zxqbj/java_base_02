import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MySetDemo {
    /**
     * 迭代器遍历获取内容
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<String> list = new TreeSet<String>();
        list.add("aaa");
        list.add("BBB");
        list.add("ccc");

        /**
         * 循环遍历的三种方法：for、iterator、增强for循环
         *注意：set集合没有get(i)方法
         */

        // 第一种方式迭代器
        iteratorMethod(list);

        // 第二种方式增强for循环
        getForSetVlue(list);

    }

    private static void iteratorMethod(Set<String> setList) {
        Iterator<String> iterator = setList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    private static void getForSetVlue(Set<String> setList) {
        for (String s : setList) {
            System.out.println(s);
        }
    }
}
