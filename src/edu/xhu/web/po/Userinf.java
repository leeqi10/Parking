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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
