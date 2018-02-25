package lesson2;

import java.util.Date;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Order {
    private long id;
    private String productName;
    private int price;
    private Date dateOrder;
    private Date dateConfirm;

    public Order(long id, String productName, int price, Date dateOrder, Date dateConfirm) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.dateOrder = dateOrder;
        this.dateConfirm = dateConfirm;
    }


}
