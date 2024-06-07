package com.xhak.demo.permissions;

public enum RolePermission {
    ADMIN_READ("admin.read"),
    ADMIN_UPDATE("admin.update"),
    ADMIN_DELETE("admin.delete"),
    ADMIN_CREATE("admin.create");

    RolePermission(String permission) {
        this.permission = permission;
    }

    private final String permission;

    public String getPermission() {
        return permission;
    }
}
