package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.371, reason: invalid class name */
/* loaded from: 371.class */
public final class AnonymousClass371 extends 1LH {
    public final 3Jb A00;
    public final MigColorScheme A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass371(3Jb r302, MigColorScheme migColorScheme, String str, String str2, String str3, String str4) {
        1BL.A11(2, r302, str, str2);
        1BL.A1G(str3, str4);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        8Ta A00 = C8mp.A00(c2k5.A05);
        A00.A2c(this.A05);
        A00.A2a(this.A04);
        A00.A2b(this.A02);
        A00.A2Z(this.A01);
        A00.A01.A07 = this.A03;
        A00.A2Y(new RsJ(this));
        A00.A2d(true);
        A00.A2e(true);
        return A00.A2W();
    }
}
