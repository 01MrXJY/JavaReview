public class Student {
    int no;
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

class MainTest{
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("tom");
        System.out.println(stu.getName());
    }
}