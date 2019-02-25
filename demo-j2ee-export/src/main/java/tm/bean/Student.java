package tm.bean;

/**
 * @auther: zhangyi
 * @date: 2019/2/21
 * @Description: 学生类
 */
public class Student implements Cloneable{

    /**
     * @auther: zhangyi
     * @date: 2019/2/21
     * @Description: 姓名
     */
    private String name;

    /**
     * @auther: zhangyi
     * @date: 2019/2/21
     * @Description: 年龄
     */
    private Integer age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void testProtected(){
        System.out.println("protected");
    }

    public Student(){

    }

    public Student(String name, Integer age){
        this.testProtected();
        this.name = name;
        this.age = age;
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }
        if(null != this && this.getClass() == obj.getClass()){
            return true;
        }

        if(obj instanceof Student){
            Student student = (Student) obj;
            return student.getAge().equals(this.age);
        }

        return false;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
