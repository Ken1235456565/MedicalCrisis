package Model.RoleProfile;

public class VisitorProfile implements RoleProfile {
    private String visitPurpose;
    private String relatedTo;
    
    @Override
    public String getType() {
        return "Visitor";
    }
}