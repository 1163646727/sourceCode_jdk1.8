package testss.java.lang;

import org.junit.Test;
import testss.com.pri.entity.Student;

/**
 * className: ObjectTest <BR>
 * description: Object类相关测试<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/4/27 9:08 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public class ObjectTest {

    /**
     * methodName: getClassTest <BR>
     * description: <BR>
     * remark: 通过自定义实体类，测试<BR>
     * ①是否集成了Object类<BR>
     * ②是如何实现getclass、hashCode、equalse等方法<BR>
     * param:  <BR>
     * return: void <BR>
     * author: ChenQi <BR>
     * createDate: 2020-04-27 09:27 <BR>
     */
    @Test
    public void getClassTest(){
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(20);
        student.setIdent("123456");

        int hash = student.hashCode();
        System.out.println("hash:"+hash);
        Class<? extends Student> stu = student.getClass();
        System.out.println("stu.hashCode():"+stu.hashCode());

        Student student2 = new Student();
        student2.setName("lisi");
        student2.setAge(30);
        student2.setIdent("123456");

        int hash2 = student2.hashCode();
        System.out.println("hash2:"+hash2);
        Class<? extends Student> stu2 = student2.getClass();
        System.out.println("stu2.hashCode():"+stu2.hashCode());

        Boolean bool = student.equals(student2);
        System.out.println("bool:"+bool);

        System.out.println("hash==hash2:"+ (hash==hash2));

    }
}
