package ir.digipay.bulkshop.api;

public class ProductUpdateParam {

    private String id;
    private String name;
    private long price;
    private long availableCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public long getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(long availableCount) {
        this.availableCount = availableCount;
    }
}
