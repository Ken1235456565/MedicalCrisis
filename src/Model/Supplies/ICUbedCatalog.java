package Model.Supplies;

import java.util.ArrayList;
import java.util.List;

public class ICUbedCatalog {
    private List<ICUbed> icuBedList;
    
    public ICUbedCatalog() {
        this.icuBedList = new ArrayList<>();  // ✅ 保证不是null
    }
    public List<ICUbed> getIcuBedList() {
        return icuBedList;
    }

    public void setIcuBedList(List<ICUbed> icuBedList) {
        this.icuBedList = icuBedList;
    }
    
    
}