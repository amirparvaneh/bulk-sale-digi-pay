package ir.digipay.bulkshop.api;

public class ProductUpdateResult {

    private boolean success;

    public ProductUpdateResult(boolean success) {
        this.success = success;
    }

    public ProductUpdateResult() {
    }

    public static ProductUpdateResultBuilder builder() {
        return new ProductUpdateResultBuilder();
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class ProductUpdateResultBuilder {

        private boolean success;

        ProductUpdateResultBuilder() {
        }

        public ProductUpdateResult.ProductUpdateResultBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public ProductUpdateResult build() {
            return new ProductUpdateResult(success);
        }

    }
}
