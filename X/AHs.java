package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: AHs.class */
public final class AHs implements Function2, C0Bd, 0Be, C0Bf, C0Bh, C0Bg, C0Bo, C0Bi, 0Bk, C0Bl, 0Bn, C0Bp, 0Bq, C0Br, 0Bs, C0Bt, 0Bu, 0Bv, C0Bj {
    public AWZ A00;
    public Object A01;
    public List A02;
    public final int A03;
    public final boolean A04;

    public AHs(int i, boolean z, Object obj) {
        this.A03 = i;
        this.A04 = z;
        this.A01 = obj;
    }

    public static int A00(MLv mLv, AHs aHs) {
        mLv.D2B(aHs.A03);
        aHs.A01(mLv);
        int i = 1;
        if (mLv.AEi(aHs)) {
            i = 2;
        }
        return i;
    }

    private final void A01(MLv mLv) {
        LNg A0V;
        if (!this.A04 || (A0V = ((LNS) mLv).A0V()) == null) {
            return;
        }
        A0V.A01 |= 1;
        if (A02(this.A00, A0V)) {
            this.A00 = A0V;
            return;
        }
        List list = this.A02;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A02 = list;
        } else {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (A02((AWZ) list.get(i), A0V)) {
                    list.set(i, A0V);
                    return;
                }
            }
        }
        list.add(A0V);
    }

    public static final boolean A02(AWZ awz, AWZ awz2) {
        KTK ktk;
        if (awz == null) {
            return true;
        }
        if (!(awz instanceof LNg) || !(awz2 instanceof LNg)) {
            return false;
        }
        LNg lNg = (LNg) awz;
        return lNg.A05 == null || (ktk = lNg.A04) == null || !ktk.A00() || awz.equals(awz2) || 11T.A0O(lNg.A04, ((LNg) awz2).A04);
    }

    public Object A03(MLv mLv, Object obj, int i) {
        int A00 = (A00(mLv, this) << 4) | i;
        Object obj2 = this.A01;
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj2, 3);
        Object invoke = ((C0Bd) obj2).invoke(obj, mLv, Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVV(i, 6, this, obj);
        }
        return invoke;
    }

    public Object A04(MLv mLv, Object obj, Object obj2, int i) {
        int A00 = (A00(mLv, this) << 7) | i;
        Object obj3 = this.A01;
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj3, 4);
        Object invoke = ((0Be) obj3).invoke(obj, obj2, mLv, Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVY(i, 2, this, obj2, obj);
        }
        return invoke;
    }

    public Object A05(MLv mLv, Object obj, Object obj2, Object obj3, int i) {
        int A00 = (A00(mLv, this) << 10) | i;
        Object obj4 = this.A01;
        11T.A0I(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj4, 5);
        Object invoke = ((C0Bf) obj4).invoke(obj, obj2, obj3, mLv, Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVa(i, 0, this, obj, obj2, obj3);
        }
        return invoke;
    }

    public Object A06(MLv mLv, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int A00 = (A00(mLv, this) << 13) | i;
        Object obj5 = this.A01;
        11T.A0I(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj5, 6);
        Object invoke = ((C0Bg) obj5).invoke(obj, obj2, obj3, obj4, mLv, Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVg(this, obj, obj2, obj3, obj4, i, 0);
        }
        return invoke;
    }

    public Object A07(MLv mLv, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        int A00 = i | (A00(mLv, this) << 16);
        Object obj6 = this.A01;
        11T.A0I(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj6, 7);
        Object invoke = ((C0Bh) obj6).invoke(obj, obj2, obj3, obj4, obj5, mLv, Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVc(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return invoke;
    }

    public Object A08(MLv mLv, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i, int i2) {
        int A00 = i2 | (A00(mLv, this) << 4);
        Object obj12 = this.A01;
        11T.A0I(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj12, 14);
        Object BQ1 = ((C0Bo) obj12).BQ1(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, mLv, Integer.valueOf(i), Integer.valueOf(A00));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new AVk(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, i, i2);
        }
        return BQ1;
    }

    @Override // X.C0Bo
    public /* bridge */ /* synthetic */ Object BQ1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return A08((MLv) obj12, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, AnonymousClass001.A03(obj13), AnonymousClass001.A03(obj14));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv mLv = (MLv) obj;
        int A03 = AnonymousClass001.A03(obj2);
        mLv.D2B(this.A03);
        A01(mLv);
        int i = 1 << 1;
        if (mLv.AEi(this)) {
            i = 2 << 1;
        }
        int i2 = A03 | i;
        Object obj3 = this.A01;
        11T.A0I(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        C0B7.A04(obj3, 2);
        Object invoke = ((Function2) obj3).invoke(mLv, Integer.valueOf(i2));
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            C0B7.A04(this, 2);
            AQD.A06 = this;
        }
        return invoke;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A03((MLv) obj2, obj, AnonymousClass001.A03(obj3));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return A04((MLv) obj3, obj, obj2, AnonymousClass001.A03(obj4));
    }

    @Override // X.C0Bf
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A05((MLv) obj4, obj, obj2, obj3, AnonymousClass001.A03(obj5));
    }

    @Override // X.C0Bg
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return A06((MLv) obj5, obj, obj2, obj3, obj4, AnonymousClass001.A03(obj6));
    }

    @Override // X.C0Bh
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return A07((MLv) obj6, obj, obj2, obj3, obj4, obj5, AnonymousClass001.A03(obj7));
    }

    @Override // X.C0Bi
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        throw 0Q8.createAndThrow();
    }
}
