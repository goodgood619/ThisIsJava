package thisIsJava.Stream_16_11;

public class Student {
    public enum Sex {MALE,FEMALE}
    public enum City{Seoul,Busan}

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student(String name,int score,Sex sex) {
        this.score = score;
        this.name = name;
        this.sex = sex;
    }
    public Student(String name,int score,Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public Sex getSex() {
        return sex;
    }
}

