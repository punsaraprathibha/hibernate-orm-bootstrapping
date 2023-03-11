package lk.ijse.gdse.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_code")
    private long itemCode;
    @Column(name = "item_description")
    private String description;
    @Column(name = "item_quantity")
    private int quantity;
    @Column(name = "itm_unit_price")
    private double unitPrice;

//    @ManyToMany(mappedBy = "items")
//    private List<Order> orders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetails = new ArrayList<>();
}
