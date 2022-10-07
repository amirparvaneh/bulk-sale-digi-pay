package ir.digipay.bulkshop.api;

import ir.digipay.bulkshop.entity.CustomerEntity;

import java.util.List;

public class CustomerListResult {

    private List<CustomerEntity> customers;

    public CustomerListResult(List<CustomerEntity> customers) {
        this.customers = customers;
    }

    public CustomerListResult() {
    }

    public static CustomerListResultBuilder builder() {
        return new CustomerListResultBuilder();
    }

    public List<CustomerEntity> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerEntity> customers) {
        this.customers = customers;
    }

    public static class CustomerListResultBuilder {

        private List<CustomerEntity> customers;

        CustomerListResultBuilder() {
        }

        public CustomerListResult.CustomerListResultBuilder customers(List<CustomerEntity> customers) {
            this.customers = customers;
            return this;
        }

        public CustomerListResult build() {
            return new CustomerListResult(customers);
        }

    }
}
