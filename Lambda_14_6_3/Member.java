package thisIsJava.Lambda_14_6_3;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("Member() 실행");
    }
    public Member(String id) {
        this.id = id;
        System.out.println("Member(String id) 실행");
    }
    public Member(String name,String id) {
        this.id = id;
        this.name = name;
        System.out.println("Member(String name,String id) 실행");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
