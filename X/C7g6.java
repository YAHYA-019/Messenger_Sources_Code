package X;

import android.content.Context;
import com.facebook.video.common.playerorigin.PlayerOrigin;

/* renamed from: X.7g6, reason: invalid class name */
/* loaded from: 7g6.class */
public final class C7g6 extends C1rj {
    public 6TN A00;
    public PlayerOrigin A01;
    public GRD A02;
    public 6TI A03;
    public 6U2 A04;
    public GRX A05;

    public C7g6() {
        super("FallbackPlayIconPluginComponent");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new H31(context, 2132543355);
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        C7g6 c7g6 = (C7g6) r302;
        C7g6 c7g62 = (C7g6) r303;
        6TI r306 = null;
        6TI r307 = c7g6 == null ? null : c7g6.A03;
        if (c7g62 != null) {
            r306 = c7g62.A03;
        }
        String str = null;
        String A03 = r307 != null ? r307.A03() : null;
        if (r306 != null) {
            str = r306.A03();
        }
        return !11T.A0O(A03, str);
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        1BK.A1K(r302, 0, c23p);
        Context context = r302.A0D;
        11T.A0A(context);
        int A00 = C0A8.A00(context, 60.0f);
        C2ra.A05(c23p, i, i2, A00, A00);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C6d6 c6d6 = (C6d6) obj;
        GRD grd = this.A02;
        PlayerOrigin playerOrigin = this.A01;
        6TN r0 = this.A00;
        6U2 r02 = this.A04;
        6TI r03 = this.A03;
        GRX grx = this.A05;
        11T.A0F(r302, 0);
        1BL.A1H(c6d6, grd, playerOrigin);
        11T.A0F(r0, 4);
        1BL.A1G(r02, r03);
        11T.A0F(grx, 7);
        c6d6.A04 = grd;
        c6d6.A0U(r0, playerOrigin, grd, r03, r02, null, grx);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C6d6 c6d6 = (C6d6) obj;
        11T.A0F(c6d6, 1);
        c6d6.A04 = null;
        c6d6.A0N();
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C7g6 c7g6 = (C7g6) r302;
            GRD grd = this.A02;
            GRD grd2 = c7g6.A02;
            if (grd != null) {
                if (!grd.equals(grd2)) {
                    return false;
                }
            } else if (grd2 != null) {
                return false;
            }
            PlayerOrigin playerOrigin = this.A01;
            PlayerOrigin playerOrigin2 = c7g6.A01;
            if (playerOrigin != null) {
                if (!playerOrigin.equals(playerOrigin2)) {
                    return false;
                }
            } else if (playerOrigin2 != null) {
                return false;
            }
            6TN r0 = this.A00;
            6TN r02 = c7g6.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            6U2 r03 = this.A04;
            6U2 r04 = c7g6.A04;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            6TI r05 = this.A03;
            6TI r06 = c7g6.A03;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
            GRX grx = this.A05;
            GRX grx2 = c7g6.A05;
            if (grx != null) {
                if (!grx.equals(grx2)) {
                    return false;
                }
            } else if (grx2 != null) {
                return false;
            }
        }
        return true;
    }
}
