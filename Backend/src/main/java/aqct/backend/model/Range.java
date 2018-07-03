package aqct.backend.model;

import java.sql.Timestamp;

public class Range {
    
    private Timestamp from;
    private Timestamp to;
    
    public Range() {
        
    }

    public Timestamp getFrom() {
        return from;
    }

    public void setFrom(Timestamp from) {
        this.from = from;
    }

    public Timestamp getTo() {
        return to;
    }

    public void setTo(Timestamp to) {
        this.to = to;
    }
    
}
