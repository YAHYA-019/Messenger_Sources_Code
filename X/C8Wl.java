package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8Wl, reason: invalid class name */
/* loaded from: 8Wl.class */
public final class C8Wl extends 1LH {
    public final Uri A00;
    public final C1u2 A01;
    public final MigColorScheme A02;

    public C8Wl(Uri uri, C1u2 c1u2, MigColorScheme migColorScheme) {
        1BL.A1F(migColorScheme, c1u2);
        this.A02 = migColorScheme;
        this.A01 = c1u2;
        this.A00 = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 1LI A0s(C2k5 c2k5) {
        C2cm c2cm;
        11T.A0F(c2k5, 0);
        Uri uri = this.A00;
        1Iw r0 = c2k5.A05;
        if (uri != null) {
            C2sS A00 = C2rr.A00(r0);
            A00.A2Y(new C2q1(0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0, 60, 0, 0, 0));
            A00.A2Z(this.A02);
            A00.A2X(uri);
            c2cm = A00;
        } else {
            C2cm A002 = C2cl.A00(r0);
            7zN.A18(A002, C1u3.A0I, this.A01);
            c2cm = A002;
        }
        c2cm.A0z(60.0f);
        c2cm.A0l(60.0f);
        c2cm.A0L();
        1LI A2V = c2cm.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}
