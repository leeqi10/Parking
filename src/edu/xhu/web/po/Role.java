package edu.xhu.web.po;



import java.io.Serializable;



/**
* 
* @TableName role
*/
public class Role implements Serializable {

    /**
    * 
    */

    private String roleId;
    /**
    * 
    */

    private String roleName;

    /**
    * 
    */
    private void setRoleId(String roleId){
    this.roleId = roleId;
    }

    /**
    * 
    */
    private void setRoleName(String roleName){
    this.roleName = roleName;
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
    private String getRoleName(){
    return this.roleName;
    }

}
