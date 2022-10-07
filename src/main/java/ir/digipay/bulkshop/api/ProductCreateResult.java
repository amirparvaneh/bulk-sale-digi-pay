package ir.digipay.bulkshop.api;

public class ProductCreateResult {

    private String productId;

    public ProductCreateResult(String productId) {
        this.productId = productId;
    }

    public ProductCreateResult() {
    }

    public static ProductCreateResultBuilder builder() {
        return new ProductCreateResultBuilder();
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public static class ProductCreateResultBuilder {

        private String productId;

        ProductCreateResultBuilder() {
        }

        public ProductCreateResult.ProductCreateResultBuilder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public ProductCreateResult build() {
            return new ProductCreateResult(productId);
        }

    }
}
