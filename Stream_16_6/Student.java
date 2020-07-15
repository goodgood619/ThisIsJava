package thisIsJava.Stream_16_6;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        if(this.score<student.score) return -1;
        else if(this.score == student.score) return 0;
        else return 1;
    }
}
