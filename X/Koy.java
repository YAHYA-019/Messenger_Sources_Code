package X;

import java.lang.reflect.Field;

/* loaded from: Koy.class */
public final class Koy {
    public final Field A00;

    public Koy(Field field) {
        this.A00 = field;
        field.setAccessible(true);
    }

    public void A00(Object obj, Object obj2) {
        Field field;
        try {
            field = this.A00;
            field.set(obj, obj2);
        } catch (IllegalAccessException unused) {
            throw AnonymousClass001.A0J(field);
        }
    }
}
