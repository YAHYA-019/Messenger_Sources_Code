package X;

/* renamed from: X.0Au, reason: invalid class name */
/* loaded from: 0Au.class */
public final class C0Au implements C07i {
    public final C06g A00;
    public final /* synthetic */ 07Z A01;

    public C0Au(C06g c06g, 07Z r303) {
        this.A01 = r303;
        this.A00 = c06g;
    }

    @Override // X.C07i
    public void cancel() {
        07Z r0 = this.A01;
        C07a c07a = r0.A05;
        C06g c06g = this.A00;
        c07a.remove(c06g);
        if (11T.A0O(r0.A00, c06g)) {
            c06g.A02();
            r0.A00 = null;
        }
        c06g.A02.remove(this);
        C00m c00m = c06g.A00;
        if (c00m != null) {
            c00m.invoke();
        }
        c06g.A00 = null;
    }
}
