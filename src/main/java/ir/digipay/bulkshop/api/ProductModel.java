package ir.digipay.bulkshop.api;

public class ProductModel {

    private String id;
    private String name;
    private long price;
    private long availableCount;

    public ProductModel(String id, String name, long price, long availableCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availableCount = availableCount;
    }

    public ProductModel() {
    }

    public static ProductModelBuilder builder() {
        return new ProductModelBuilder();
    }

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

    public static class ProductModelBuilder {

        private String id;
        private String name;
        private long price;
        private long availableCount;

        ProductModelBuilder() {
        }

        public ProductModel.ProductModelBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ProductModel.ProductModelBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductModel.ProductModelBuilder price(long price) {
            this.price = price;
            return this;
        }

        public ProductModel.ProductModelBuilder availableCount(long availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        public ProductModel build() {
            return new ProductModel(id, name, price, availableCount);
        }

    }
}
