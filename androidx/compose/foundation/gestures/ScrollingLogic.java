package androidx.compose.foundation.gestures;

import X.04S;
import X.0DR;
import X.0Ds;
import X.AJj;
import X.DKH;
import X.JQx;
import X.JR1;
import X.JR2;
import X.KMS;
import X.KMT;
import X.KvH;
import X.LE0;
import X.LMl;
import X.M6n;
import X.MBC;
import X.ME5;
import X.MJw;
import X.MKN;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: ScrollingLogic.class */
public final class ScrollingLogic {
    public MJw A01;
    public MBC A02;
    public KMT A03;
    public MKN A05;
    public NestedScrollDispatcher A06;
    public boolean A07;
    public int A00 = 1;
    public ME5 A04 = ScrollableKt.A00;
    public final LMl A08 = new LMl(this);
    public final Function1 A09 = M6n.A00(this, 14);

    public ScrollingLogic(MJw mJw, MBC mbc, KMT kmt, MKN mkn, NestedScrollDispatcher nestedScrollDispatcher, boolean z) {
        this.A05 = mkn;
        this.A01 = mJw;
        this.A02 = mbc;
        this.A03 = kmt;
        this.A07 = z;
        this.A06 = nestedScrollDispatcher;
    }

    public static final long A00(ME5 me5, ScrollingLogic scrollingLogic, int i, long j) {
        NestedScrollNode A00 = NestedScrollDispatcher.A00(scrollingLogic.A06);
        long CD7 = A00 != null ? A00.CD7(j, i) : 0L;
        long A03 = LE0.A03(j, CD7);
        long A032 = scrollingLogic.A03(A03);
        if (scrollingLogic.A07) {
            A032 = LE0.A02(-1.0f, A032);
        }
        long A02 = scrollingLogic.A02(me5.Cjq(scrollingLogic.A01(A032)));
        if (scrollingLogic.A07) {
            A02 = LE0.A02(-1.0f, A02);
        }
        long A033 = LE0.A03(A03, A02);
        NestedScrollNode A002 = NestedScrollDispatcher.A00(scrollingLogic.A06);
        return LE0.A04(LE0.A04(CD7, A02), A002 != null ? A002.CD2(A02, A033, i) : 0L);
    }

    public final float A01(long j) {
        return this.A03 == KMT.A01 ? DKH.A00(j) : JR1.A02(j);
    }

    public final long A02(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        return this.A03 == KMT.A01 ? KvH.A00(f, 0.0f) : KvH.A00(0.0f, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long A03(long j) {
        byte b = 2;
        if (this.A03 == KMT.A01) {
            b = true;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        if ((b & true) != false) {
            f = DKH.A00(j);
        }
        if (((b == true ? 1 : 0) & 2) != 0) {
            f2 = JQx.A04(4294967295L, j);
        }
        return JR2.A0B(f, f2);
    }

    public final Object A04(KMS kms, 0DR r303, Function2 function2) {
        Object Cjp = this.A05.Cjp(kms, r303, new AJj(this, function2, (0DR) null, 4, 42));
        if (Cjp != 0Ds.A02) {
            Cjp = 04S.A00;
        }
        return Cjp;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /* JADX WARN: Type inference failed for: r313v0, types: [X.0Pn, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A05(X.0DR r302, long r303) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.A05(X.0DR, long):java.lang.Object");
    }
}
