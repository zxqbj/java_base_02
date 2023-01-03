import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {
        System.out.println("大家好");
        Scanner sc = new Scanner(System.in);
        List<Integer> listArr = new ArrayList<Integer>();

        Random rm = new Random();
        int rangeInt = rm.nextInt(10);// 返回10以内随机数
        System.out.println(rangeInt);

        int nextInt = sc.nextInt();
        listArr.add(nextInt);
        listArr.add(rangeInt);

        fileInputOrOutputStreamMethod(nextInt);

        try {
            // 单一输出
            FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");
            int readLine ;
            while ((readLine = fis.read()) != -1){// 读取到文件最后一位
                System.out.println((char) readLine);
                fos.write((char)readLine);
            }

            // 批量输出
            byte[] batch = new byte[]{98,99,100,101};
            while ((readLine = fis.read()) != -1){// 读取到文件最后一位
                System.out.println(batch);
                fos.write(batch,0,readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 获取每一个值
        arrayListMethod(listArr);

        // 迭代器遍历
        setListIteratorMethod();

        // 使用stream进行过滤获取
        arrayListStreamMethod(listArr);

        // map遍历
        Map<String, String> mapStr = new HashMap<>();
        mapStr.put("zhangsan", "1");
        mapStr.put("lisi", "2");
        mapStr.put("wangwu", "3");
        mapStr.put("zhaoliu", "4");
        mapStr.put("qianqi", "5");

        //
        mapValueMethod(mapStr);

        //
        mapValueMethod1(mapStr);

    }

    private static void fileInputOrOutputStreamMethod(int nextInt) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("");
            fos.write(nextInt);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void mapValueMethod1(Map<String, String> mapStr) {
        Set<Map.Entry<String, String>> entries = mapStr.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println("输出对象：" + iterator.next());
            Map.Entry<String, String> stringStringEntry = iterator.next();
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key + "----" + value);
        }
    }

    private static void mapValueMethod(Map<String, String> mapStr) {
        Set<String> mapKeySet = mapStr.keySet();
        mapKeySet.stream().forEach(s -> System.out.println(s));
        for (String key : mapKeySet) {
            String value = mapStr.get(key);
            System.out.println(key + "----" + value);
        }

        Iterator<String> iterator = mapKeySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            String value = mapStr.get(key);
            System.out.println(key + "----" + value);
        }
    }

    private static void arrayListStreamMethod(List<Integer> listArr) {
        listArr.stream().filter(integer -> integer >= 2).forEach(integer -> System.out.println(integer));
    }

    private static void setListIteratorMethod() {
        Set<Integer> setList = new HashSet<Integer>();
        setList.add(1);
        setList.add(2);
        setList.add(3);
        setList.add(4);
        setList.add(5);
        // 迭代器遍历
        Iterator<Integer> setIterator = setList.iterator();
        while (setIterator.hasNext()) {
            Integer next = setIterator.next();
            System.out.println(next);
        }
    }

    private static void arrayListMethod(List<Integer> listArr) {
        listArr.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
