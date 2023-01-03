import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamDemo6 {
    /**
     * @param args
     */

    public Action actName;

    public static void main(String[] args) {

        List<String> manList = new ArrayList<>();
        manList.add("王宝强");
        manList.add("张建");
        manList.add("成龙");
        manList.add("李雪健");
        manList.add("刘德华");
        manList.add("汪峰");

        List<String> womanList = new ArrayList<>();
        womanList.add("邓紫棋");
        womanList.add("古力娜扎");
        womanList.add("欧阳娜娜");
        womanList.add("杨紫");
        womanList.add("杨幂");
        womanList.add("张天爱");

        // 要求，将男演员的名字长度为3的且前2个；将女演员名字包含杨的不要第一个
        Stream<String> manStream = manList.stream().filter(name -> name.length() == 3).limit(2);
        Stream<String> womanStream = womanList.stream().filter(name -> name.startsWith("杨")).skip(1);

        // 将两个集合合并
        Stream.concat(manStream,womanStream).forEach(name -> {
            Action act  = new Action(name);
            System.out.println(act);
        });
    }

}
