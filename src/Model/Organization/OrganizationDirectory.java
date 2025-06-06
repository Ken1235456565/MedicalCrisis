package Model.Organization;

import Model.Person.ContactInfo;
import java.util.ArrayList;
import java.util.List;

public class OrganizationDirectory {
    private List<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<>();
    }

    // 添加组织
    public void addOrganization(Organization organization) {
        if (organization != null && !organizationList.contains(organization)) {
            organizationList.add(organization);
        }
    }
    
    public enum OrganizationType {
    CLINICAL,
    ADMINISTRATION,
    DONATION,
    EMERGENCY,
    LOGISTICS,
    DELIVERY,
    SUPPORT
}
    
    public Organization createOrganization(String name, OrganizationType type, ContactInfo contactInfo) {
        Organization org;

        switch (type) {
            case CLINICAL:
                org = new ClinicalServicesUnit(name, contactInfo, true);  // ICU
                break;
            case ADMINISTRATION:
                org = new AdministrationUnit(name, contactInfo);
                break;
            case DONATION:
                org = new DonationManagementUnit(name, contactInfo);
                break;
            case EMERGENCY:
                org = new EmergencyResponseUnit(name, contactInfo);
                break;
            case LOGISTICS:
                org = new SupplyChainManagementUnit(name, contactInfo);
                break;
            case DELIVERY:
                org = new ResourceAnalyzeUnit(name, contactInfo);
                break;
            case SUPPORT:
                org = new OperationsSupportUnit(name, contactInfo);
                break;
            default:
                throw new IllegalArgumentException("Unsupported OrganizationType: " + type);
        }

        organizationList.add(org);
        return org;
    }


    // 删除组织
    public boolean removeOrganization(String organizationId) {
        return organizationList.removeIf(organization -> organization.getOrganizationId().equals(organizationId));
    }

    // 查询组织
    public Organization findOrganizationById(String organizationId) {
        return organizationList.stream()
                .filter(organization -> organization.getOrganizationId().equals(organizationId))
                .findFirst()
                .orElse(null);
    }

    // 获取所有组织
    public List<Organization> getAllOrganizations() {
        return new ArrayList<>(organizationList);
    }

    // Getters and Setters
    public List<Organization> getOrganizationList() { return organizationList; }
    public void setOrganizationList(List<Organization> organizationList) { this.organizationList = organizationList; }
}