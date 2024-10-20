package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.BitSet;

/* renamed from: X.8kh, reason: invalid class name */
/* loaded from: 8kh.class */
public final class C8kh extends C1rj {
    public View.OnClickListener A00;
    public 9Qu A01;
    public 9Qu A02;
    public MigColorScheme A03;
    public UserKey A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public C8kh() {
        super("WarningOnReportedThreadDialog");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A03, this.A01, this.A02, this.A05, this.A06, this.A07, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2q7 A2W;
        MigColorScheme migColorScheme = this.A03;
        CharSequence charSequence = this.A06;
        CharSequence charSequence2 = this.A07;
        CharSequence charSequence3 = this.A05;
        View.OnClickListener onClickListener = this.A00;
        9Qu r0 = this.A01;
        9Qu r02 = this.A02;
        UserKey userKey = this.A04;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        7zT.A11(2, charSequence, charSequence3, onClickListener, r0);
        8Tk A00 = C8mn.A00(r302);
        2cM A002 = 2cK.A00(r302);
        A002.A2b();
        A002.A2S(charSequence2);
        8Tl A003 = C5hr.A00(r302);
        A003.A0M();
        A003.A2Y(migColorScheme);
        A003.A1J(2131968009);
        A003.A2T(1LI.A0C(r302, C8kh.class, "WarningOnReportedThreadDialog", new Object[]{onClickListener}, -869564779));
        A002.A2e(A003.A2W());
        if (userKey == null) {
            A2W = null;
        } else {
            2zT A004 = C2q7.A00(r302);
            A004.A01.A06 = C2q2.A0I;
            A004.A2Y(migColorScheme);
            A004.A2Z(userKey);
            A2W = A004.A2W();
        }
        A002.A2e(A2W);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A30(false);
        A01.A2x(migColorScheme);
        2RH r03 = 2RH.A04;
        4YU.A1N(A01, r03);
        2RH r04 = 2RH.A05;
        4YU.A1M(A01, r04);
        A01.A2z(charSequence);
        A01.A2b();
        A01.A2g();
        4YU.A1K(A002, A01);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A30(false);
        A012.A2X();
        A012.A2x(migColorScheme);
        4YU.A1M(A012, 2RH.A06);
        A012.A1T(2131165287);
        A012.A2z(charSequence3);
        A012.A2d();
        A012.A2l();
        4YU.A1K(A002, A012);
        8Sn r05 = new 8Sn(r302, new 8mK());
        8mK r308 = r05.A01;
        r308.A09 = migColorScheme;
        BitSet bitSet = r05.A02;
        bitSet.set(0);
        r308.A0A = r0.A02;
        bitSet.set(4);
        r05.A2S(r0.A01);
        r308.A06 = 2cQ.A08;
        bitSet.set(A1X ? 1 : 0);
        r308.A08 = 2cR.A04;
        bitSet.set(3);
        r308.A07 = C1td.A0A;
        bitSet.set(2);
        r308.A02 = r0.A00;
        if (r02 != null) {
            C2yw A005 = 2dA.A00(r302);
            r05.A0R();
            r05.A0h(0.0f);
            C1rs.A04(bitSet, r05.A03);
            r05.A0J();
            A005.A2X(r308);
            8Au A006 = 8Av.A00(r302);
            A006.A2Z(migColorScheme);
            A006.A0R();
            A006.A0h(0.0f);
            A006.A2a(r02.A02);
            A006.A2S(r02.A01);
            A006.A2Y(r02.A00);
            A005.A2X(A006.A2W());
            A005.A2W(4YU.A00(r04));
            A005.A0e();
            A005.A0J();
            r308 = A005.A01;
        } else {
            r05.A0e();
            C1rs.A04(bitSet, r05.A03);
            r05.A0J();
        }
        11T.A0D(r308);
        A002.A2e(r308);
        A002.A1D(7zL.A03());
        A00.A2d(A002);
        A00.A01.A03 = migColorScheme.Abp();
        A00.A2X(18.0f);
        A00.A2Y(0.0f);
        A00.A1D(4YU.A00(r03));
        A00.A2f(A1X);
        A00.A0e();
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -869564779) {
            return null;
        }
        View.OnClickListener onClickListener = (View.OnClickListener) 7zN.A0o(r302);
        View view = ((3xC) obj).A00;
        11T.A0F(onClickListener, 1);
        onClickListener.onClick(view);
        return null;
    }
}
