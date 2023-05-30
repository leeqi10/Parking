package edu.xhu.web.po;

import java.io.Serializable;

import java.util.Date;


/**
* 
* @TableName fixed
*/
public class Fixed implements Serializable {

    /**
    * 
    */

    private String fixedId;
    /**
    * 
    */

    private String cardId;
    /**
    * 
    */

    private Date entryDate;
    /**
    * 
    */

    private Date entryTime;
    /**
    * 
    */

    private Date outDate;
    /**
    * 
    */

    private Date outTime;

    public String getFixedId() {
        return fixedId;
    }

    public void setFixedId(String fixedId) {
        this.fixedId = fixedId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
}
