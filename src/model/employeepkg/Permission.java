package model.employeepkg;

public class Permission {
    private String permissionID;
    private String permissionName;

    public Permission() {
    }

    public Permission(String permissionID, String permissionName) {
        this.permissionID = permissionID;
        this.permissionName = permissionName;
    }

    public String getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(String permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
