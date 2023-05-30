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

    /**
    * 
    */
    private void setFixedId(String fixedId){
    this.fixedId = fixedId;
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
    private String getFixedId(){
    return this.fixedId;
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

}
