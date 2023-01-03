import java.util.ArrayList;

public class MyArrayListDemo1 {
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

        //传统方式获取
        ArrayList<String> addElementByIndex = getListValue(list);
        System.out.println(addElementByIndex);

        System.out.println("--------------------");
        list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() ==3).forEach(s -> System.out.println(s));
    }

    private static ArrayList<String> getListValue(ArrayList<String> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String elementValue : list) {
            if(elementValue.startsWith("a") && elementValue.length() == 3){
                resultList.add(elementValue);
            }
        }
        return resultList;
    }
}
