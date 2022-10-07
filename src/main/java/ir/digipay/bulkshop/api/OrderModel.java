package ir.digipay.bulkshop.api;

public class OrderModel {

    private String id;
    private String customerId;
    private String productId;
    private long count;

    public OrderModel(String id, String customerId, String productId, long count) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.count = count;
    }

    public OrderModel() {
    }

    public static OrderModelBuilder builder() {
        return new OrderModelBuilder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public static class OrderModelBuilder {

        private String id;
        private String customerId;
        private String productId;
        private long count;

        OrderModelBuilder() {
        }

        public OrderModel.OrderModelBuilder id(String id) {
            this.id = id;
            return this;
        }

        public OrderModel.OrderModelBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public OrderModel.OrderModelBuilder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public OrderModel.OrderModelBuilder count(long count) {
            this.count = count;
            return this;
        }

        public OrderModel build() {
            return new OrderModel(id, customerId, productId, count);
        }

    }
}
