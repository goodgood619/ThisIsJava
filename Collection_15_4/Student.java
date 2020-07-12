package thisIsJava.Collection_15_4;

import java.util.Objects;

public class Student {
    int sno;
    String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return student.name.equals(this.name) && (student.sno == this.sno);
        } else return false;
    }

    @Override
    public int hashCode() {
        return this.sno + this.name.hashCode();
    }
}
