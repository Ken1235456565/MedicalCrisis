package Model;

import Model.Network.Network;
import Model.Network.NetworkDirectory;
import Model.User.UserAccountDirectory;
import Model.Person.Person;

public class EcoSystem {
    private static EcoSystem business; // Static instance for Singleton pattern
    private NetworkDirectory networkDirectory;
    private UserAccountDirectory userAccountDirectory;
    private Person admin;
    private Person publicDataManager;

    /**
     * Private constructor to prevent direct instantiation.
     * Initializes directories.
     */
    private EcoSystem() {
        this.networkDirectory = new NetworkDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    // Getters and Setters for the attributes

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public Person getAdmin() {
        return admin;
    }

    public void setAdmin(Person admin) {
        this.admin = admin;
    }

    public Person getPublicDataManager() {
        return publicDataManager;
    }

    public void setPublicDataManager(Person publicDataManager) {
        this.publicDataManager = publicDataManager;
    }
    
    public Network createAndAddNetwork(String name) {
        Network network = new Network();
        this.getNetworkDirectory().addNetwork(network);
        return network;
    }
    
    public boolean removeNetwork(Network network) {
    return this.getNetworkDirectory().removeNetwork(network);
}


}