import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/11
 * time: 16:06
 */
public class TestLambda4 {
    @Test
    public void demo1(){
        List<Employee> l = new ArrayList<>();
        Collections.addAll(l,new Employee("张三",9.9),new Employee("李四",19.9),new Employee("王五",29.9));
        Stream<Double> doubleStream = l.stream().map(Employee::getWage);


    }
}
