package X;

import android.view.View;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.acra.constants.ActionId;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Kx8.class */
public abstract class Kx8 {
    public static final AbstractC2837Jau A00 = C2836Jat.A00(M24.A00);

    public static final void A00(MLv mLv, MBn mBn, Kr9 kr9, C00m c00m, Function2 function2, int i, int i2) {
        boolean z;
        int i3;
        Object obj;
        Kr9 kr92 = kr9;
        mLv.D2B(-830247068);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, mBn) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0C(mLv, c00m);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0H(mLv, kr92);
        }
        if ((i2 & 8) != 0) {
            A0F |= 3072;
        } else if ((i & 3072) == 0) {
            A0F |= JR1.A0E(mLv, function2);
        }
        if ((A0F & 1171) == 1170 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i4 != 0) {
                c00m = null;
            }
            if (i5 != 0) {
                kr92 = new Kr9(false);
            }
            LNS lns = (LNS) mLv;
            View view = (View) LNS.A08(lns, AndroidCompositionLocals_androidKt.A02);
            MNh mNh = (MNh) LNS.A08(lns, L7J.A00);
            String str = (String) LNS.A08(lns, A00);
            KMW kmw = (KMW) LNS.A08(lns, L7J.A04);
            C2833Jap ACm = mLv.ACm();
            MN4 A002 = KvA.A00(mLv, function2);
            UUID uuid = (UUID) KUM.A00(mLv, (MHv) null, M25.A00, new Object[0], 3072, 6);
            Object CdA = mLv.CdA();
            Object obj2 = Ky6.A00;
            if (CdA == obj2) {
                i3 = 32;
                C2945JeA c2945JeA = new C2945JeA(view, mNh, mBn, kr92, uuid, c00m);
                z = true;
                AHs aHs = new AHs(1302892335, true, new 83Q(A002, c2945JeA, 7));
                c2945JeA.A05(ACm);
                c2945JeA.A0B.Cvx(aHs);
                c2945JeA.A05 = true;
                LNS.A0N(lns, c2945JeA);
                obj = c2945JeA;
            } else {
                z = true;
                i3 = 32;
                obj = CdA;
            }
            C2945JeA c2945JeA2 = (C2945JeA) obj;
            boolean AEk = mLv.AEk(c2945JeA2);
            int i6 = A0F & ActionId.MISSED_EVENT;
            boolean A1Q = AEk | AnonymousClass001.A1Q(i6, i3);
            int i7 = A0F & 896;
            boolean A1X = JQz.A1X(mLv, kmw, JQz.A1X(mLv, str, A1Q | AnonymousClass001.A1Q(i7, 256)));
            Object CdA2 = mLv.CdA();
            if (A1X || CdA2 == obj2) {
                CdA2 = new ARY(c2945JeA2, c00m, kr92, kmw, str, 0);
                mLv.D7k(CdA2);
            }
            LBl.A01(mLv, c2945JeA2, (Function1) CdA2);
            boolean A1X2 = JQz.A1X(mLv, kmw, JQz.A1X(mLv, str, AnonymousClass001.A1Q(i6, i3) | mLv.AEk(c2945JeA2) | AnonymousClass001.A1Q(i7, 256)));
            Object CdA3 = mLv.CdA();
            if (A1X2 || CdA3 == obj2) {
                CdA3 = new AKt(c2945JeA2, c00m, kr92, kmw, str, 0);
                mLv.D7k(CdA3);
            }
            mLv.Cbb((C00m) CdA3);
            boolean AEk2 = mLv.AEk(c2945JeA2);
            if ((A0F & 14) != 4) {
                z = false;
            }
            boolean z2 = z | AEk2;
            Object CdA4 = mLv.CdA();
            if (z2 || CdA4 == obj2) {
                CdA4 = M6y.A01(mLv, mBn, c2945JeA2, 31);
            }
            LBl.A01(mLv, mBn, (Function1) CdA4);
            boolean AEk3 = mLv.AEk(c2945JeA2);
            Object CdA5 = mLv.CdA();
            if (AEk3 || CdA5 == obj2) {
                CdA5 = new AJV(c2945JeA2, (0DR) null, 11, 42);
                mLv.D7k(CdA5);
            }
            LBl.A02(mLv, c2945JeA2, (Function2) CdA5);
            boolean AEk4 = mLv.AEk(c2945JeA2);
            Object CdA6 = mLv.CdA();
            if (AEk4 || CdA6 == obj2) {
                CdA6 = M6m.A00(c2945JeA2, 38);
                mLv.D7k(CdA6);
            }
            LOB onGloballyPositionedElement = new OnGloballyPositionedElement((Function1) CdA6);
            boolean A1X3 = JQz.A1X(mLv, kmw, mLv.AEk(c2945JeA2));
            Object CdA7 = mLv.CdA();
            if (A1X3 || CdA7 == obj2) {
                CdA7 = new LOz(kmw, c2945JeA2);
                LNS.A0N(lns, CdA7);
            }
            int i8 = lns.A02;
            MRT A04 = LNS.A04(lns);
            MLj A01 = KvE.A01(mLv, onGloballyPositionedElement);
            LNS.A0J(mLv, lns, Kyy.A00);
            L5d.A01(mLv, CdA7, A04);
            Function2 function22 = Kyy.A01;
            if (lns.A0K || !JR1.A1W(mLv, i8)) {
                JR0.A18(mLv, function22, i8);
            }
            L5d.A00(mLv, A01);
            LNS.A0P(lns, true);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M7C(i, i2, 1, mBn, c00m, kr92, function2);
        }
    }
}
