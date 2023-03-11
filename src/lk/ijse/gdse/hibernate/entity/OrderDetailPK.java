package lk.ijse.gdse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable {

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "item_id")
    private long itemId;
}
