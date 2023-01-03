import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionDemo {
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

        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String nextStr = iterator.next();
            //System.out.println(nextStr);
        }*/

        //删除元素
        ArrayList<String> removelist = forMoveElement(list);
        System.out.println(removelist);

    }

    /**
     * 迭代器删除元素
     *
     * @param list
     * @return
     */
    private static ArrayList<String> forMoveElement(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            String elementStr = list.get(i);
            if ("aaa".equals(elementStr)) {
                list.remove(elementStr);
                i++;
            }
        }
        return list;
    }
}
