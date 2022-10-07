package ir.digipay.bulkshop.api;

public class OrderCreateResult {

    private String orderId;

    public OrderCreateResult(String orderId) {
        this.orderId = orderId;
    }

    public OrderCreateResult() {
    }

    public static OrderCreateResultBuilder builder() {
        return new OrderCreateResultBuilder();
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public static class OrderCreateResultBuilder {

        private String orderId;

        OrderCreateResultBuilder() {
        }

        public OrderCreateResult.OrderCreateResultBuilder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderCreateResult build() {
            return new OrderCreateResult(orderId);
        }

    }
}
