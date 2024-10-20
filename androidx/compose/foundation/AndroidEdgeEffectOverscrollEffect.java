package androidx.compose.foundation;

import X.04S;
import X.0KF;
import X.AJV;
import X.AnonymousClass001;
import X.DKH;
import X.JQz;
import X.JR0;
import X.JR1;
import X.JYa;
import X.JeI;
import X.JeJ;
import X.KZg;
import X.KZo;
import X.KiX;
import X.KsK;
import X.Kse;
import X.Kv3;
import X.KvH;
import X.KvJ;
import X.L5e;
import X.LCr;
import X.LD6;
import X.LE0;
import X.LNp;
import X.LO7;
import X.MJw;
import X.MLj;
import X.MN4;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* loaded from: AndroidEdgeEffectOverscrollEffect.class */
public final class AndroidEdgeEffectOverscrollEffect implements MJw {
    public LE0 A00;
    public KsK A01;
    public long A02;
    public boolean A03;
    public final LD6 A04;
    public final MN4 A05;
    public final MLj A06;

    public AndroidEdgeEffectOverscrollEffect(Context context, Kse kse) {
        LD6 ld6 = new LD6(context, L5e.A00(kse.A00));
        this.A04 = ld6;
        04S r0 = 04S.A00;
        this.A05 = LO7.A02(LNp.A00, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A02 = 0L;
        AJV ajv = new AJV(this, null, 5);
        KiX kiX = KZg.A00;
        this.A06 = new SuspendPointerInputElement(r0, ajv).D4B((MLj) (Build.VERSION.SDK_INT >= 31 ? new JeI(this, ld6, KZo.A00) : new JeJ(this, ld6, kse, KZo.A00)));
    }

    private final float A00(long j) {
        float A00 = DKH.A00(A07());
        float A02 = JR1.A02(j);
        float A002 = A02 / LCr.A00(this.A02);
        EdgeEffect A003 = LD6.A00(this.A04);
        return Kv3.A00(A003) != 0.0f ? A02 : (-Kv3.A01(A003, -A002, 1.0f - A00)) * LCr.A00(this.A02);
    }

    private final float A01(long j) {
        float A02 = JR1.A02(A07());
        float A00 = DKH.A00(j);
        float A01 = A00 / LCr.A01(this.A02);
        EdgeEffect A012 = LD6.A01(this.A04);
        return Kv3.A00(A012) != 0.0f ? A00 : Kv3.A01(A012, A01, 1.0f - A02) * LCr.A01(this.A02);
    }

    private final float A02(long j) {
        float A02 = JR1.A02(A07());
        float A00 = DKH.A00(j);
        float A01 = A00 / LCr.A01(this.A02);
        EdgeEffect A022 = LD6.A02(this.A04);
        return Kv3.A00(A022) != 0.0f ? A00 : (-Kv3.A01(A022, -A01, A02)) * LCr.A01(this.A02);
    }

    private final float A03(long j) {
        float A00 = DKH.A00(A07());
        float A02 = JR1.A02(j);
        float A002 = A02 / LCr.A00(this.A02);
        EdgeEffect A03 = LD6.A03(this.A04);
        return Kv3.A00(A03) != 0.0f ? A02 : Kv3.A01(A03, A002, A00) * LCr.A00(this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r0.isFinished() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A04() {
        /*
            r301 = this;
            r0 = r301
            X.LD6 r0 = r0.A04
            r302 = r0
            r0 = r302
            android.widget.EdgeEffect r0 = r0.A07
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L94
            r0 = r303
            r0.onRelease()
            r0 = r303
            boolean r0 = r0.isFinished()
            r304 = r0
        L17:
            r0 = r302
            android.widget.EdgeEffect r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r303
            r0.onRelease()
            r0 = r303
            boolean r0 = r0.isFinished()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3c
            r0 = r304
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L3e
        L3c:
            r0 = 1
            r304 = r0
        L3e:
            r0 = r302
            android.widget.EdgeEffect r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L65
            r0 = r303
            r0.onRelease()
            r0 = r303
            boolean r0 = r0.isFinished()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L63
            r0 = r304
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L65
        L63:
            r0 = 1
            r304 = r0
        L65:
            r0 = r302
            android.widget.EdgeEffect r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7d
            r0 = r303
            r0.onRelease()
            r0 = r303
            boolean r0 = r0.isFinished()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L81
        L7d:
            r0 = r304
            if (r0 == 0) goto L93
        L81:
            r0 = r301
            X.MN4 r0 = r0.A05
            r306 = r0
            X.04S r0 = X.04S.A00
            r303 = r0
            r0 = r306
            r1 = r303
            r0.Cvx(r1)
        L93:
            return
        L94:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A04():void");
    }

    public static final void A05(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof JYa)) {
            edgeEffect.onRelease();
            return;
        }
        JYa jYa = (JYa) edgeEffect;
        float f2 = jYa.A00 + f;
        jYa.A00 = f2;
        if (Math.abs(f2) > jYa.A01) {
            jYa.onRelease();
        }
    }

    public static final void A06(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final long A07() {
        LE0 le0 = this.A00;
        long A01 = le0 != null ? le0.A00 : KvJ.A01(this.A02);
        float A00 = DKH.A00(A01);
        long j = this.A02;
        return KvH.A00(A00 / LCr.A01(j), JR1.A02(A01) / LCr.A00(j));
    }

    public final void A08(long j) {
        long j2 = this.A02;
        boolean A1O = AnonymousClass001.A1O((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)));
        boolean z = !AnonymousClass001.A1O((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        this.A02 = j;
        if (z) {
            LD6 ld6 = this.A04;
            long A0S = JR1.A0S(0KF.A01(LCr.A01(j)), 0KF.A01(LCr.A00(j)));
            ld6.A00 = A0S;
            EdgeEffect edgeEffect = ld6.A07;
            if (edgeEffect != null) {
                edgeEffect.setSize(JQz.A0C(A0S), JR0.A0I(A0S));
            }
            EdgeEffect edgeEffect2 = ld6.A01;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize(JQz.A0C(A0S), JR0.A0I(A0S));
            }
            EdgeEffect edgeEffect3 = ld6.A03;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize(JR0.A0I(A0S), JQz.A0C(A0S));
            }
            EdgeEffect edgeEffect4 = ld6.A05;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize(JR0.A0I(A0S), JQz.A0C(A0S));
            }
            EdgeEffect edgeEffect5 = ld6.A08;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize(JQz.A0C(A0S), JR0.A0I(A0S));
            }
            EdgeEffect edgeEffect6 = ld6.A02;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize(JQz.A0C(A0S), JR0.A0I(A0S));
            }
            EdgeEffect edgeEffect7 = ld6.A04;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize(JR0.A0I(A0S), JQz.A0C(A0S));
            }
            EdgeEffect edgeEffect8 = ld6.A06;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize(JR0.A0I(A0S), JQz.A0C(A0S));
            }
        }
        if (A1O || !z) {
            return;
        }
        this.A05.Cvx(04S.A00);
        A04();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d0  */
    @Override // X.MJw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A94(X.0DR r302, kotlin.jvm.functions.Function2 r303, long r304) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A94(X.0DR, kotlin.jvm.functions.Function2, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0355, code lost:
    
        if (X.JQz.A1W(r0) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x037b, code lost:
    
        if (r327 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0376, code lost:
    
        if (r310 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b0, code lost:
    
        if (X.JQz.A1W(r0) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0304, code lost:
    
        if (X.JQz.A1W(r0) != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0316  */
    @Override // X.MJw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A95(kotlin.jvm.functions.Function1 r302, int r303, long r304) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A95(kotlin.jvm.functions.Function1, int, long):long");
    }

    @Override // X.MJw
    public MLj Aix() {
        return this.A06;
    }

    @Override // X.MJw
    public boolean BTQ() {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        LD6 ld6 = this.A04;
        EdgeEffect edgeEffect4 = ld6.A07;
        return ((edgeEffect4 == null || Kv3.A00(edgeEffect4) == 0.0f) && ((edgeEffect = ld6.A01) == null || Kv3.A00(edgeEffect) == 0.0f) && (((edgeEffect2 = ld6.A03) == null || Kv3.A00(edgeEffect2) == 0.0f) && ((edgeEffect3 = ld6.A05) == null || Kv3.A00(edgeEffect3) == 0.0f))) ? false : true;
    }
}
