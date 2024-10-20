package X;

/* renamed from: X.4sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sb.class */
public final class C10064sb {
    public final 2HZ A00;
    public final 2Cy A01;
    public final C00i A02;

    public C10064sb(2HZ r302, 2Cy r303, C00i c00i) {
        if (r302 == null) {
            throw AnonymousClass001.A0N("CacheTracker.Factory cannot be null");
        }
        this.A00 = r302;
        this.A02 = c00i;
        if (r303 == null) {
            throw AnonymousClass001.A0N("MemoryTrimmableRegistry cannot be null");
        }
        this.A01 = r303;
    }

    public final C10074sc A00(String str, int i) {
        2Hb A00 = this.A00.A00(str);
        C00i c00i = this.A02;
        11T.A0F(c00i, 3);
        return new C10074sc(A00, c00i, i, (-1) >>> 1, 0);
    }
}
