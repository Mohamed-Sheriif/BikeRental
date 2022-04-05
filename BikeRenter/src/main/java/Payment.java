
public class Payment {
    
    private int amount;
    private String method;
    private String paymentDate;
    private Renting rentId;

    public Payment(int amount, String method, String paymentDate, int rentId) {
        this.amount = amount;
        this.method = method;
        this.paymentDate = paymentDate;
        this.rentId.setRenteId(rentId);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setRentId(Renting rentId) {
        this.rentId = rentId;
    }

    public int getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public Renting getRentId() {
        return rentId;
    }
    
    
}
