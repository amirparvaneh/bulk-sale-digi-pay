package ir.digipay.bulkshop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private String customerId;

    @Column(name = "PRODUCT_ID", nullable = false)
    private String productId;

    @Column(name = "COUNT")
    private long count;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return this.id;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getProductId() {
        return this.productId;
    }

    public long getCount() {
        return this.count;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String toString() {
        return String.format(
                "OrderEntity(id=%s, customerId=%s, productId=%s, count=%s)",
                this.id,
                this.customerId,
                this.productId,
                this.count
        );
    }

}
