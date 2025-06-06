package Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserAccountDirectory {
    private List<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    // 添加用户账户
    public void addUserAccount(UserAccount userAccount) {
        if (userAccount != null && !userAccountList.contains(userAccount)) {
            userAccountList.add(userAccount);
        }
    }

    // 删除用户账户
    public boolean removeUserAccount(String userId) {
        return userAccountList.removeIf(userAccount -> userAccount.getUserId().equals(userId));
    }

    // 查询用户账户
    public UserAccount findUserAccountById(String userId) {
        return userAccountList.stream()
                .filter(userAccount -> userAccount.getUserId().equals(userId))
                .findFirst()
                .orElse(null);
    }

    // 根据用户名查询用户账户
    public UserAccount findUserAccountByUsername(String username) {
        return userAccountList.stream()
                .filter(userAccount -> userAccount.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    // 获取所有用户账户
    public List<UserAccount> getAllUserAccounts() {
        return new ArrayList<>(userAccountList);
    }
    
    // 用户登录验证：通过用户名和密码匹配
    public UserAccount authenticateUser(String username, String password) {
        return userAccountList.stream()
            .filter(userAccount -> 
                userAccount.getUsername().equals(username) && 
                userAccount.getPassword().equals(password)
            )
            .findFirst()
            .orElse(null);
    }


    // Getters and Setters
    public List<UserAccount> getUserAccountList() { return userAccountList; }
    public void setUserAccountList(List<UserAccount> userAccountList) { this.userAccountList = userAccountList; }
}