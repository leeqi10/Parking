package edu.xhu.web.po;


import java.io.Serializable;


/**
* 
* @TableName seat
*/
public class Seat implements Serializable {

    /**
    * 
    */

    private String seatId;
    /**
    * 
    */

    private String seatNum;
    /**
    * 
    */

    private String seatSection;
    /**
    * 
    */

    private Integer seatState;
    /**
    * 
    */

    private String seatTag;

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeatSection() {
        return seatSection;
    }

    public void setSeatSection(String seatSection) {
        this.seatSection = seatSection;
    }

    public Integer getSeatState() {
        return seatState;
    }

    public void setSeatState(Integer seatState) {
        this.seatState = seatState;
    }

    public String getSeatTag() {
        return seatTag;
    }

    public void setSeatTag(String seatTag) {
        this.seatTag = seatTag;
    }
}
