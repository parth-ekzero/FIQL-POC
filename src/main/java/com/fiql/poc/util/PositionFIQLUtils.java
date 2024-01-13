package com.fiql.poc.util;

import java.util.HashMap;
import java.util.Map;

public class PositionFIQLUtils {

    public static Map<String, String> getFIQLMappingForPosition() {
        final Map<String, String> map = new HashMap<>();
        map.putAll(getPositionTableMapping());
        map.putAll(getDependentTableMapping());
        return map;
    }

    private static Map<String, String> getPositionTableMapping() {
        final Map<String, String> map = new HashMap<>();
        map.put("positionId", "id");
        map.put("positionCode", "code");
        map.put("positionName", "name");
        map.put("positionEmail", "email");
        return map;
    }

    private static Map<String, String> getDependentTableMapping() {
        final Map<String, String> map = new HashMap<>();
        map.put("roleId", "role.roleId");
        map.put("roleName", "role.name");
        map.put("departmentId", "role.roleDepartmentList.department.departmentId");
        map.put("departmentName", "role.roleDepartmentList.department.name");
        return map;
    }

}
