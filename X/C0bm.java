package X;

/* renamed from: X.0bm, reason: invalid class name */
/* loaded from: 0bm.class */
public abstract class C0bm {
    public static String A00(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (Exception e) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("[bad fmt: \"");
            A0k.append(str);
            A0k.append("\" (");
            A0k.append(e);
            return AnonymousClass001.A0d(")]", A0k);
        }
    }
}
