package testss;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * className: PriTest <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/4/23 15:44 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public class PriTest {
    public static void main(String[] args) {
        System.out.println("test");
        Map map = new HashMap<String,String>();
        map.put("1","2");
        map.size();
        System.out.println(map);
    }

    @Test
    public void test(){
        System.out.println("test");
    }
}
