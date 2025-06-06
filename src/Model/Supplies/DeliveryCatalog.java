package Model.Supplies;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCatalog {
    private List<Delivery> deliveryList;

    public DeliveryCatalog() {
        this.deliveryList = new ArrayList<>();
    }

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void addDelivery(Delivery delivery) {
        this.deliveryList.add(delivery);
    }

}
