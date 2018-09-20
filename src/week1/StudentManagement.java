package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static ArrayList<Student> student = new ArrayList<Student>(100);

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup()))  return true;
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
        Set<String> set = new HashSet<String>();
        int n = student.size();
        for (int i = 0; i < n; i++) {
            set.add(student.get(i).getGroup());
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String a = it.next();
            for(int i=0; i<n; i++)
            {
                if(a.equals(student.get(i).getGroup())) student.get(i).getInfo();
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for(int i = 0; i < student.size(); i++){
            if(student.get(i).getId().equals(id))   student.remove(i);
        }
    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student("Minh", "17020890", "17020890@vnu.edu.vn");
        Student s2 = new Student("Liem", "17020891", "17020891@vnu.edu.vn");
        Student s3 = new Student("Ngoc","17020892","17020892@vnu.edu.vn");
        s1.setGroup("INT22041");
        s2.setGroup("INT22041");
        s3.setGroup("INT22042");
        System.out.println(s1.getInfo());
        student.add(s1);
        student.add(s2);
        student.add(s3);
        studentsByGroup();
        removeStudent("17020890");
        for(int i = 0; i < student.size(); i++){
            System.out.println(student.get(i).getInfo());
        }
    }
}
