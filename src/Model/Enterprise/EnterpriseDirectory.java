package Model.Enterprise;

import Model.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;
import java.util.List;

public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    // 添加企业
    public void addEnterprise(Enterprise enterprise) {
        if (enterprise != null && !enterpriseList.contains(enterprise)) {
            enterpriseList.add(enterprise);
        }
    }
    
    public Enterprise createAndAddEnterprise(String id, String name, EnterpriseType type,
                                         String description, String manager) {
    Enterprise enterprise = new Enterprise();
    enterprise.setId(id);
    enterprise.setName(name);
    enterprise.setType(type);
    enterprise.setDescription(description);
    enterprise.setManager(manager);

    enterpriseList.add(enterprise);  // 添加到目录中
    return enterprise;
}


    // 删除企业
    public boolean removeEnterprise(String enterpriseId) {
        return enterpriseList.removeIf(enterprise -> enterprise.getId().equals(enterpriseId));
    }

    // 查询企业
    public Enterprise findEnterpriseById(String enterpriseId) {
        return enterpriseList.stream()
                .filter(enterprise -> enterprise.getId().equals(enterpriseId))
                .findFirst()
                .orElse(null);
    }

    // 获取所有企业
    public List<Enterprise> getAllEnterprises() {
        return new ArrayList<>(enterpriseList);
    }

    // Getters and Setters
    public List<Enterprise> getEnterpriseList() { return enterpriseList; }
    public void setEnterpriseList(List<Enterprise> enterpriseList) { this.enterpriseList = enterpriseList; }
}

