package Model.WorkQueue;

import java.util.Map;
import java.util.Date;

public class Report {
    private String reportId;
    private String title;
    private String type;
    private Date creationDate;
    private Date startDate;
    private Date endDate;
    private Map<String, Object> data;
    private String status;
}