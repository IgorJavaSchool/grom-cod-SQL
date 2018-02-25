package lesson2;

/**
 * @author Yanevskyy Igor igor2000@inbox.ru.
 */
public class Product {
    private long id;                     //ID NUMBER,   CONSTRAINT PRODUCT_ID PRIMARY KEY (ID),
    private String name;                //    NAME NVARCHAR2(50)
    private String manufacturerName;    //    MANUFACTURER_NAME NVARCHAR2(50),
    private int costPrice;              //    COST_PRICE NUMBER

    public Product(long id, String name, String manufacturerName, int costPrice) {
        this.id = id;
        this.name = name;
        this.manufacturerName = manufacturerName;
        this.costPrice = costPrice;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getCostPrice() {
        return costPrice;
    }
}
