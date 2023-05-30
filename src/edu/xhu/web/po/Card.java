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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }
}
