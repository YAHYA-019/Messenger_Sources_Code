package com.google.android.gms.dynamic;

import X.0FI;
import X.0Pz;
import X.AbstractC00481b7;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* loaded from: ObjectWrapper.class */
public final class ObjectWrapper extends IObjectWrapper.Stub {
    public final Object A00;

    public ObjectWrapper(Object obj) {
        int A03 = 0FI.A03(-212057726);
        this.A00 = obj;
        0FI.A09(-1921809681, A03);
    }

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(0Pz.A0T("Unexpected number of IObjectWrapper declared fields: ", length));
        }
        AbstractC00481b7.A02(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
