package comparator0;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    /**
     * Employee parameterized constructor
     */
    public Employee(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "("+this.id+", "+this.name+", "+this.age+")";
    }
}