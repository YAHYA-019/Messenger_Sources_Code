package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.JcK, reason: case insensitive filesystem */
/* loaded from: JcK.class */
public final class C2890JcK extends LPR implements MNW, MBR, MNN {
    public KMT A01;
    public MKq A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public L5L A06;
    public final ScrollingLogic A08;
    public final 9Wc A07 = new 9Wc();
    public long A00 = 0;

    public C2890JcK(KMT kmt, ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = kmt;
        this.A08 = scrollingLogic;
        this.A04 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        if (r310 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float A00(X.MLh r301, X.C2890JcK r302) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2890JcK.A00(X.MLh, X.JcK):float");
    }

    public static final long A01(C2890JcK c2890JcK, L5L l5l, long j) {
        long A01 = KvR.A01(j);
        int ordinal = c2890JcK.A01.ordinal();
        if (ordinal == 0) {
            MLh mLh = (MLh) KUe.A00(KbY.A01, c2890JcK);
            float f = l5l.A03;
            return KvH.A00(0.0f, mLh.ADM(f, l5l.A00 - f, LCr.A00(A01)));
        }
        if (ordinal != 1) {
            throw 1BK.A1F();
        }
        MLh mLh2 = (MLh) KUe.A00(KbY.A01, c2890JcK);
        float f2 = l5l.A01;
        return KvH.A00(mLh2.ADM(f2, l5l.A02 - f2, LCr.A01(A01)), 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final L5L A02(C2890JcK c2890JcK) {
        L5L l5l = null;
        if (((LPR) c2890JcK).A08) {
            AbstractC2938JdR A03 = LDX.A03(c2890JcK);
            MKq mKq = c2890JcK.A02;
            if (mKq != null && mKq.BQl()) {
                l5l = A03.BZ3(mKq, false);
            }
        }
        return l5l;
    }

    public static final void A03(C2890JcK c2890JcK) {
        MLh mLh = (MLh) KUe.A00(KbY.A01, c2890JcK);
        if (!(!c2890JcK.A03)) {
            throw AnonymousClass001.A0N("launchAnimation called when previous animation was running");
        }
        2aK.A03(0S2.A0N, (0DE) null, new AnonymousClass851(mLh, (0DR) null, c2890JcK, new UpdatableAnimationState(mLh.B9D()), 1), c2890JcK.A08(), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (java.lang.Math.abs(X.JR1.A02(r0)) > 0.5f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A04(X.C2890JcK r301, X.L5L r302, long r303) {
        /*
            r0 = r301
            r1 = r302
            r2 = r303
            long r0 = A01(r0, r1, r2)
            r303 = r0
            r0 = r303
            float r0 = X.DKH.A00(r0)
            float r0 = java.lang.Math.abs(r0)
            r305 = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r306 = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 > 0) goto L3c
            r0 = r303
            float r0 = X.JR1.A02(r0)
            float r0 = java.lang.Math.abs(r0)
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 <= 0) goto L44
        L3c:
            r0 = 0
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r301 = r0
        L44:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2890JcK.A04(X.JcK, X.L5L, long):boolean");
    }

    public /* synthetic */ void CBt(MKq mKq) {
    }

    public void CGF(long j) {
        int i;
        long j2;
        L5L A02;
        long j3 = this.A00;
        this.A00 = j;
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            i = (int) (j & 4294967295L);
            j2 = j3 & 4294967295L;
        } else {
            if (ordinal != 1) {
                throw 1BK.A1F();
            }
            i = (int) (j >> 32);
            j2 = j3 >> 32;
        }
        if (11T.A00(i, (int) j2) >= 0 || (A02 = A02(this)) == null) {
            return;
        }
        L5L l5l = this.A06;
        if (l5l == null) {
            l5l = A02;
        }
        if (!this.A03 && !this.A05 && A04(this, l5l, j3) && !A04(this, A02, j)) {
            this.A05 = true;
            A03(this);
        }
        this.A06 = A02;
    }
}
