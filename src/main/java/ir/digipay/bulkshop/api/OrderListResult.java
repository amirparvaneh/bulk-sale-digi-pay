package ir.digipay.bulkshop.api;

import ir.digipay.bulkshop.entity.OrderEntity;

import java.util.List;

public class OrderListResult {

    private List<OrderEntity> orders;

    public OrderListResult(List<OrderEntity> orders) {
        this.orders = orders;
    }

    public OrderListResult() {
    }

    public static OrderListResultBuilder builder() {
        return new OrderListResultBuilder();
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    public static class OrderListResultBuilder {

        private List<OrderEntity> orders;

        OrderListResultBuilder() {
        }

        public OrderListResult.OrderListResultBuilder orders(List<OrderEntity> orders) {
            this.orders = orders;
            return this;
        }

        public OrderListResult build() {
            return new OrderListResult(orders);
        }

    }
}
