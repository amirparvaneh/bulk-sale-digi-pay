package ir.digipay.bulkshop.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PRICE", nullable = false)
    private long price;

    @Column(name = "AVAILABLE_COUNT")
    private long availableCount;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return this.price;
    }

    public long getAvailableCount() {
        return this.availableCount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setAvailableCount(long availableCount) {
        this.availableCount = availableCount;
    }

    public String toString() {
        return String.format(
                "ProductEntity(id=%s, name=%s, price=%s, availableCount=%s)",
                this.id,
                this.name,
                this.price,
                this.availableCount
        );
    }

}
