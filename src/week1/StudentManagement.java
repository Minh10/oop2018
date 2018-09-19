package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static ArrayList<Student> student = new ArrayList<Student>();
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup()))  return true;
        //return false; // xóa dòng này sau khi cài đặt
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

    public static void main(String[] args) {
        // TODO:
    }
}
