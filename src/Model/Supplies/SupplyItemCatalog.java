package Model.Supplies;

import java.util.ArrayList;
import java.util.List;

public class SupplyItemCatalog {
    private List<SupplyItem> itemList;

    public SupplyItemCatalog() {
        this.itemList = new ArrayList<>();
    }

    public List<SupplyItem> getItemList() {
        return itemList;
    }

    public void addItem(SupplyItem item) {
        itemList.add(item);
    }
}
