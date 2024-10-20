package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;

/* loaded from: L62.class */
public abstract class L62 {
    public static final void A00(MLv mLv, FbUserSession fbUserSession, Kme kme, Function2 function2, int i, int i2) {
        FbUserSession fbUserSession2 = fbUserSession;
        mLv.D2B(-1024843435);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, kme) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0C(mLv, fbUserSession2);
        }
        if ((i2 & 4) != 0) {
            A0F |= 384;
        } else if ((i & 384) == 0) {
            A0F |= JR1.A0D(mLv, function2);
        }
        if ((A0F & ActionId.FILE_SYSTEM_FAIL) == 146 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                fbUserSession2 = null;
            }
            LNS lns = (LNS) mLv;
            Context context = (Context) LNS.A08(lns, AndroidCompositionLocals_androidKt.A01);
            MNh mNh = (MNh) LNS.A08(lns, L7J.A00);
            boolean A1Y = JR1.A1Y(mLv, LNS.A08(lns, AndroidCompositionLocals_androidKt.A00), context.getTheme(), 1518683918);
            Object CdA = mLv.CdA();
            if (A1Y || CdA == Ky6.A00) {
                CdA = new S65(context);
                LNS.A0N(lns, CdA);
            }
            LNS.A0P(lns, false);
            mLv.D2A(1518686927);
            boolean AEi = mLv.AEi(mNh);
            Object CdA2 = mLv.CdA();
            if (AEi || CdA2 == Ky6.A00) {
                11T.A0F(mNh, 0);
                CdA2 = new KmQ(KWh.A00(mNh, 0S2.A0j), KWh.A00(mNh, 0S2.A0u), KWh.A00(mNh, 0S2.A15), KWh.A00(mNh, 0S2.A03), KWh.A00(mNh, 0S2.A04), KWh.A00(mNh, 0S2.A06), KWh.A00(mNh, 0S2.A1G), KWh.A00(mNh, 0S2.A00), KWh.A00(mNh, 0S2.A01), KWh.A00(mNh, 0S2.A0C), KWh.A00(mNh, 0S2.A0N), KWh.A00(mNh, 0S2.A1J), KWh.A00(mNh, 0S2.A02));
                LNS.A0N(lns, CdA2);
            }
            LNS.A0P(lns, false);
            mLv.D2A(1518689177);
            Object CdA3 = mLv.CdA();
            Object obj = Ky6.A00;
            if (CdA3 == obj) {
                CdA3 = 1Bi.A03(16839);
                mLv.D7k(CdA3);
            }
            LNS.A0P(lns, false);
            LMN lmn = KbN.A00;
            mLv.D2A(-1124619529);
            boolean z = true;
            MN4 A00 = KvA.A00(mLv, new LDp(LDp.A05));
            mLv.D2A(-1668712011);
            boolean A1X = JQy.A1X(mLv.AEj(true) ? 1 : 0);
            if (!mLv.AEf(0.0f / 0.0f)) {
                z = false;
            }
            boolean z2 = A1X | z;
            Object CdA4 = mLv.CdA();
            if (z2 || CdA4 == obj) {
                CdA4 = new LMd(A00);
                LNS.A0N(lns, CdA4);
            }
            LNS.A0P(lns, false);
            LNS.A0P(lns, false);
            KlG[] klGArr = (KlG[]) C0s8.A15(KaV.A00.A02(kme), KaX.A00.A02(CdA2), KaW.A00.A02(KaY.A00), KbO.A00.A02(CdA), KaU.A00.A02(CdA3), Kwq.A00.A02(CdA4), fbUserSession2 != null ? KaQ.A00.A02(fbUserSession2) : null).toArray(new KlG[0]);
            Kv6.A01(mLv, 9Al.A00(mLv, new AVM(function2, 30), 464700949), (KlG[]) Arrays.copyOf(klGArr, klGArr.length), 56);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M78(kme, fbUserSession2, function2, i2, i, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (((X.C1os) r0.get()).A00() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.MLv r301, com.facebook.auth.usersession.FbUserSession r302, kotlin.jvm.functions.Function2 r303, int r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L62.A01(X.MLv, com.facebook.auth.usersession.FbUserSession, kotlin.jvm.functions.Function2, int, int, boolean):void");
    }

    public static final void A02(MLv mLv, Function2 function2, int i, boolean z) {
        11T.A0F(function2, 1);
        mLv.D2B(623214509);
        int A0B = (i & 6) == 0 ? JR0.A0B(mLv.AEj(z) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            A0B |= JR1.A0C(mLv, function2);
        }
        if ((A0B & 19) == 18 && mLv.BBC()) {
            mLv.D0o();
        } else {
            A00(mLv, null, (Kme) (z ? LC2.A00 : LC2.A03).getValue(), function2, (A0B << 3) & 896, 2);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M70(function2, i, z);
        }
    }
}
