package testss.java.lang;

import org.junit.Test;

/**
 * className: StringTest <BR>
 * description: String类相关测试<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/4/30 15:37 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public class StringTest {

    @Test
    public void hashTest(){
        System.out.println("a"  +  "b"  ==  "ab");
        System.out.println(new  String("ab")  ==  "ab");
    }
}
