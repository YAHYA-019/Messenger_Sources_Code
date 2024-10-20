package X;

import java.lang.reflect.Modifier;
import java.util.List;

/* loaded from: L2z.class */
public final class L2z {
    public final List A00;
    public final java.util.Map A01;

    public L2z(List list, java.util.Map map) {
        this.A01 = map;
        this.A00 = list;
    }

    public static String A00(Class cls) {
        StringBuilder A0k;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            A0k = AnonymousClass001.A0k();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else {
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            A0k = AnonymousClass001.A0k();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        }
        A0k.append(str);
        return AnonymousClass001.A0d(cls.getName(), A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01da, code lost:
    
        if (java.lang.String.class.isAssignableFrom(new com.google.gson.reflect.TypeToken(((java.lang.reflect.ParameterizedType) r0).getActualTypeArguments()[0]).rawType) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.MGd A01(com.google.gson.reflect.TypeToken r302) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L2z.A01(com.google.gson.reflect.TypeToken):X.MGd");
    }

    public String toString() {
        return this.A01.toString();
    }
}
