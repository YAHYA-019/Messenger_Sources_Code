package X;

import android.graphics.drawable.RippleDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8ls, reason: invalid class name */
/* loaded from: 8ls.class */
public final class C8ls extends C1rj {
    public static final MigColorScheme A02 = LightColorScheme.A00();
    public MigColorScheme A00;
    public CharSequence A01;

    public C8ls() {
        super("RtcFilledLargeSecondaryButton");
        this.A00 = A02;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, null, true, 1BK.A0d(), null, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A01;
        MigColorScheme migColorScheme = this.A00;
        11T.A0F(r302, 0);
        1BK.A1K(charSequence, 1, migColorScheme);
        int A00 = C0A8.A00(7zL.A0A(r302), 16.0f);
        C5Ax A002 = 5Av.A00(r302);
        5Av r0 = A002.A01;
        r0.A00 = A00;
        A002.A2Z(48.0f);
        7zR.A1G(A002, 2RH.A03, charSequence);
        r0.A0C = null;
        7zR.A1H(A002, 2KV.A06, false);
        A002.A2j(true);
        r0.A0E = null;
        RippleDrawable A0C = 7zR.A0C(migColorScheme, A00);
        11T.A0A(A0C);
        A002.A2f(A0C);
        return 7zM.A0x(A002, migColorScheme.B4i());
    }
}
