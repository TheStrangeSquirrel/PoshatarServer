/*
 * Copyright © 2016, Malyshev Vladislav,  thestrangesquirrel@gmail.com. This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License. To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/ or send a letter to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.
 */

package net.squirrel.poshtar.server.utils.inject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FieldReflector {
    public static List<Field> collectUpTo(Class<?> clazz, Class<?> upperBound) {
        ArrayList<Field> res = new ArrayList<>();
        Class<?> current = clazz;
        while (current != upperBound) {
            res.addAll(Arrays.asList(current.getDeclaredFields()));
            current = current.getSuperclass();
        }
        return res;
    }

    public static List<Field> filterInject(List<Field> allFields){
        List<Field> fields = new ArrayList<>();
        for(Field field : allFields){
            Inject annotation = field.getAnnotation(Inject.class);
            if(annotation != null){
                fields.add(field);
            }
        }
        return fields;
    }
}
