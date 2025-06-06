package Model.Supplies;

import java.util.ArrayList;
import java.util.List;

public class EquipmentsCatalog {
    private List<Equipments> equipmentsList;

    public EquipmentsCatalog() {
        this.equipmentsList = new ArrayList<>();
    }

    public List<Equipments> getEquipmentsList() {
        return equipmentsList;
    }

    public void addEquipment(Equipments equipment) {
        this.equipmentsList.add(equipment);
    }
}
