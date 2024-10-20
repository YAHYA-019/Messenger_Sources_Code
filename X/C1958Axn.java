package X;

import com.facebook.messaging.communitymessaging.channeljoining.bottomsheet.model.ChannelJoiningBottomSheetSubtitleModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.Axn, reason: case insensitive filesystem */
/* loaded from: Axn.class */
public final class C1958Axn extends 1LH {
    public final AnonymousClass553 A00;
    public final MigColorScheme A01;
    public final C2fr A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public C1958Axn(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, C2fr c2fr, ImmutableList immutableList, Integer num, Integer num2, String str, String str2) {
        1BL.A1H(migColorScheme, str, immutableList);
        1BK.A1L(anonymousClass553, 6, num2);
        this.A01 = migColorScheme;
        this.A06 = str;
        this.A03 = immutableList;
        this.A07 = str2;
        this.A05 = num;
        this.A00 = anonymousClass553;
        this.A02 = c2fr;
        this.A04 = num2;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        2cL r306;
        int i2;
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        C2sn A0U = 7zQ.A0U(r0);
        2lQ r02 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
        C2sn A0K = 7zS.A0K(A0U);
        C2sn A0K2 = 7zS.A0K(A0K);
        2RH r03 = 2RH.A03;
        2lO A0K3 = 4YV.A0K((2lO) null, 0S2.A1J, 4YV.A06(r03));
        C2sn A0J = 7zS.A0J(A0K2);
        C2pz A00 = C2px.A00(A0J.A00);
        A00.A2X(C2q0.A00);
        A00.A2Z(this.A02);
        A00.A0F("android.widget.ImageView");
        MigColorScheme migColorScheme = this.A01;
        A00.A2Y(migColorScheme);
        A0J.A00(A00.A2W());
        A0K2.A00(C2so.A03(A0J, A0K2, A0K3));
        A0K.A00(C2so.A0N(A0K2, A0K, null));
        Integer num2 = this.A04;
        Integer num3 = 0S2.A0C;
        if (num2 == num3 || num2 == 0S2.A0N) {
            i = 2131954017;
        } else if (num2 == num) {
            i = 2131954016;
        } else {
            i = 2131954018;
            if (this.A05 == 0S2.A15) {
                i = 2131954015;
            }
        }
        String A0A = 3yH.A0A(A0K, this.A06, i);
        1Iw AeS = A0K.AeS();
        2KD A13 = 7zM.A13(AeS, A0A, 0);
        A13.A2g();
        A13.A2b();
        A13.A2x(migColorScheme);
        A13.A2X();
        7zO.A1E(A13, 2RH.A07);
        7zN.A1Q(A0K, A13);
        ImmutableList immutableList = this.A03;
        if (immutableList.isEmpty()) {
            r306 = null;
        } else {
            C2sn A0U2 = 7zQ.A0U(AeS);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                ChannelJoiningBottomSheetSubtitleModel channelJoiningBottomSheetSubtitleModel = (ChannelJoiningBottomSheetSubtitleModel) it.next();
                2KD A01 = 2K3.A01(A0U2.A00, 0);
                A01.A1A(channelJoiningBottomSheetSubtitleModel.A00());
                A01.A2z(channelJoiningBottomSheetSubtitleModel.A00);
                A01.A2y(channelJoiningBottomSheetSubtitleModel.A01());
                A01.A2d();
                A01.A2x(migColorScheme);
                A01.A2X();
                A01.A2q(5);
                7zN.A1Q(A0U2, A01);
            }
            r306 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U2.A01, false);
        }
        A0K.A00(r306);
        boolean z = false;
        2lO A0K4 = 4YV.A0K((2lO) null, 0S2.A15, Double.doubleToRawLongBits(((Number) 2rO.A00(c2k5, new DCw(this, 25), new Object[0])).floatValue()));
        C2sn A0U3 = 7zQ.A0U(r0);
        String str = this.A07;
        if (str != null && str.length() != 0) {
            C2sn A0U4 = 7zQ.A0U(r0);
            8A3 A002 = 8A4.A00(A0U4.A00);
            A002.A2X(migColorScheme);
            7zO.A1F(A002, 2RH.A05);
            A0U4.A00(A002.A2W());
            A0U3.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U4.A01, false));
            2KD A132 = 7zM.A13(A0U3.AeS(), str, 0);
            A132.A2k();
            A132.A2d();
            A132.A2x(migColorScheme);
            A132.A2X();
            4YU.A1L(A132, r03);
            7zO.A1F(A132, 2RH.A06);
            7zN.A1Q(A0U3, A132);
        }
        8Ti A012 = 8oM.A01(A0U3.A00);
        int intValue = num2.intValue();
        if (intValue == 0) {
            i2 = 2131954014;
        } else if (intValue == 1) {
            i2 = 2131953973;
        } else if (intValue == 2) {
            i2 = 2131954042;
        } else {
            if (intValue != 3) {
                throw 1BK.A1F();
            }
            i2 = 2131953974;
        }
        A012.A2a(3yH.A09(A0U3, i2));
        A012.A2Z(migColorScheme);
        A012.A2Y(this.A00);
        if (num2 != num3) {
            z = true;
        }
        A012.A2b(z);
        A0K.A00(7zM.A0l(A012.A2W(), A0U3, c2k5, A0K4));
        2RH r04 = 2RH.A06;
        r04.A00();
        r04.A00();
        A0U.A00(C2so.A02(A0K, A0U, A0X));
        return new C1rh(null, null, null, null, A0U.A01, false);
    }
}
