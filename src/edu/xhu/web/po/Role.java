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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
