package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: B4f.class */
public final class B4f extends DSE {
    public final long A00;
    public final long A01;
    public final FbUserSession A02;
    public final 1De A03;
    public final 1Br A04;
    public final C1qM A05;

    public B4f(FbUserSession fbUserSession, 1De r303, long j, long j2) {
        super((C1x1) 1Bi.A03(66360), Long.valueOf(j));
        this.A03 = r303;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = fbUserSession;
        this.A05 = new CxO(this, 7);
        this.A04 = AbG.A0U();
    }

    public void onActive() {
        C21S.A00(this.A05, (1Uj) 4YU.A0n(this.A02, this.A03, 16686));
    }

    public void onInactive() {
        C21S.A01(this.A05, (1Uj) 4YU.A0n(this.A02, this.A03, 16686));
    }
}
