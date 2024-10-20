package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* renamed from: X.28u, reason: invalid class name */
/* loaded from: 28u.class */
public final class C28u extends C1rj {
    public SparseArray A00;
    public boolean A01;
    public final 1Ii A02;
    public final Integer A03;

    public C28u(1Ii r302, Integer num) {
        super("HostComponent");
        this.A01 = false;
        this.A03 = num;
        this.A02 = r302;
    }

    public static C28u A00(1Iw r301) {
        C02A c02a = r301.A03.A01;
        Integer num = c02a.A06;
        if (num != 0S2.A01 && c02a.A04.A01) {
            num = 0S2.A00;
        }
        return new C28u(c02a.A04, num);
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        Integer num = this.A03;
        11T.A0F(context, 1);
        return new ComponentHost(context, null, num);
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        return true;
    }

    @Override // X.C1rj
    public void A1J(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        3vD r0;
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.A0I && componentHost.A0F && (r0 = componentHost.A06) != null) {
            r0.A0e();
        }
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((ComponentHost) obj).A0F = this.A01;
    }

    @Override // X.C1rj, X.C1rk
    public 1Ii B3u() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.A01 != false) goto L6;
     */
    @Override // X.C1rj, X.C1rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C3m7 Brt(final int r302) {
        /*
            r301 = this;
            r0 = r301
            X.1Ii r0 = r0.A02
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1c
            r0 = r303
            boolean r0 = r0.A01
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            X.3bn r0 = new X.3bn
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28u.Brt(int):X.3m7");
    }
}
