package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: D0i.class */
public final class D0i implements DHr {
    public final D0a A00;
    public final D0e A01;
    public final D0g A02;
    public final DHq A03 = new D0h(this);
    public final C6B A04;

    public D0i(FbUserSession fbUserSession) {
        D0e d0e = (D0e) 1Lo.A06(fbUserSession, 85119);
        C6B c6b = (C6B) 1Lo.A06(fbUserSession, 85107);
        D0a d0a = (D0a) 1Lo.A06(fbUserSession, 85115);
        D0g d0g = (D0g) 1Lo.A06(fbUserSession, 85112);
        this.A01 = d0e;
        this.A00 = d0a;
        this.A02 = d0g;
        this.A04 = c6b;
    }

    @Override // X.DHr
    public void Bm8() {
    }

    @Override // X.DHr
    public void C0t() {
    }
}
