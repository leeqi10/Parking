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

    /**
    * 
    */
    private void setSeatId(String seatId){
    this.seatId = seatId;
    }

    /**
    * 
    */
    private void setSeatNum(String seatNum){
    this.seatNum = seatNum;
    }

    /**
    * 
    */
    private void setSeatSection(String seatSection){
    this.seatSection = seatSection;
    }

    /**
    * 
    */
    private void setSeatState(Integer seatState){
    this.seatState = seatState;
    }

    /**
    * 
    */
    private void setSeatTag(String seatTag){
    this.seatTag = seatTag;
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
    private String getSeatNum(){
    return this.seatNum;
    }

    /**
    * 
    */
    private String getSeatSection(){
    return this.seatSection;
    }

    /**
    * 
    */
    private Integer getSeatState(){
    return this.seatState;
    }

    /**
    * 
    */
    private String getSeatTag(){
    return this.seatTag;
    }

}
