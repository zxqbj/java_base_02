import java.util.ArrayList;
import java.util.List;

public class MyArrayListDemo {
    /**
     * 迭代器遍历获取内容
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("BBB");
        list.add("ccc");

        /**
         * 根据位置插入元素
         */
        ArrayList<String> addElementByIndex = addElementByIndex(list);

    }

    private static ArrayList<String> addElementByIndex(ArrayList<String> list) {
        list.add(0, "1111");
        return list;
    }

}
