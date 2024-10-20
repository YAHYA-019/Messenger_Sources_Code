package X;

import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8no, reason: invalid class name */
/* loaded from: 8no.class */
public final class C8no extends C1rj {
    public static final Layout.Alignment A06 = Layout.Alignment.ALIGN_NORMAL;
    public Layout.Alignment A00;
    public MigColorScheme A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;

    public C8no() {
        super("MigInputHelperText");
        this.A00 = A06;
    }

    public static 8TJ A00(1Iw r301) {
        return new 8TJ(r301, new C8no());
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02, Boolean.valueOf(this.A04), this.A03, Boolean.valueOf(this.A05)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence;
        MigColorScheme migColorScheme = this.A01;
        CharSequence charSequence2 = this.A03;
        boolean z = this.A04;
        CharSequence charSequence3 = this.A02;
        Layout.Alignment alignment = this.A00;
        boolean z2 = this.A05;
        1BK.A1M(r302, migColorScheme);
        11T.A0F(alignment, 5);
        if ((charSequence2 == null || charSequence2.length() == 0) && !z) {
            return null;
        }
        2KD A01 = 2K3.A01(r302, 0);
        float f = 16.0f;
        A01.A25(C26z.START, 16.0f);
        C26z c26z = C26z.END;
        if (z2) {
            f = 12.0f;
        }
        A01.A25(c26z, f);
        A01.A2s(alignment);
        A01.A17(4.0f);
        A01.A2x(migColorScheme);
        if (z) {
            if (charSequence3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            charSequence = charSequence3;
        } else {
            if (charSequence2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            charSequence = charSequence2;
        }
        A01.A2z(charSequence);
        if (z) {
            if (charSequence3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            charSequence2 = charSequence3;
        } else if (charSequence2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A01.A2S(charSequence2);
        A01.A2i();
        A01.A2w(z ? C1u7.A05 : C1u7.A0A);
        return A01.A2W();
    }
}
