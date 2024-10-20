package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.8z2, reason: invalid class name */
/* loaded from: 8z2.class */
public final class C8z2 extends 1XK implements 1XM {
    public final /* synthetic */ 5Xd A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8z2(1Um r302, 5Xd r303) {
        super(r302);
        this.A00 = r303;
    }

    public 1X9 A00() {
        5Xd r0 = this.A00;
        C1qL c1qL = 5Xd.A00;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, A1e.A00(this, r0, A0P, 56), A0P, false);
        return A0P;
    }
}
