
public class Renting {
    
    private int renteId;
    private double durationInHours; 
    private String rentingDate;
    private String rentingTime;
    private String Cost;
    
    private Client clientId;
    private Bike bikeModel;
    private Shop ShopName;

    public Renting(int rentId , String clientId, String bikeModel, String ShopName , double durationInHours, String rentingDate, String rentingTime, String Cost) {
        this.renteId = rentId;
        this.clientId.setNIN(clientId);
        this.bikeModel.setModel(bikeModel);
        this.ShopName.setName(ShopName);
        this.durationInHours = durationInHours;
        this.rentingDate = rentingDate;
        this.rentingTime = rentingTime;
        this.Cost = Cost;
    }
    
    public void ShowDetials()
    {
        System.out.println( "customer with NIN "+ clientId + " rente bike model " + bikeModel + " , and the duration in hours is :" + durationInHours );
    }

    public void setRenteId(int renteId) {
        this.renteId = renteId;
    }

    
    public void setShopName(Shop ShopName) {
        this.ShopName = ShopName;
    }
    

    public void setClientId(String clientId) {
        this.clientId.setNIN(clientId);

    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel.setModel(bikeModel);
    }

    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    public void setRentingDate(String rentingDate) {
        this.rentingDate = rentingDate;
    }

    public void setRentingTime(String rentingTime) {
        this.rentingTime = rentingTime;
    }

    public int getRenteId() {
        return renteId;
    }

    public String getClientId() {
        return clientId.getNIN();
    }

    public String getBikeModel() {
        return bikeModel.getModel();
    }

    public Shop getShopName() {
        return ShopName;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    public String getRentingDate() {
        return rentingDate;
    }

    public String getRentingTime() {
        return rentingTime;
    }
    
    public void getCost(String Cost) {
        this.Cost = Cost;
    }
    
    
}
