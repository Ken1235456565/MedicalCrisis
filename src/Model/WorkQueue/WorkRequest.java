package Model.WorkQueue;

import Model.User.UserAccount;
import java.util.Date;

public class WorkRequest {
    private String requestId;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
}