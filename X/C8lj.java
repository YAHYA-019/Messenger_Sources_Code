package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.8lj, reason: invalid class name */
/* loaded from: 8lj.class */
public final class C8lj extends C1rj {
    public float A00;
    public View.OnLongClickListener A01;
    public 6NW A02;
    public String A03;
    public boolean A04;

    public C8lj() {
        super("GiftBoxOverlayComponent");
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new JXq(context, AU3.A00);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (X.0Ig.A00(r310, r306) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0r(X.1LI r302, X.1LI r303, X.2Yv r304, X.2Yv r305) {
        /*
            r301 = this;
            r0 = r302
            X.8lj r0 = (X.C8lj) r0
            r302 = r0
            r0 = r303
            X.8lj r0 = (X.C8lj) r0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L81
            r0 = 0
            r307 = r0
        L14:
            r0 = r303
            if (r0 != 0) goto L78
            r0 = 0
            r308 = r0
        L1b:
            r0 = r302
            if (r0 != 0) goto L63
            r0 = 0
            r309 = r0
            r0 = 0
            r310 = r0
        L25:
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r305
            X.8pC r0 = (X.8pC) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.A00
            r311 = r0
            r0 = r311
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
        L3e:
            r0 = r307
            r1 = r308
            boolean r0 = X.0Ig.A00(r0, r1)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L5d
            r0 = r310
            r1 = r306
            boolean r0 = X.0Ig.A00(r0, r1)
            r309 = r0
            r0 = 0
            r311 = r0
            r0 = r309
            if (r0 != 0) goto L60
        L5d:
            r0 = 1
            r311 = r0
        L60:
            r0 = r311
            return r0
        L63:
            r0 = r304
            X.8pC r0 = (X.8pC) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.A00
            r311 = r0
            r0 = r311
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r310 = r0
            goto L25
        L78:
            r0 = r303
            java.lang.String r0 = r0.A03
            r308 = r0
            goto L1b
        L81:
            r0 = r302
            java.lang.String r0 = r0.A03
            r307 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8lj.A0r(X.1LI, X.1LI, X.2Yv, X.2Yv):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        JXq jXq = (JXq) obj;
        float f = this.A00;
        11T.A0F(jXq, 1);
        jXq.A00 = f;
        JVX jvx = jXq.A01;
        if (jvx == null || jvx.A01 == f) {
            return;
        }
        jvx.A01 = f;
        jvx.A05 = true;
        jvx.invalidateSelf();
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        8pC A0P = 4YU.A0P(r302);
        JXq jXq = (JXq) obj;
        String str = this.A03;
        6NW r0 = this.A02;
        boolean z = this.A04;
        View.OnLongClickListener onLongClickListener = this.A01;
        boolean z2 = A0P.A00;
        1BL.A1H(jXq, str, r0);
        if (z2 || r0.BNH(str)) {
            jXq.setVisibility(8);
            return;
        }
        r0.ACD(jXq, str);
        jXq.setVisibility(0);
        jXq.A02();
        if (z) {
            jXq.setOnClickListener(null);
            jXq.setClickable(false);
        } else {
            jXq.setOnClickListener(new 9pY(r302, r0, str, 5));
        }
        if (onLongClickListener != null) {
            jXq.setOnLongClickListener(onLongClickListener);
        }
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        JXq jXq = (JXq) obj;
        String str = this.A03;
        6NW r0 = this.A02;
        1BL.A1H(jXq, str, r0);
        r0.D5b(jXq, str);
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8lj c8lj = (C8lj) r302;
            if (Float.compare(this.A00, c8lj.A00) != 0 || this.A04 != c8lj.A04) {
                return false;
            }
            6NW r0 = this.A02;
            6NW r02 = c8lj.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            View.OnLongClickListener onLongClickListener = this.A01;
            View.OnLongClickListener onLongClickListener2 = c8lj.A01;
            if (onLongClickListener != null) {
                if (!onLongClickListener.equals(onLongClickListener2)) {
                    return false;
                }
            } else if (onLongClickListener2 != null) {
                return false;
            }
            String str = this.A03;
            String str2 = c8lj.A03;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return true;
    }
}
