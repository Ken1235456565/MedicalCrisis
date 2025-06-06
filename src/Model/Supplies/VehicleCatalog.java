package Model.Supplies;

import Model.Supplies.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleCatalog {
    private List<Vehicle> vehicleList;

    public VehicleCatalog() {
        this.vehicleList = new ArrayList<>();
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }
}
