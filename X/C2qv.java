package X;

/* renamed from: X.2qv, reason: invalid class name */
/* loaded from: 2qv.class */
public abstract class C2qv {
    public static C46q A00(Object obj) {
        return new C46q(obj.getClass().getSimpleName());
    }

    public static boolean A01(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
