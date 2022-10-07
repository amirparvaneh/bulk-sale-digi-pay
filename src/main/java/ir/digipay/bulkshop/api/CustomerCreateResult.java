package ir.digipay.bulkshop.api;

public class CustomerCreateResult {

    private String customerId;

    public CustomerCreateResult(String customerId) {
        this.customerId = customerId;
    }

    public CustomerCreateResult() {
    }

    public static CustomerCreateResultBuilder builder() {
        return new CustomerCreateResultBuilder();
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public static class CustomerCreateResultBuilder {

        private String customerId;

        CustomerCreateResultBuilder() {
        }

        public CustomerCreateResult.CustomerCreateResultBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public CustomerCreateResult build() {
            return new CustomerCreateResult(customerId);
        }

    }
}
