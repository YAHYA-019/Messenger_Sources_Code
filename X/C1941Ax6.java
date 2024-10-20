package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ax6, reason: case insensitive filesystem */
/* loaded from: Ax6.class */
public final class C1941Ax6 extends 1LH {
    public final BLA A00;
    public final MigColorScheme A01;
    public final C00m A02;

    public C1941Ax6(BLA bla, MigColorScheme migColorScheme, C00m c00m) {
        this.A01 = migColorScheme;
        this.A00 = bla;
        this.A02 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI A2W;
        11T.A0F(c2k5, 0);
        BLA bla = this.A00;
        if (bla == BLA.A04) {
            8Tj A00 = C8m4.A00(c2k5.AeS());
            MigColorScheme migColorScheme = this.A01;
            A00.A2Z(migColorScheme);
            A00.A2X(24.0f);
            A00.A2Y(migColorScheme.AqM());
            A2W = A00.A2W();
        } else {
            BLA bla2 = BLA.A02;
            MigColorScheme migColorScheme2 = this.A01;
            Drawable A08 = 4YV.A0I().A08(C1u3.A61, bla == bla2 ? migColorScheme2.AUz() : migColorScheme2.B9O());
            C2cq A002 = C2cp.A00(c2k5.AeS(), 0);
            A002.A2a(A08);
            A002.A0z(32.0f);
            A002.A0l(32.0f);
            A2W = A002.A2W();
        }
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        2lO A0h = 7zS.A0h(0S2.A1G, new DD3(this, 3), 1);
        long doubleToRawLongBits = Double.doubleToRawLongBits(32.0d);
        2lO A0K = 4YV.A0K(A0h, 0S2.A00, doubleToRawLongBits);
        Integer num = 0S2.A01;
        2lO A0K2 = 4YV.A0K(A0K, num, doubleToRawLongBits);
        2dP r02 = 2dP.A01;
        Integer num2 = 0S2.A0Y;
        2lO A0g = 7zL.A0g(7zQ.A0Y(7zQ.A0Y(4YV.A0L(A0K2, num2, r02, 0), num2, Double.doubleToRawLongBits(28.0d)), 0S2.A0j, Double.doubleToRawLongBits(24.0d)), new C5z8(num, "android.widget.Button"));
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(A2W);
        return C2so.A08(A0L, c2k5, A0g, c1ro);
    }
}
