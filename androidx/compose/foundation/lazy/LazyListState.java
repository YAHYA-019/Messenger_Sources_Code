package androidx.compose.foundation.lazy;

import X.04S;
import X.0DE;
import X.0DR;
import X.0QD;
import X.11T;
import X.1BK;
import X.2aI;
import X.2aK;
import X.7zM;
import X.7zN;
import X.7zU;
import X.9qN;
import X.9qP;
import X.AVM;
import X.AnonymousClass001;
import X.C0B7;
import X.C2821Jad;
import X.GAc;
import X.JQz;
import X.JTs;
import X.KZN;
import X.KdK;
import X.KdZ;
import X.Kda;
import X.KuM;
import X.KvA;
import X.Kzz;
import X.L32;
import X.L3G;
import X.L7h;
import X.LCW;
import X.LMV;
import X.LN8;
import X.LNA;
import X.LNB;
import X.LNp;
import X.LNu;
import X.LO5;
import X.LO7;
import X.LPE;
import X.LPK;
import X.Lsv;
import X.M4l;
import X.M6n;
import X.M7f;
import X.MBB;
import X.MBH;
import X.MBJ;
import X.MBK;
import X.MEQ;
import X.MHq;
import X.MHv;
import X.MKN;
import X.MMs;
import X.MN4;
import X.MN8;
import X.MNh;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: LazyListState.class */
public final class LazyListState implements MKN {
    public static final MHv A0O;
    public float A00;
    public LNu A01;
    public LPE A02;
    public MEQ A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public final MMs A07;
    public final MBJ A08;
    public final MBK A09;
    public final L7h A0A;
    public final AwaitFirstLayoutModifier A0B;
    public final Kda A0C;
    public final L3G A0D;
    public final Lsv A0E;
    public final Kzz A0F;
    public final MN4 A0G;
    public final MN4 A0H;
    public final MN4 A0I;
    public final MN4 A0J;
    public final MN4 A0K;
    public final MN8 A0L;
    public final MKN A0M;
    public final KdZ A0N;

    static {
        M7f m7f = M7f.A00;
        M4l m4l = M4l.A00;
        AVM avm = new AVM(m7f, 7);
        11T.A0I(m4l, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        C0B7.A04(m4l, 1);
        A0O = new LO5(m4l, avm);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.LNB, java.lang.Object, X.MBK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LazyListState() {
        /*
            r301 = this;
            X.LNB r0 = new X.LNB
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            r1 = -1
            r0.A00 = r1
            r0 = r301
            r1 = r302
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.<init>():void");
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyListState(MBK mbk, int i, int i2) {
        this.A09 = mbk;
        this.A0A = new L7h(i, i2);
        this.A0N = new KdZ(this);
        LPE lpe = KZN.A00;
        LNp lNp = LNp.A00;
        this.A0I = LO7.A02(lNp, lpe, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A07 = new 9qP();
        this.A0M = new 9qN(M6n.A00(this, 24));
        this.A05 = true;
        this.A0L = new LPK(this);
        this.A0B = new Object();
        this.A0D = new L3G();
        this.A0C = new Kda();
        this.A0F = new Kzz(new GAc(i, 0, this));
        this.A08 = new LNA(this);
        this.A0E = new Lsv();
        04S r0 = 04S.A00;
        11T.A0I(lNp, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A0J = new ParcelableSnapshotMutableState(lNp, r0);
        this.A0H = KvA.A01(false);
        this.A0G = KvA.A01(false);
        11T.A0I(lNp, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        this.A0K = new ParcelableSnapshotMutableState(lNp, r0);
        LMV lmv = KdK.A02;
        Float A0f = 7zN.A0f();
        this.A01 = new LNu((KuM) lmv.A01.invoke(A0f), lmv, A0f, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Type inference failed for: r0v186, types: [X.KuM, X.Jad, java.lang.Object] */
    public static final void A00(LPE lpe, LazyListState lazyListState, boolean z, boolean z2) {
        Function2 function2;
        if (z) {
            lazyListState.A04 = true;
        } else if (lazyListState.A04) {
            lazyListState.A02 = lpe;
            return;
        }
        LN8 ln8 = lpe.A0B;
        boolean z3 = false;
        if ((ln8 != null && ln8.A03 != 0) || lpe.A01 != 0) {
            z3 = true;
        }
        7zU.A13(lazyListState.A0G, z3);
        7zU.A13(lazyListState.A0H, lpe.A02);
        lazyListState.A00 -= lpe.A00;
        lazyListState.A0I.Cvx(lpe);
        L7h l7h = lazyListState.A0A;
        if (z2) {
            int i = lpe.A01;
            if (i < 0.0f) {
                throw AnonymousClass001.A0N(JQz.A0p("scrollOffset should be non-negative (", i));
            }
            l7h.A04.Cq1(i);
        } else {
            l7h.A00 = ln8 != null ? ln8.A07 : null;
            if (l7h.A01 || lpe.A06 > 0) {
                l7h.A01 = true;
                int i2 = lpe.A01;
                int i3 = 0;
                if (i2 < 0.0f) {
                    throw AnonymousClass001.A0N(JQz.A0p("scrollOffset should be non-negative (", i2));
                }
                if (ln8 != null) {
                    i3 = ln8.A03;
                }
                L7h.A00(l7h, i3, i2);
            }
            if (lazyListState.A05) {
                LNB lnb = lazyListState.A09;
                int i4 = lnb.A00;
                float f = 0.0f / 0.0f;
                if (i4 != -1) {
                    List list = lpe.A0D;
                    if (1BK.A1Y(list)) {
                        if (lnb.A00 != (lnb.A02 ? ((MBH) 0QD.A0F(list)).A03 + 1 : ((MBH) 0QD.A0D(list)).A03 - 1)) {
                            lnb.A00 = -1;
                            MHq mHq = lnb.A01;
                            if (mHq != null) {
                                mHq.cancel();
                            }
                            lnb.A01 = null;
                        }
                    }
                }
            }
        }
        if (z) {
            float f2 = lpe.A03;
            MNh mNh = lpe.A0C;
            2aI r0 = lpe.A0E;
            LPE lpe2 = KZN.A00;
            if (f2 > mNh.D4T(1.0f)) {
                Snapshot A00 = L32.A00();
                Function1 A08 = A00 != null ? A00.A08() : null;
                Snapshot A02 = LCW.A02(A00);
                try {
                    float A002 = 7zM.A00(lazyListState.A01.A05.getValue());
                    LNu lNu = lazyListState.A01;
                    boolean z4 = lNu.A03;
                    if (z4) {
                        float f3 = A002 - f2;
                        float f4 = ((C2821Jad) lNu.A02).A00;
                        long j = lNu.A01;
                        long j2 = lNu.A00;
                        MBB mbb = lNu.A04;
                        Float valueOf = Float.valueOf(f3);
                        ?? obj = new Object();
                        obj.A00 = f4;
                        lazyListState.A01 = new LNu((KuM) obj, mbb, valueOf, j, j2, z4);
                        new JTs(lazyListState, (0DR) null, 17);
                    } else {
                        lazyListState.A01 = new LNu((KuM) null, KdK.A02, Float.valueOf(-f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
                        new JTs(lazyListState, (0DR) null, 18);
                    }
                    2aK.A03((Integer) null, (0DE) null, function2, r0, 3);
                } finally {
                    LCW.A05(A00, A02, A08);
                }
            }
        }
        lazyListState.A06++;
    }

    public float ANt(float f) {
        return this.A0M.ANt(f);
    }

    public boolean AbS() {
        return MN4.A01(this.A0G);
    }

    public boolean AbT() {
        return MN4.A01(this.A0H);
    }

    public boolean BVo() {
        return this.A0M.BVo();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object Cjp(X.KMS r302, X.0DR r303, kotlin.jvm.functions.Function2 r304) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.Cjp(X.KMS, X.0DR, kotlin.jvm.functions.Function2):java.lang.Object");
    }
}
