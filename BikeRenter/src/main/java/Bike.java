
public class Bike {
    
    private String type;
    private String name;
    private String model;
    private int gearsnNum;
    

    public Bike(String type, String name, String model, int gearsnNum) {
        this.type = type;
        this.name = name;
        this.model = model;
        this.gearsnNum = gearsnNum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGearsnNum(int gearsnNum) {
        this.gearsnNum = gearsnNum;
    }
    
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getGearsnNum() {
        return gearsnNum;
    }
    
    
}
