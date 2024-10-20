package X;

import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.user.model.UserKey;
import java.util.List;

/* renamed from: X.8mi, reason: invalid class name */
/* loaded from: 8mi.class */
public final class C8mi extends C1rj {
    public static final MigColorScheme A08 = LightColorScheme.A00();
    public 9xL A00;
    public MigColorScheme A01;
    public UserKey A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public C8mi() {
        super("RemoveUserInterstitial");
        this.A01 = A08;
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, this.A05, this.A01, this.A00, this.A06, this.A07, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        UserKey userKey = this.A02;
        CharSequence charSequence = this.A06;
        CharSequence charSequence2 = this.A07;
        CharSequence charSequence3 = this.A04;
        CharSequence charSequence4 = this.A05;
        MigColorScheme migColorScheme = this.A01;
        11T.A0F(r302, 0);
        7zT.A1W(userKey, charSequence, charSequence2, charSequence3);
        1BK.A1L(charSequence4, 6, migColorScheme);
        List A03 = 11T.A03(userKey);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2h(C1ro.STRETCH);
        A01.A1H(migColorScheme.Abp());
        2cM A0i = 7zM.A0i(r302);
        2RH r0 = 2RH.A06;
        7zO.A1G(A0i, r0);
        2rS A00 = 2rR.A00(r302);
        A00.A2b(migColorScheme);
        7zO.A1S(A00, (List) null, A03);
        A00.A2a(1);
        A00.A2Z(56.0f);
        A00.A2X(3.0f);
        2RH r02 = 2RH.A03;
        7zO.A1G(A00, r02);
        2RH r03 = 2RH.A04;
        7zO.A1F(A00, r03);
        A00.A0L();
        A00.A2K("remove_user_interstitial_facepile");
        A0i.A2e(A00.A2W());
        2KD A0f = 7zR.A0f(r302, charSequence, false);
        A0f.A2f();
        A0f.A2b();
        A0f.A2X();
        4YU.A1L(A0f, r0);
        7zO.A1F(A0f, r03);
        A0f.A2x(migColorScheme);
        A0f.A2K("remove_user_interstitial_primary_text");
        4YU.A1K(A0i, A0f);
        2KD A0Y = 7zN.A0Y(r302, false);
        7zQ.A1T(A0Y, charSequence2);
        A0Y.A2X();
        4YU.A1L(A0Y, r0);
        A0Y.A2x(migColorScheme);
        A0Y.A2K("remove_user_interstitial_secondary_text");
        4YU.A1K(A0i, A0Y);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0k(0.0f);
        A012.A2g(C1ro.FLEX_START);
        7zO.A1G(A012, r0);
        C2k3 A002 = C2k2.A00(r302);
        A002.A0k(0.0f);
        A002.A2X(migColorScheme.Atp());
        A002.A0z(0.0f);
        A002.A1L(1);
        A002.A0R();
        A012.A2e(A002);
        A012.A2K("remove_user_interstitial_divider");
        7zL.A1I(A0i, A012);
        2KD A0n = 7zQ.A0n(r302, migColorScheme, charSequence3, 0);
        A0n.A2k();
        A0n.A2w(C1u7.A05);
        A0n.A01.A0M = true;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
        A0n.A2s(alignment);
        4YU.A1L(A0n, r0);
        7zO.A1E(A0n, r02);
        A0n.A0F("android.widget.Button");
        7zN.A1D(A0n, r302, C8mi.class, "RemoveUserInterstitial", 1081708033);
        A0n.A0P();
        A0n.A2K("remove_user_interstitial_accept_button");
        4YU.A1K(A0i, A0n);
        2KD A0n2 = 7zQ.A0n(r302, migColorScheme, charSequence4, 0);
        7zN.A1X(A0n2);
        A0n2.A01.A0M = true;
        A0n2.A2s(alignment);
        4YU.A1L(A0n2, r0);
        7zO.A1E(A0n2, r02);
        A0n2.A0F("android.widget.Button");
        7zN.A1D(A0n2, r302, C8mi.class, "RemoveUserInterstitial", -1118622769);
        A0n2.A0P();
        A0n2.A2K("remove_user_interstitial_cancel_button");
        4YU.A1K(A0i, A0n2);
        7zL.A1H(A0i, A01);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1118622769:
                9xL r0 = ((C8mi) r302.A00.A01).A00;
                11T.A0F(r0, 1);
                r0.C8f();
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 890204494:
                9xL r02 = ((C8mi) r302.A00.A01).A00;
                11T.A0F(r02, 1);
                r02.A00();
                return null;
            case 1081708033:
                9xL r03 = ((C8mi) r302.A00.A01).A00;
                11T.A0F(r03, 1);
                r03.CCs();
                return null;
            default:
                return null;
        }
    }
}
