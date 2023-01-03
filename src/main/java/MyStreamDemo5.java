import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyStreamDemo5 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, String> userMap = new HashMap<String, String>();
        List<String> list = new ArrayList<>();
        list.add("zhangsan,20");
        list.add("lisi,21");
        list.add("wangwu,22");
        list.add("zhaoliu,23");
        list.add("qianqi,24");

        // 将list中的信息过滤出年龄大于22的，再保存到map集合中
        arrayListToMapMethod(list);
    }

    private static void arrayListToMapMethod(List<String> list) {
        // 将获取到的名称、姓名以键值对方式存到map集合中
        Map<String, Integer> c = list.stream().filter((String s) -> {
            String[] splits = s.split(",");
            Integer age = Integer.parseInt(splits[1]);
            return age > 22;
        }).collect(Collectors.toMap((String s) -> {
            return s.split(",")[0];
        }, (String s) -> {
            return Integer.parseInt(s.split(",")[1]);
        }));
        System.out.println(c);
    }
}
