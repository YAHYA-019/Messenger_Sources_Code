package X;

/* renamed from: X.0js, reason: invalid class name */
/* loaded from: 0js.class */
public final class C0js {
    public int A00;
    public C0k0 A01;
    public final int A02;
    public final /* synthetic */ 0Sa A03;

    public C0js(0Sa r302, int i) {
        this.A03 = r302;
        this.A02 = i;
    }

    public final C0k0 A00() {
        if (this.A00 <= 0) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
        C0k0 c0k0 = this.A01;
        if (c0k0 != null) {
            return c0k0;
        }
        throw AnonymousClass001.A0L("Required value was null.");
    }
}
