package X;

/* renamed from: X.67i, reason: invalid class name */
/* loaded from: 67i.class */
public abstract class C67i {
    public String A02(C68D c68d, String str) {
        C67h c67h = (C67h) this;
        String str2 = c67h.A00;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = c68d.A00.getReturnType();
        if ((returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
            return c67h.A02 ? C67h.A01(str, 2) : C67h.A00(str, 2);
        }
        return null;
    }

    public abstract String A03(C68D c68d, String str);
}
