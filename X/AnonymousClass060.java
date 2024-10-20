package X;

/* renamed from: X.060, reason: invalid class name */
/* loaded from: 060.class */
public final class AnonymousClass060 implements C0gj {
    public static AnonymousClass060 A03;
    public int A00 = -1;
    public C0gj A01;
    public final 0jH A02;

    public AnonymousClass060(C0gj c0gj, 0jH r303) {
        this.A02 = r303;
        this.A01 = c0gj;
    }

    public static void A00(int i) {
        AnonymousClass060 anonymousClass060 = A03;
        if (anonymousClass060 != null) {
            anonymousClass060.CE2(i);
        }
    }

    @Override // X.C0gj
    public void CE2(int i) {
        C0gj c0gj = this.A01;
        if (c0gj != null) {
            c0gj.CE2(i);
        }
        this.A00 = i;
        C0pu c0pu = this.A02.A03;
        0RZ.A03(c0pu, "Did you call SessionManager.init()?");
        c0pu.A07(i);
    }
}
