package Model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleDirectory {
    private List<Role> roleList;

    public RoleDirectory() {
        this.roleList = new ArrayList<>();
    }

    // 添加角色
    public void addRole(Role role) {
        if (role != null && !roleList.contains(role)) {
            roleList.add(role);
        }
    }

    // 删除角色
    public boolean removeRole(String roleId) {
        return roleList.removeIf(role -> role.getId().equals(roleId));
    }

    // 查询角色
    public Role findRoleById(String roleId) {
        return roleList.stream()
                .filter(role -> role.getId().equals(roleId))
                .findFirst()
                .orElse(null);
    }

    // 根据名称查询角色
    public Role findRoleByName(String roleName) {
        return roleList.stream()
                .filter(role -> role.getName().equals(roleName))
                .findFirst()
                .orElse(null);
    }

    // 获取所有角色
    public List<Role> getAllRoles() {
        return new ArrayList<>(roleList);
    }

    // Getters and Setters
    public List<Role> getRoleList() { return roleList; }
    public void setRoleList(List<Role> roleList) { this.roleList = roleList; }
}