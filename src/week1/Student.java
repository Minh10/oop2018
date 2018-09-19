package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private static String name;
    private static String id;
    private static String group;
    private static String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Minh";
        id = 10;
        group = "K62K";
        email = "ngocminhc2nc1@gmail.com";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
        
    }

    String getInfo() {
        // TODO:
       return "Name: " + getName() + " " + "id: " + getId() + " " + "Group: " + getGroup() + " " + "Email " + getEmail() ;
        //return null; // xóa dòng này sau khi cài đặt
    }
}
