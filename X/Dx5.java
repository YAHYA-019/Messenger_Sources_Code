package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils;
import com.facebook.common.util.StringLocaleUtil;

/* loaded from: Dx5.class */
public final class Dx5 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dx5() {
        super("FBMessengerCallToActionButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GHM ghm = this.A01;
        GL7 gl7 = this.A00;
        boolean z = gl7.getBoolean(61, false);
        String string = gl7.getString(56);
        String string2 = gl7.getString(51);
        Layout.Alignment alignment = "LEFT".equals(string2) ? Layout.Alignment.ALIGN_NORMAL : ("RIGHT".equals(string2) || !"CENTER".equals(string2)) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        7ZL A00 = C5Ay.A00(r302);
        A00.A00.A0G = StringLocaleUtil.toUpperCaseLocaleSafe(string);
        int Ad0 = z ? 1124073472 : gl7.Ad0(ghm, 57, 65, -16743169);
        C5Ay c5Ay = A00.A00;
        c5Ay.A00 = Ad0;
        c5Ay.A05 = A00.A02.A02(14.0f);
        A00.A2U(!z);
        A00.A0l(44.0f);
        A00.A00.A0B = alignment;
        A00.A00.A08 = 2KU.A00(r302.A0D);
        A00.A00.A0E = 1LI.A0A(r302, Dx5.class, "FBMessengerCallToActionButtonComponent", -2110887525);
        7zN.A1C(A00, r302, Dx5.class, "FBMessengerCallToActionButtonComponent");
        if (!z) {
            A00.A0P();
        }
        A00.A0J();
        return A00.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2110887525) {
            if (i != -1351902487) {
                4YV.A1G(r302, obj, i);
                return null;
            }
            Dx5 dx5 = (Dx5) r302.A00.A01;
            GL7 gl7 = dx5.A00;
            FyG fyG = dx5.A01;
            GL7 Ay2 = gl7.Ay2(41);
            if (Ay2 == null) {
                return null;
            }
            FJ9.A0A(Ay2, fyG);
            return null;
        }
        5B3 r0 = (5B3) obj;
        1Iw r02 = r302.A00.A00;
        CharSequence charSequence = r0.A06;
        int i2 = r0.A02;
        int i3 = r0.A01;
        Typeface typeface = r0.A04;
        Layout.Alignment alignment = r0.A05;
        ColorStateList colorStateList = r0.A03;
        int i4 = r0.A00;
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        3yF A0L = 2KZ.A0L(r02, 0);
        boolean z = false;
        A0L.A3C(false);
        A0L.A3A(charSequence);
        A0L.A31(i2);
        A0L.A2x(i4);
        if (i3 == 1) {
            z = true;
        }
        A0L.A3D(z);
        A0L.A2u(i3);
        A0L.A34(typeface);
        A0L.A35(alignment);
        A0L.A2a();
        7zQ.A1C(A0L);
        if (colorStateList != null) {
            A0L.A01.A0S = colorStateList;
            return A0L;
        }
        A0L.A2x(i4);
        return A0L;
    }
}
