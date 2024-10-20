package X;

/* renamed from: X.Dff, reason: case insensitive filesystem */
/* loaded from: Dff.class */
public final class C2151Dff extends AbstractC2178Dg6 {
    public FF6 A00;
    public ERE A01;
    public GCe A02;
    public ENZ A03;
    public F7h A04;
    public F7h A05;
    public 1Im A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;

    public C2151Dff(1Iw r302) {
        super(r302);
        this.A02 = ERF.A02;
        this.A01 = ERE.A01;
        this.A09 = true;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0J(int i) {
        this.A07 = super.A05.A0D(i);
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        this.A07 = charSequence;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0110, code lost:
    
        if (r316 != null) goto L27;
     */
    @Override // X.AbstractC2178Dg6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1rs A0N(X.EzJ r302) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2151Dff.A0N(X.EzJ):X.1rs");
    }

    public final void A0f(3Eh r302) {
        11T.A0F("Invalid icon provided", 1);
        FF6 A0I = A0I(r302);
        if (A0I == null) {
            ((ESq) this).A00 = true;
            A0I = null;
        }
        this.A00 = A0I;
    }

    public void A0g(C26z c26z, float f) {
        11T.A0F(c26z, 0);
        AbstractC2178Dg6.A0B(this, super.A05, c26z, f);
    }
}
