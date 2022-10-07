package ir.digipay.bulkshop.api;

public class CustomerUpdateResult {

    private boolean success;

    public CustomerUpdateResult(boolean success) {
        this.success = success;
    }

    public CustomerUpdateResult() {
    }

    public static CustomerUpdateResultBuilder builder() {
        return new CustomerUpdateResultBuilder();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class CustomerUpdateResultBuilder {

        private boolean success;

        CustomerUpdateResultBuilder() {
        }

        public CustomerUpdateResult.CustomerUpdateResultBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public CustomerUpdateResult build() {
            return new CustomerUpdateResult(success);
        }

    }
}
