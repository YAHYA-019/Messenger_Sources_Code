package X;

import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* renamed from: X.5S7, reason: invalid class name */
/* loaded from: 5S7.class */
public final class C5S7 extends C1rj {
    public static final C2q8 A06 = C2q8.A03;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C2q8 A05;

    public C5S7() {
        super("Ring");
        this.A00 = -1;
        this.A05 = A06;
        this.A02 = -1;
        this.A03 = 0;
        this.A04 = HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        return new C5ae();
    }

    public boolean A0o() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        11T.A0F(c23p, 4);
        C2ra.A04(c23p, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e0  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1J(X.1Iw r302, X.AnonymousClass274 r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5S7.A1J(X.1Iw, X.274, java.lang.Object):void");
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        11T.A0F(r302, 0);
        11T.A0F(obj, 1);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C5ae c5ae = (C5ae) obj;
        11T.A0F(c5ae, 1);
        c5ae.A04.setShader(null);
        c5ae.invalidateSelf();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((5SB) r303).A00 = false;
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
            C5S7 c5s7 = (C5S7) r302;
            if (this.A00 != c5s7.A00 || this.A01 != c5s7.A01) {
                return false;
            }
            C2q8 c2q8 = this.A05;
            C2q8 c2q82 = c5s7.A05;
            if (c2q8 != null) {
                if (!c2q8.equals(c2q82)) {
                    return false;
                }
            } else if (c2q82 != null) {
                return false;
            }
            if (this.A02 != c5s7.A02 || this.A03 != c5s7.A03 || this.A04 != c5s7.A04) {
                return false;
            }
        }
        return true;
    }
}
