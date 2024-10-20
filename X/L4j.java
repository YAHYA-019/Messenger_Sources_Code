package X;

import android.graphics.Outline;
import android.os.Build;

/* loaded from: L4j.class */
public final class L4j {
    public float A00;
    public long A01;
    public long A02;
    public KR7 A03;
    public MLe A04;
    public MLe A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public L4g A0A;
    public MLe A0B;
    public final Outline A0C;

    public L4j() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0C = outline;
        this.A02 = 0L;
        this.A01 = 0L;
    }

    public static final void A00(L4j l4j) {
        MLe mLe;
        if (l4j.A06) {
            l4j.A02 = 0L;
            l4j.A00 = 0.0f;
            l4j.A05 = null;
            l4j.A06 = false;
            l4j.A09 = false;
            KR7 kr7 = l4j.A03;
            if (kr7 != null && l4j.A08) {
                long j = l4j.A01;
                if (LCr.A01(j) > 0.0f && LCr.A00(j) > 0.0f) {
                    l4j.A07 = true;
                    if (kr7 instanceof C2905Jct) {
                        L5L l5l = ((C2905Jct) kr7).A00;
                        float f = l5l.A01;
                        float f2 = l5l.A03;
                        l4j.A02 = KvH.A00(f, f2);
                        float f3 = l5l.A02;
                        float f4 = f3 - f;
                        float f5 = l5l.A00;
                        l4j.A01 = KvJ.A00(f4, f5 - f2);
                        l4j.A0C.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f5));
                        return;
                    }
                    if (kr7 instanceof C2906Jcu) {
                        L4g l4g = ((C2906Jcu) kr7).A00;
                        long j2 = l4g.A06;
                        long j3 = Kwy.A00;
                        float A00 = DKH.A00(j2);
                        float f6 = l4g.A01;
                        float f7 = l4g.A03;
                        l4j.A02 = KvH.A00(f6, f7);
                        float f8 = l4g.A02;
                        float f9 = f8 - f6;
                        float f10 = l4g.A00;
                        l4j.A01 = KvJ.A00(f9, f10 - f7);
                        if (KvI.A01(l4g)) {
                            l4j.A0C.setRoundRect(Math.round(f6), Math.round(f7), Math.round(f8), Math.round(f10), A00);
                            l4j.A00 = A00;
                            return;
                        }
                        mLe = l4j.A04;
                        if (mLe == null) {
                            mLe = LOR.A00();
                            l4j.A04 = mLe;
                        }
                        ((LOR) mLe).A03.reset();
                        mLe.A7F(l4g, 0S2.A00);
                    } else if (!(kr7 instanceof Jcs)) {
                        return;
                    } else {
                        mLe = ((Jcs) kr7).A00;
                    }
                    if (Build.VERSION.SDK_INT > 28 || ((LOR) mLe).A03.isConvex()) {
                        Outline outline = l4j.A0C;
                        if (!(mLe instanceof LOR)) {
                            throw AnonymousClass001.A0q("Unable to obtain android.graphics.Path");
                        }
                        outline.setConvexPath(((LOR) mLe).A03);
                        l4j.A09 = !outline.canClip();
                    } else {
                        l4j.A07 = false;
                        l4j.A0C.setEmpty();
                        l4j.A09 = true;
                    }
                    l4j.A05 = mLe;
                    return;
                }
            }
            l4j.A0C.setEmpty();
        }
    }

    public final Outline A01() {
        A00(this);
        if (this.A08 && this.A07) {
            return this.A0C;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        if (X.DKH.A00(r0) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.MLE r302) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4j.A02(X.MLE):void");
    }

    public final boolean A03(KR7 kr7, float f, float f2, long j, boolean z) {
        this.A0C.setAlpha(f);
        boolean z2 = !11T.A0O(this.A03, kr7);
        if (z2) {
            this.A03 = kr7;
            this.A06 = true;
        }
        this.A01 = j;
        boolean z3 = kr7 != null && (z || f2 > 0.0f);
        if (this.A08 != z3) {
            this.A08 = z3;
            this.A06 = true;
        }
        return z2;
    }
}
