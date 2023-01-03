import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyStreamDemo4 {
    /**
     * 数据流中的Filter与collection
     * collection只是针对stream获取的数据进行收集，并不会对源数据修改
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.add(10);

        // filter to list
        colletionListMethod(list);

        // filter to set
        collectionSetMethod(list);

    }

    private static void colletionListMethod(ArrayList<Integer> list) {
        List<Integer> filterCollectionArr = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(filterCollectionArr);
    }

    private static void collectionSetMethod(ArrayList<Integer> list) {
        Set<Integer> filterCollectionSet = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());
        System.out.println(filterCollectionSet);
    }

}
