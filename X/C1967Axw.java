package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.channelimageediting.model.EmojiGradientModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Axw, reason: case insensitive filesystem */
/* loaded from: Axw.class */
public final class C1967Axw extends 1LH {
    public final int A00;
    public final int A01;
    public final FbUserSession A02;
    public final DIl A03;
    public final RIf A04;
    public final 9Z7 A05;
    public final MigColorScheme A06;
    public final C5xv A07;
    public final ImmutableList A08;
    public final boolean A09;
    public final BLB A0A;
    public final DEp A0B;
    public final AXh A0C;
    public final C2fr A0D;
    public final ImmutableList A0E;
    public final String A0F;
    public final boolean A0G;

    public C1967Axw(FbUserSession fbUserSession, DIl dIl, BLB blb, DEp dEp, AXh aXh, RIf rIf, 9Z7 r308, MigColorScheme migColorScheme, C5xv c5xv, C2fr c2fr, ImmutableList immutableList, ImmutableList immutableList2, String str, int i, int i2, boolean z, boolean z2) {
        1BL.A1F(fbUserSession, migColorScheme);
        1BK.A1L(dIl, 5, blb);
        11T.A0F(immutableList, 10);
        11T.A0F(immutableList2, 13);
        11T.A0F(r308, 14);
        this.A02 = fbUserSession;
        this.A06 = migColorScheme;
        this.A01 = i;
        this.A07 = c5xv;
        this.A03 = dIl;
        this.A0G = z;
        this.A00 = i2;
        this.A0A = blb;
        this.A0F = str;
        this.A0E = immutableList;
        this.A0C = aXh;
        this.A04 = rIf;
        this.A08 = immutableList2;
        this.A05 = r308;
        this.A09 = z2;
        this.A0B = dEp;
        this.A0D = c2fr;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI c1rh;
        int i;
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        C2sn A0U = 7zQ.A0U(r0);
        FbUserSession fbUserSession = this.A02;
        MigColorScheme migColorScheme = this.A06;
        boolean A1Q = AnonymousClass001.A1Q(4YU.A0B(A0U.A00.A0D).orientation, 2);
        BLB blb = this.A0A;
        String str = this.A0F;
        ImmutableList immutableList = this.A0E;
        AXh aXh = this.A0C;
        Bcm bcm = new Bcm(this);
        C2fr c2fr = this.A0D;
        RIf rIf = this.A04;
        A0U.A00(new C1979Ay8(fbUserSession, bcm, blb, this.A0B, aXh, rIf.A00, migColorScheme, c2fr, immutableList, str, A1Q));
        if (this.A0G) {
            1Iw AeS = A0U.AeS();
            8TK A00 = 3wK.A00(AeS);
            A00.A0S();
            3wL r02 = new 3wL();
            r02.A02(3yH.A09(A0U, 2131953990), false);
            r02.A02(3yH.A09(A0U, 2131953988), false);
            A00.A2Z(r02.A00());
            int i2 = this.A00;
            3wK r03 = A00.A01;
            r03.A00 = i2;
            A00.A2X(migColorScheme);
            r03.A03 = AnonymousClass955.EVEN_WIDTH;
            A00.A2Y(new CxB(this, 0));
            A0U.A00(A00.A2W());
            if (i2 != 0) {
                if (i2 == 1) {
                    EnumC00743oh enumC00743oh = EnumC00743oh.WRAP;
                    C2sn A0U2 = 7zQ.A0U(AeS);
                    1Du it = this.A08.iterator();
                    while (it.hasNext()) {
                        ImmutableList immutableList2 = (ImmutableList) it.next();
                        11T.A0D(immutableList2);
                        2lQ r04 = 2lO.A02;
                        2lO A0L = 4YV.A0L(4YV.A0K((2lO) null, 0S2.A06, Double.doubleToRawLongBits(15.0d)), 0S2.A1G, new AR7(immutableList2, this, 0), 1);
                        Number number = (Number) immutableList2.get(0);
                        int BDl = migColorScheme.BDl();
                        if (number != null && number.intValue() == BDl) {
                            Number number2 = (Number) immutableList2.get(1);
                            int BDl2 = migColorScheme.BDl();
                            if (number2 != null && number2.intValue() == BDl2) {
                                i = migColorScheme.Atp();
                                A0U2.A00(new C8bj(A0L, migColorScheme, immutableList2, null, 65.0f, i));
                            }
                        }
                        i = 0;
                        A0U2.A00(new C8bj(A0L, migColorScheme, immutableList2, null, 65.0f, i));
                    }
                    c1rh = new C1rh(null, null, null, enumC00743oh, A0U2 != null ? A0U2.A01 : null, false);
                }
                2cL r05 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
                2lQ r06 = 2lO.A02;
                2lO A0a = 7zS.A0a((2lO) null, 0S2.A00, migColorScheme.BDl());
                C2sn A0U3 = 7zQ.A0U(r0);
                C5yw A0b = 7zN.A0b(A0U3.AeS(), false);
                A0b.A2b(migColorScheme);
                A0b.A2a(this.A01);
                A0b.A2Y();
                C9lC A002 = C9lC.A00();
                A002.A04(3yH.A09(A0U3, 2131953994));
                A002.A05 = this.A09;
                A002.A01 = migColorScheme;
                A0b.A2e(Cx1.A00(A002, this, 7));
                A0b.A2d(this.A07);
                A0b.A2i(false);
                7zN.A1R(A0U3, A0b);
                Dud A01 = Dzc.A01(A0U3.A00);
                A01.A2e(true);
                return 7zM.A0l(7zM.A0w(r05, A01), A0U3, c2k5, A0a);
            }
            AwW A003 = B0y.A00(AeS);
            A003.A2X(fbUserSession);
            A003.A2Z(migColorScheme);
            A003.A0Q();
            A003.A0K();
            A003.A00.A0v().A06(20.0f);
            A003.A01.A0B = 4YV.A1W(4YU.A0B(AeS.A0D).orientation, 2);
            A003.A2a(this.A05.A00(1BK.A0b(), 1BK.A0b(), (HashSet) null, false));
            A003.A2Y(new C9ue(this, 0));
            c1rh = A003.A2W();
        } else {
            EnumC00743oh enumC00743oh2 = EnumC00743oh.WRAP;
            C1rp c1rp = C1rp.CENTER;
            C2sn A0J = 7zS.A0J(A0U);
            int A03 = 4YV.A0I().A03(C1u3.A2h);
            1Iw AeS2 = A0J.AeS();
            C2cq A004 = C2cp.A00(AeS2, 0);
            A004.A2Z(A03);
            A004.A0v(2.0f);
            A004.A0c();
            A004.A0L();
            C2cp A2W = A004.A2W();
            ImmutableList of = ImmutableList.of((Object) (-1118482), (Object) (-1118482));
            11T.A0A(of);
            2lQ r07 = 2lO.A02;
            long doubleToRawLongBits = Double.doubleToRawLongBits(15.0d);
            Integer num = 0S2.A06;
            C8bj c8bj = new C8bj(4YV.A0K((2lO) null, num, doubleToRawLongBits), migColorScheme, of, null, 65.0f, 0);
            2lO A0g = 7zL.A0g(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), new C5z8(0S2.A0N, 3yH.A09(A0J, 2131953989)));
            DD3 dd3 = new DD3(this, 4);
            Integer num2 = 0S2.A1G;
            2lO A0L2 = 4YV.A0L(A0g, num2, dd3, 1);
            C2sn A0H = 7zS.A0H(c8bj, AeS2);
            A0H.A00(A2W);
            A0J.A00(C2so.A0U(A0H, A0J, A0L2, null, null, c1rp, enumC00743oh2, false));
            ImmutableList immutableList3 = rIf.A01;
            ArrayList<EmojiGradientModel> A0s = AnonymousClass001.A0s();
            Iterator it2 = immutableList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof EmojiGradientModel) {
                    A0s.add(next);
                }
            }
            for (EmojiGradientModel emojiGradientModel : A0s) {
                A0J.A00(new C8bj(4YV.A0L(4YV.A0K((2lO) null, num, doubleToRawLongBits), num2, new AR7(emojiGradientModel, this, 1), 1), migColorScheme, emojiGradientModel.integerGradientColors, emojiGradientModel.emoji, 65.0f, 0));
            }
            c1rh = new C1rh(null, null, c1rp, enumC00743oh2, A0J.A01, false);
        }
        A0U.A00(c1rh);
        2cL r052 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
        2lQ r062 = 2lO.A02;
        2lO A0a2 = 7zS.A0a((2lO) null, 0S2.A00, migColorScheme.BDl());
        C2sn A0U32 = 7zQ.A0U(r0);
        C5yw A0b2 = 7zN.A0b(A0U32.AeS(), false);
        A0b2.A2b(migColorScheme);
        A0b2.A2a(this.A01);
        A0b2.A2Y();
        C9lC A0022 = C9lC.A00();
        A0022.A04(3yH.A09(A0U32, 2131953994));
        A0022.A05 = this.A09;
        A0022.A01 = migColorScheme;
        A0b2.A2e(Cx1.A00(A0022, this, 7));
        A0b2.A2d(this.A07);
        A0b2.A2i(false);
        7zN.A1R(A0U32, A0b2);
        Dud A012 = Dzc.A01(A0U32.A00);
        A012.A2e(true);
        return 7zM.A0l(7zM.A0w(r052, A012), A0U32, c2k5, A0a2);
    }
}
