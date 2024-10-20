package X;

import androidx.compose.ui.graphics.GraphicsLayerElement;
import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: Kvt.class */
public abstract class Kvt {
    public static final void A00(MLv mLv, MLj mLj, Jtl jtl, int i, int i2) {
        MLj mLj2 = mLj;
        mLv.D2B(-668256771);
        int A0F = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR1.A0F(mLv, jtl) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0F |= 48;
        } else if ((i & 48) == 0) {
            A0F |= JR1.A0G(mLv, mLj2);
        }
        if ((A0F & 19) == 18 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            LNS lns = (LNS) mLv;
            Object A08 = LNS.A08(lns, L7J.A04);
            MLj A00 = L5c.A00(KTw.A00(mLj2, jtl.A01, true), 12.0f);
            if (A08 == KMW.A02 && jtl.A00.type.flipForRightToLeftLayout) {
                long j = L3m.A01;
                MEK mek = KZd.A00;
                long j2 = KZc.A00;
                A00 = A00.D4B(new GraphicsLayerElement(mek, -1.0f, 1.0f, j, j2, j2, false));
            }
            3Dz r0 = jtl.A00;
            C1u3 c1u3 = r0.type.iconName;
            mLv.D2A(972650392);
            long j3 = LNS.A06(lns, KaV.A00).A0M;
            LNS.A0P(lns, false);
            KWZ.A00(mLv, A00, (MLf) null, c1u3, (C1u4) null, KYs.A00(mLv, r0.type.contentDescriptionResId), 0, 24, j3);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M75(jtl, i2, mLj2, i, 6);
        }
    }

    public static final void A01(MLv mLv, MLj mLj, MCK mck, int i, int i2) {
        MLj mLj2 = mLj;
        11T.A0F(mck, 0);
        mLv.D2B(12896980);
        int A0B = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? JR0.A0B(JR1.A1X(mLv, mck, i & 8) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            A0B |= 48;
        } else if ((i & 48) == 0) {
            A0B |= JR1.A0G(mLv, mLj);
        }
        if ((A0B & 19) == 18 && mLv.BBC()) {
            mLv.D0o();
        } else {
            if (i3 != 0) {
                mLj2 = MLj.A00;
            }
            if (mck instanceof Jtl) {
                mLv.D2A(1408205979);
                A00(mLv, mLj2, (Jtl) mck, A0B & ActionId.MISSED_EVENT, 0);
            } else if (mck instanceof MQX) {
                mLv.D2A(1408208307);
                MKQ A00 = LCh.A00(Kz0.A0C, false);
                LNS lns = (LNS) mLv;
                int i4 = lns.A02;
                MRT A04 = LNS.A04(lns);
                MLj A01 = KvE.A01(mLv, mLj2);
                LNS.A0J(mLv, lns, Kyy.A00);
                L5d.A01(mLv, A00, A04);
                Function2 function2 = Kyy.A01;
                if (lns.A0K || !JR1.A1W(mLv, i4)) {
                    JR0.A18(mLv, function2, i4);
                }
                L5d.A00(mLv, A01);
                ((MQX) mck).A3M(mLv, 0);
                LNS.A0P(lns, true);
            } else {
                mLv.D2A(704824084);
            }
            LNS.A0P((LNS) mLv, false);
        }
        LNg AQD = mLv.AQD();
        if (AQD != null) {
            AQD.A06 = new M75(mck, i2, mLj2, i, 5);
        }
    }
}
