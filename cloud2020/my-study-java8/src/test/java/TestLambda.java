import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @作者: caixiaobai
 * @时间：2020/09/16
 **/
public class TestLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");

       // User user = new User();

       // List<User> userList = new ArrayList<User>();

        list.forEach(System.out::println);

        Map<Integer,List> map = new HashMap<>();
        map.put(1,list);
        map.put(2,list);
        map.forEach((Integer,List) -> System.out.println(Integer+":"+List));
    }
}
