package com.google.common.base;

/* loaded from: Objects.class */
public abstract class Objects extends ExtraObjectsMethodsForWeb {
    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
