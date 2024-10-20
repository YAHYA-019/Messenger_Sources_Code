package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.5dO, reason: invalid class name */
/* loaded from: 5dO.class */
public final class C5dO {
    public final 1De A01;
    public final 1Br A03;
    public final 1Fi A00 = 1Oy.A00.A00(C0f1.A00());
    public final 1Br A02 = 1Bq.A00(16385);
    public final 1Br A04 = 1Bq.A00(16458);

    public C5dO(1De r302) {
        this.A01 = r302;
        this.A03 = 1Bu.A03(r302.A00, 16459);
    }

    public static final void A00(FbUserSession fbUserSession, 5dN r302, C5dO c5dO) {
        ((1xC) 1Lm.A07(fbUserSession, c5dO.A01.A00, 33148)).A02(new Cxn(3, fbUserSession, c5dO, r302), "should_present_peer_device_change_security_alert", ((2yD) c5dO.A02.A00.get()).AZr(1GD.A05, 36314176129408623L));
    }

    public final void A01(FbUserSession fbUserSession, 5dN r303) {
        11T.A0F(r303, 1);
        if (((1GU) this.A04.A00.get()).BWu()) {
            ((1vU) this.A03.A00.get()).A01(new 5dP(fbUserSession, r303, this));
        } else {
            A00(fbUserSession, r303, this);
        }
    }
}
