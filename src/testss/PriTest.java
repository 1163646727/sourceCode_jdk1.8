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

    /**
     * methodName: yu <BR>
     * description: 逻辑与测试<BR>
     * remark: <BR>
     * param:  <BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-05-26 16:48 <BR>
     */
    @Test
    public void yu(){
        boolean a = true;
        boolean b = true;
        boolean c = (a = (1 == 2)) && ((b = (1 == 2)));
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }

    /**
     * methodName: huo <BR>
     * description: 逻辑或测试 <BR>
     * remark: <BR>
     * param:  <BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-05-26 16:52 <BR>
     */
    @Test
    public void huo(){
        boolean e = false;
        boolean f = false;
        boolean g = (e = (1 == 1)) || (f = (1 == 1));
        System.out.println("e:"+e);
        System.out.println("f:"+f);
        System.out.println("g:"+g);
    }
}
