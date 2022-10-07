package ir.digipay.bulkshop.api;

public class ProductCreateParam {

    private String name;
    private long price;
    private long initialAvailableCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getInitialAvailableCount() {
        return initialAvailableCount;
    }

    public void setInitialAvailableCount(long initialAvailableCount) {
        this.initialAvailableCount = initialAvailableCount;
    }
}
