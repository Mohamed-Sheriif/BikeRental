
public class Client {
    
    private String NIN ;
    private String name;
    private String address;
    private int age;

    public Client(String NIN, String name, String address, int age) {
        this.NIN = NIN;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setNIN(String NIN) {
        this.NIN = NIN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getNIN() {
        return NIN;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
    
    
}
