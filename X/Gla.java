package X;

import android.content.Context;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.plugins.LoadingSpinnerPlugin;

/* loaded from: Gla.class */
public final class Gla extends C1rj {
    public 6TN A00;
    public PlayerOrigin A01;
    public 6TI A02;
    public IhX A03;
    public C6ce A04;
    public GRX A05;

    public Gla() {
        super("LoadingSpinnerComponent");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new LoadingSpinnerPlugin(context, 2132542427);
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
        Gla gla = (Gla) r302;
        Gla gla2 = (Gla) r303;
        6TI r306 = null;
        6TI r307 = gla == null ? null : gla.A02;
        if (gla2 != null) {
            r306 = gla2.A02;
        }
        boolean z = false;
        if (r307 == null) {
            z = true;
        } else if (r306 != null) {
            return !C2qv.A01(r307.A03(), r306.A03());
        }
        return z;
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        6TI r0 = this.A02;
        11T.A0F(r0, 5);
        Object A02 = r0.A02("VideoPluginAspectRatioOverride");
        float A00 = A02 instanceof Float ? 7zM.A00(A02) : (float) r0.A00;
        11T.A0D(c23p);
        C2ra.A02(c23p, A00, i, i2);
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        6U2 r0;
        C6d6 c6d6 = (C6d6) obj;
        C6ce c6ce = this.A04;
        6TI r02 = this.A02;
        IhX ihX = this.A03;
        C3o5.A0k(c6d6, 1, ihX);
        if (r02 == null || (r0 = ihX.A00) == null) {
            return;
        }
        c6d6.A0b(r02, r0, c6ce);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable, X.01s] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            r301 = this;
            r0 = r304
            X.6d6 r0 = (X.C6d6) r0
            r304 = r0
            r0 = r301
            X.6TI r0 = r0.A02
            r305 = r0
            r0 = r301
            com.facebook.video.common.playerorigin.PlayerOrigin r0 = r0.A01
            r306 = r0
            r0 = r301
            X.6TN r0 = r0.A00
            r307 = r0
            r0 = r301
            X.IhX r0 = r0.A03
            r308 = r0
            r0 = r301
            X.GRX r0 = r0.A05
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r304
            r1 = r310
            r2 = r308
            X.7zP.A1L(r0, r1, r2)
            r0 = 16511(0x407f, float:2.3137E-41)
            r311 = r0
            r0 = r308
            X.6U2 r0 = r0.A00
            r312 = r0
            java.lang.String r0 = "LoadingSpinnerComponentSpec"
            r308 = r0
            r0 = r312
            if (r0 != 0) goto L4d
            r0 = r311
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L63
            r313 = r0
            goto L81
        L4d:
            r0 = r309
            if (r0 != 0) goto L64
            r0 = r311
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> L63
            X.01s r0 = (X.C01s) r0     // Catch: java.lang.Throwable -> L63
            r313 = r0
            java.lang.String r0 = "videoPlaybackStatusProvider is null"
            r312 = r0
            goto L8c
        L63:
            throw r0
        L64:
            r0 = r305
            if (r0 == 0) goto L97
            r0 = r304
            r1 = r312
            r0.A0f(r1)
            r0 = r304
            r1 = r309
            r0.A09 = r1
            r0 = r304
            r1 = r307
            r2 = r306
            r3 = r305
            r4 = 0
            r0.A0W(r1, r2, r3, r4)
            return
        L81:
            r0 = r313
            X.01s r0 = (X.C01s) r0
            r313 = r0
            java.lang.String r0 = "event bus is null"
            r312 = r0
        L8c:
            r0 = r313
            r1 = r308
            r2 = r312
            r0.D0v(r1, r2)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gla.A1K(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public void A1L(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C6d6 c6d6 = (C6d6) obj;
        11T.A0F(c6d6, 1);
        c6d6.A0Q();
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C6d6 c6d6 = (C6d6) obj;
        11T.A0F(c6d6, 1);
        c6d6.A0S();
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            Gla gla = (Gla) r302;
            IhX ihX = this.A03;
            IhX ihX2 = gla.A03;
            if (ihX != null) {
                if (!ihX.equals(ihX2)) {
                    return false;
                }
            } else if (ihX2 != null) {
                return false;
            }
            C6ce c6ce = this.A04;
            C6ce c6ce2 = gla.A04;
            if (c6ce != null) {
                if (!c6ce.equals(c6ce2)) {
                    return false;
                }
            } else if (c6ce2 != null) {
                return false;
            }
            PlayerOrigin playerOrigin = this.A01;
            PlayerOrigin playerOrigin2 = gla.A01;
            if (playerOrigin != null) {
                if (!playerOrigin.equals(playerOrigin2)) {
                    return false;
                }
            } else if (playerOrigin2 != null) {
                return false;
            }
            6TN r0 = this.A00;
            6TN r02 = gla.A00;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            6TI r03 = this.A02;
            6TI r04 = gla.A02;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            GRX grx = this.A05;
            GRX grx2 = gla.A05;
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

    @Override // X.C1rj, X.C1rk
    public boolean ADe() {
        return true;
    }
}
