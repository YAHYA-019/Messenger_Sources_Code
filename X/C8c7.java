package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8c7, reason: invalid class name */
/* loaded from: 8c7.class */
public final class C8c7 extends 1LH {
    public final 3Jc A00;
    public final MigColorScheme A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C8c7(3Jc r302, MigColorScheme migColorScheme, String str, String str2, String str3, String str4) {
        11T.A0F(r302, 2);
        7zT.A11(3, str, str2, str3, str4);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public 1LI A0s(C2k5 c2k5) {
        8Ta A00 = C8mp.A00(7zO.A0T(c2k5));
        A00.A2c(this.A05);
        A00.A2a(this.A04);
        A00.A2b(this.A02);
        A00.A2Z(this.A01);
        A00.A01.A07 = this.A03;
        A00.A2Y(new C9za(this, 2));
        A00.A2d(true);
        A00.A2e(true);
        return A00.A2W();
    }
}
