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

    /**
    * 
    */
    private void setTempId(String tempId){
    this.tempId = tempId;
    }

    /**
    * 
    */
    private void setCardId(String cardId){
    this.cardId = cardId;
    }

    /**
    * 
    */
    private void setCarNum(String carNum){
    this.carNum = carNum;
    }

    /**
    * 
    */
    private void setEntryDate(Date entryDate){
    this.entryDate = entryDate;
    }

    /**
    * 
    */
    private void setEntryTime(Date entryTime){
    this.entryTime = entryTime;
    }

    /**
    * 
    */
    private void setOutDate(Date outDate){
    this.outDate = outDate;
    }

    /**
    * 
    */
    private void setOutTime(Date outTime){
    this.outTime = outTime;
    }

    /**
    * 
    */
    private void setTempMoney(Double tempMoney){
    this.tempMoney = tempMoney;
    }


    /**
    * 
    */
    private String getTempId(){
    return this.tempId;
    }

    /**
    * 
    */
    private String getCardId(){
    return this.cardId;
    }

    /**
    * 
    */
    private String getCarNum(){
    return this.carNum;
    }

    /**
    * 
    */
    private Date getEntryDate(){
    return this.entryDate;
    }

    /**
    * 
    */
    private Date getEntryTime(){
    return this.entryTime;
    }

    /**
    * 
    */
    private Date getOutDate(){
    return this.outDate;
    }

    /**
    * 
    */
    private Date getOutTime(){
    return this.outTime;
    }

    /**
    * 
    */
    private Double getTempMoney(){
    return this.tempMoney;
    }

}
