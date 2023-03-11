package lk.ijse.gdse.hibernate.entity;

import com.sun.tools.corba.se.idl.constExpr.Or;

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
}
