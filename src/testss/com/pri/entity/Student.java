package testss.com.pri.entity;

/**
 * className: Student <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/4/27 9:33 <BR>
 * version 1.0 jdk1.8 <BR>
 */
public class Student{
    /** 姓名 ChenQi*/
    private String name;

    /** 年龄 ChenQi*/
    private Integer age;

    /** 身份证 ChenQi*/
    private String Ident;

    public String getIdent() {
        return Ident;
    }

    public void setIdent(String ident) {
        Ident = ident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 对象是引用类型(类、接口、数组), == 比较的是他们在内存中存放的地址 ChenQi
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // 能执行到这里，说明obj和this同类且非null。 ChenQi
        Student student = (Student) o;

        return (Ident != null && !"".equals(Ident))  && Ident.equals(student.Ident) ? true :false;
    }

    @Override
    public int hashCode() {
        int result = Ident != null ? Ident.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Ident='" + Ident + '\'' +
                '}';
    }
}
