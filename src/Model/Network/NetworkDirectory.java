package Model.Network;


import java.util.ArrayList;
import java.util.List;

public class NetworkDirectory {
    private static NetworkDirectory instance;
    private List<Network> networkList;

    public NetworkDirectory() {
        this.networkList = new ArrayList<>();
    }

    public static NetworkDirectory getInstance() {
        if (instance == null) {
            instance = new NetworkDirectory();
        }
        return instance;
    }

    // 🔍 Read: 获取全部网络
    public List<Network> getAllNetworks() {
        return new ArrayList<>(networkList); // 返回副本以保护内部数据
    }

    // 🔍 Read: 按 ID 查找网络
    public Network findNetworkById(String id) {
        for (Network net : networkList) {
            if (net.getId().equals(id)) {
                return net;
            }
        }
        return null;
    }

    // ➕ Create: 添加网络
    public void addNetwork(Network network) {
        networkList.add(network);
    }

    // ✏️ Update: 根据 ID 更新网络对象的属性
    public boolean updateNetwork(String id, Network updatedNetwork) {
        for (int i = 0; i < networkList.size(); i++) {
            Network existing = networkList.get(i);
            if (existing.getId().equals(id)) {
                updatedNetwork.setId(id); // 保留原 ID
                networkList.set(i, updatedNetwork);
                return true;
            }
        }
        return false;
    }

    // Delete: 删除网络
    public boolean removeNetwork(Network network) {
        return networkList.remove(network);
    }

    // Delete: 根据 ID 删除网络
    public boolean removeNetworkById(String id) {
        return networkList.removeIf(net -> net.getId().equals(id));
    }
}
