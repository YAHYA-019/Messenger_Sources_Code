package X;

/* renamed from: X.6s2, reason: invalid class name */
/* loaded from: 6s2.class */
public final class C6s2 {
    public final java.util.Map A00;

    public C6s2(java.util.Map map) {
        this.A00 = map;
    }

    public int A00(6Ku r302) {
        int i = (-1) >>> 1;
        if (r302 != null) {
            java.util.Map map = this.A00;
            Class<?> cls = r302.getClass();
            Number number = (Number) map.get(cls);
            if (number == null) {
                0fH.A0o("DefaultBannerPrioritizer", AnonymousClass001.A0Z(cls, "Missing priority for banner: ", AnonymousClass001.A0k()));
                return i;
            }
            i = number.intValue();
        }
        return i;
    }
}
