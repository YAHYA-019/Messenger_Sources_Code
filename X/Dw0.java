package X;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;

/* loaded from: Dw0.class */
public final class Dw0 extends 1LH {
    public static final ClickableSpan A01 = new DO9(0);
    public final AnonymousClass622 A00;

    public Dw0(AnonymousClass622 anonymousClass622) {
        this.A00 = anonymousClass622;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        FbSharedPreferences A0W = 1BL.A0W();
        2BQ A0h = DKE.A0h();
        C1ro c1ro = C1ro.CENTER;
        1Iw r0 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(r0, 1);
        11T.A0A(r0.A0D);
        1Ky r02 = (1Ky) 1Bn.A0A(98565);
        C01i c01i = r02.A0V;
        if (!DKE.A1Z(A0W, c01i) && A0W.AZn(r02.A01("upsell_dont_warn_again_checkbox_checked"), false)) {
            1Ql.A01(A0W.edit(), DKC.A0b(c01i), true);
            3yF A0L = 2KZ.A0L(r0, 0);
            A0L.A3C(false);
            A0L.A30(2131965675);
            A0L.A32(2132279337);
            A0L.A2z(2132214454);
            A0L.A0a();
            A0s.add(A0L.A2W());
        }
        1Ky r03 = (1Ky) 1Bn.A0A(98565);
        C01i c01i2 = r03.A0W;
        if (!DKE.A1Z(A0W, c01i2) && !A0h.A05(1BJ.A00(225)) && A0W.ArU(DKC.A0b(r03.A0X), 0) >= 3) {
            1Ql.A01(A0W.edit(), DKC.A0b(c01i2), true);
            2lQ r04 = 2lO.A02;
            11T.A0A(r0.A0E);
            2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, r0.A06(2132279327) | 9221401712017801216L);
            ArrayList A0s2 = AnonymousClass001.A0s();
            3yF A0L2 = 2KZ.A0L(r0, 0);
            A0L2.A3C(false);
            A0L2.A30(2131965670);
            A0L2.A32(2132279337);
            A0L2.A2z(2132214454);
            A0s2.add(A0L2.A2W());
            String A0D = r0.A0D(2131965671);
            int length = A0D.length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0D);
            spannableStringBuilder.setSpan(A01, 0, length, 33);
            3yF A0L3 = 2KZ.A0L(r0, 0);
            A0L3.A3C(false);
            A0L3.A3A(spannableStringBuilder);
            A0L3.A32(2132279337);
            A0L3.A2z(2132214411);
            A0s2.add(A0L3.A2W());
            2cL r05 = new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0s2, false);
            A0K.A01(r05.A0v(), r0);
            A0s.add(r05);
        }
        return new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, A0s, false);
    }
}
