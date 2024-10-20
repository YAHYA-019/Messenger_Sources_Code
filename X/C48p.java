package X;

/* renamed from: X.48p, reason: invalid class name */
/* loaded from: 48p.class */
public final /* synthetic */ class C48p implements 0BU {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Throwable A02;

    public /* synthetic */ C48p(String str, String str2, Throwable th) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = th;
    }

    public final Object get() {
        String str = this.A00;
        String str2 = this.A01;
        return new Exception(0Pz.A0j(str, ": ", str2), this.A02);
    }
}
