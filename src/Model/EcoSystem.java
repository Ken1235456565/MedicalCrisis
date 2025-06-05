package Model;

import Model.Network.NetworkDirectory;
import Model.User.UserAccountDirectory;
import Model.Person.Person;

public class EcoSystem {
    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    private UserAccountDirectory userAccountDirectory;
    private Person admin;
    private Person publicDataManager;
}