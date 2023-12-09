package com.devsuperior.dscatalog.util;

import com.devsuperior.dscatalog.projections.IdProjection;

import java.util.*;

public class Utils {

    public static <ID> List<? extends IdProjection<ID>>
    replace(List<? extends IdProjection<ID>> ordered,
            List<? extends IdProjection<ID>> unordered) {

        Map<ID, IdProjection<ID>> map = new HashMap<>();
        for (IdProjection<ID> obj : unordered) {
            map.put(obj.getId(), obj);
        }

        List<IdProjection<ID>> result = new ArrayList<>();
        for (IdProjection<ID> obj : ordered) {
            result.add(map.get(obj.getId()));
        }

        return result;
    }
}
