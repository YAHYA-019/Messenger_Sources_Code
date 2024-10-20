package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: Lru.class */
public final class Lru implements PrivilegedAction {
    public final /* synthetic */ KDf A00;
    public final /* synthetic */ Class A01;

    public Lru(KDf kDf, Class cls) {
        this.A00 = kDf;
        this.A01 = cls;
    }

    @Override // java.security.PrivilegedAction
    public /* bridge */ /* synthetic */ Object run() {
        Field[] declaredFields = this.A01.getDeclaredFields();
        int length = declaredFields.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                AccessibleObject[] accessibleObjectArr = (AccessibleObject[]) A0t.toArray(new Field[0]);
                AccessibleObject.setAccessible(accessibleObjectArr, true);
                return accessibleObjectArr;
            }
            Field field = declaredFields[i2];
            if (field.isEnumConstant()) {
                A0t.add(field);
            }
            i = i2 + 1;
        }
    }
}
