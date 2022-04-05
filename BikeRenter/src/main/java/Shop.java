
import java.util.ArrayList;


public class Shop {
    
    private String name;
    private String address;
    private int bikeNum ;
    private ArrayList<Bike> Bikes;

    public Shop(String name, String address, int bikeNum) {
        this.name = name;
        this.address = address;
        this.bikeNum = bikeNum;
        Bikes = new ArrayList<Bike>();
    }
    
    public boolean CheckInStock(String name)
    {
        for (int i = 0; i < Bikes.size(); i++) {
            if(Bikes.get(i).getName() == name  )
            {
                return true;
            }
        }
        
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBikeNum(int bikeNum) {
        this.bikeNum = bikeNum;
    }

    public void setBikes(ArrayList<Bike> Bikes) {
        this.Bikes = Bikes;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getBikeNum() {
        return bikeNum;
    }

    public ArrayList<Bike> getBikes() {
        return Bikes;
    }
    
    
}
