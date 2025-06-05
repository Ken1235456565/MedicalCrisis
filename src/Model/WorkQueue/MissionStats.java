package Model.WorkQueue;

import java.util.Map;
import java.util.Date;

public class MissionStats extends WorkRequest {
    private String missionName;
    private Date missionStart;
    private Date missionEnd;
    private String missionType;
    private String location;
    private Map<String, Object> stats;
}