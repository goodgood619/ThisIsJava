package thisIsJava.Lambda_14_5_6;

public class Member {
    private String name;
    private String id;
    private Address address;
    public Member(String name,String id,Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
}
