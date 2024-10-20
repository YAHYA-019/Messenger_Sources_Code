package X;

/* loaded from: H3c.class */
public final class H3c extends C4yx {
    public C4yy A00;
    public final C4yy A01;

    public H3c() {
        C4yy c4yy = C4yy.A06;
        this.A00 = c4yy;
        super.A00 = false;
        this.A01 = c4yy;
    }

    @Override // X.C4yx
    public C4yy A01() {
        return this.A01;
    }

    public final void A03(int i, int i2) {
        this.A00 = new C4yy(30.0f, 1280, ((int) (((((i * i2) * 30) * 4) * 0.07d) / 1000.0d)) * 1024, 10, -1, false);
    }
}
