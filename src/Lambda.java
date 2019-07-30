import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanlianglong
 * @Title: Lambda.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/5/30 17:41
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");
//        list.forEach(String::toUpperCase);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(n->n.toUpperCase());
//        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
//        list.forEach(item->{
//
//        });
    }
}
