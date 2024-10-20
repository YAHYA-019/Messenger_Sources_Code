package X;

import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8j4, reason: invalid class name */
/* loaded from: 8j4.class */
public final class C8j4 extends C1rj {
    public MigColorScheme A00;

    public C8j4() {
        super("MigInputErrorIcon");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        11T.A0H(r302, migColorScheme);
        C1u2 A0I = 4YV.A0I();
        int Chx = migColorScheme.Chx(C1ut.A06);
        C2cm A00 = C2cl.A00(r302);
        A00.A2X(Chx);
        A00.A2b(A0I.A08(C1u3.A2Z, Chx));
        A00.A2c(ImageView.ScaleType.FIT_END);
        return 7zN.A09(A00);
    }
}
