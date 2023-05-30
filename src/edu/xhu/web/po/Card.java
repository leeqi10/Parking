package edu.xhu.web.po;
import java.io.Serializable;


/**
* 
* @TableName card
*/
public class Card implements Serializable {

    /**
    * 
    */
    private String cardId;
    /**
    * 
    */
    private String seatId;
    /**
    * 
    */
    private String userName;
    /**
    * 
    */
    private String userGender;
    /**
    * 
    */
    private String userAddr;
    /**
    * 
    */
    private String carNum;

    /**
    * 
    */
    private void setCardId(String cardId){
    this.cardId = cardId;
    }

    /**
    * 
    */
    private void setSeatId(String seatId){
    this.seatId = seatId;
    }

    /**
    * 
    */
    private void setUserName(String userName){
    this.userName = userName;
    }

    /**
    * 
    */
    private void setUserGender(String userGender){
    this.userGender = userGender;
    }

    /**
    * 
    */
    private void setUserAddr(String userAddr){
    this.userAddr = userAddr;
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
    private String getCardId(){
    return this.cardId;
    }

    /**
    * 
    */
    private String getSeatId(){
    return this.seatId;
    }

    /**
    * 
    */
    private String getUserName(){
    return this.userName;
    }

    /**
    * 
    */
    private String getUserGender(){
    return this.userGender;
    }

    /**
    * 
    */
    private String getUserAddr(){
    return this.userAddr;
    }

    /**
    * 
    */
    private String getCarNum(){
    return this.carNum;
    }

}
