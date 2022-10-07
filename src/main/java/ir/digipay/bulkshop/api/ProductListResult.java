package ir.digipay.bulkshop.api;

import ir.digipay.bulkshop.entity.ProductEntity;

import java.util.List;

public class ProductListResult {

    private List<ProductEntity> products;

    public ProductListResult(List<ProductEntity> products) {
        this.products = products;
    }

    public ProductListResult() {
    }

    public static ProductListResultBuilder builder() {
        return new ProductListResultBuilder();
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public static class ProductListResultBuilder {

        private List<ProductEntity> products;

        ProductListResultBuilder() {
        }

        public ProductListResult.ProductListResultBuilder products(List<ProductEntity> products) {
            this.products = products;
            return this;
        }

        public ProductListResult build() {
            return new ProductListResult(products);
        }

    }
}
