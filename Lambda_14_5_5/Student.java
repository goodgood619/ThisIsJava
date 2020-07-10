package thisIsJava.Lambda_14_5_5;

public class Student {
    private String name;
    private String sex;
    private int score;
    public Student(String name,String sex, int score) {
        this.score = score;
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getSex() {
        return sex;
    }
}
