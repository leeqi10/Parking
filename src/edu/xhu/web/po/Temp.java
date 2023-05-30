package edu.xhu.web.po;



import java.io.Serializable;

import java.util.Date;


/**
* 
* @TableName temp
*/
public class Temp implements Serializable {

    /**
    * 
    */

    private String tempId;
    /**
    * 
    */

    private String cardId;
    /**
    * 
    */

    private String carNum;
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
    /**
    * 
    */

    private Double tempMoney;

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
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

    public Double getTempMoney() {
        return tempMoney;
    }

    public void setTempMoney(Double tempMoney) {
        this.tempMoney = tempMoney;
    }
}
