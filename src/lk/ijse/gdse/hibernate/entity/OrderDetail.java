package lk.ijse.gdse.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {

//    @Id
//    @Column(name = "order_detail_id")
//    private long id;
    @EmbeddedId
    private OrderDetailPK orderDetailPK;
    @Column(name = "order_price")
    private double price;
    @Column(name = "order_quantity")
    private int qty;

    @ManyToOne
    @JoinColumn(name = "order_id",
    referencedColumnName = "order_id",
    insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_code",
    referencedColumnName = "item_code",
    insertable = false, updatable = false)
    private Item item;

    public OrderDetail() {}

    public OrderDetail(OrderDetailPK orderDetailPK, double price, int qty, Order order, Item item) {
        this.orderDetailPK = orderDetailPK;
        this.price = price;
        this.qty = qty;
        this.order = order;
        this.item = item;
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailPK=" + orderDetailPK +
                ", price=" + price +
                ", qty=" + qty +
                ", order=" + order +
                ", item=" + item +
                '}';
    }
}
