package X;

import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: M8v.class */
public final class M8v extends C00q implements C0Bd {
    public final /* synthetic */ MEE $currentItemProvider;
    public final /* synthetic */ Function2 $measurePolicy;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ Kzz $prefetchState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8v(Kzz kzz, MEE mee, MLj mLj, Function2 function2) {
        super(3);
        this.$prefetchState = kzz;
        this.$modifier = mLj;
        this.$measurePolicy = function2;
        this.$currentItemProvider = mee;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MLj D4B;
        LNS lns;
        MHu mHu = (MHu) obj;
        MLv A0N = JQz.A0N(obj2, obj3);
        MEE mee = this.$currentItemProvider;
        Object CdA = A0N.CdA();
        Object obj4 = Ky6.A00;
        if (CdA == obj4) {
            CdA = new KrU(mHu, M3K.A00(mee, 15));
            LNS.A0S(A0N, CdA);
        }
        KrU krU = (KrU) CdA;
        Object CdA2 = A0N.CdA();
        if (CdA2 == obj4) {
            CdA2 = new L0R(new LPO(krU));
            LNS.A0S(A0N, CdA2);
        }
        L0R l0r = (L0R) CdA2;
        if (this.$prefetchState != null) {
            A0N.D2A(205264983);
            A0N.D2A(6622915);
            Lre lre = KZP.A00;
            if (lre != null) {
                A0N.D2A(1213893039);
                lns = (LNS) A0N;
            } else {
                A0N.D2A(1213931944);
                lns = (LNS) A0N;
                View view = (View) LNS.A08(lns, AndroidCompositionLocals_androidKt.A02);
                boolean AEi = A0N.AEi(view);
                Object CdA3 = A0N.CdA();
                if (AEi || CdA3 == obj4) {
                    CdA3 = new Lre(view);
                    A0N.D7k(CdA3);
                }
                lre = (Lre) CdA3;
            }
            LNS.A0P(lns, false);
            LNS.A0P(lns, false);
            Kzz kzz = this.$prefetchState;
            Object[] objArr = {kzz, krU, l0r, lre};
            boolean A1Z = JR1.A1Z(A0N, krU, l0r, A0N.AEi(kzz)) | A0N.AEk(lre);
            Kzz kzz2 = this.$prefetchState;
            Object CdA4 = A0N.CdA();
            if (A1Z || CdA4 == obj4) {
                CdA4 = new ARN(4, l0r, kzz2, lre, krU);
                A0N.D7k(CdA4);
            }
            LBl.A03(A0N, (Function1) CdA4, objArr);
        } else {
            A0N.D2A(205858881);
        }
        LNS.A0P((LNS) A0N, false);
        MLj mLj = this.$modifier;
        Kzz kzz3 = this.$prefetchState;
        if (kzz3 != null && (D4B = mLj.D4B(new TraversablePrefetchStateModifierElement(kzz3))) != null) {
            mLj = D4B;
        }
        boolean A1X = JQz.A1X(A0N, this.$measurePolicy, A0N.AEi(krU));
        Function2 function2 = this.$measurePolicy;
        Object CdA5 = A0N.CdA();
        if (A1X || CdA5 == obj4) {
            CdA5 = new 83Q(krU, function2, 2);
            A0N.D7k(CdA5);
        }
        Kx2.A00(A0N, mLj, l0r, (Function2) CdA5, 8, 0);
        return 04S.A00;
    }
}
