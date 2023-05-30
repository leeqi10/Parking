package edu.xhu.web.po;



import java.io.Serializable;


/**
* 
* @TableName userinf
*/
public class Userinf implements Serializable {

    /**
    * 
    */

    private String userId;
    /**
    * 
    */

    private String roleId;
    /**
    * 
    */

    private String userName;
    /**
    * 
    */

    private String realName;
    /**
    * 
    */

    private String userPwd;
    /**
    * 
    */

    private String userPhone;

    /**
    * 
    */
    private void setUserId(String userId){
    this.userId = userId;
    }

    /**
    * 
    */
    private void setRoleId(String roleId){
    this.roleId = roleId;
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
    private void setRealName(String realName){
    this.realName = realName;
    }

    /**
    * 
    */
    private void setUserPwd(String userPwd){
    this.userPwd = userPwd;
    }

    /**
    * 
    */
    private void setUserPhone(String userPhone){
    this.userPhone = userPhone;
    }


    /**
    * 
    */
    private String getUserId(){
    return this.userId;
    }

    /**
    * 
    */
    private String getRoleId(){
    return this.roleId;
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
    private String getRealName(){
    return this.realName;
    }

    /**
    * 
    */
    private String getUserPwd(){
    return this.userPwd;
    }

    /**
    * 
    */
    private String getUserPhone(){
    return this.userPhone;
    }

}
