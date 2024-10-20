package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8av, reason: invalid class name */
/* loaded from: 8av.class */
public final class C8av extends 1LH {
    public final C96y A00;
    public final 9OH A01;
    public final MigColorScheme A02;
    public final int A03;
    public final int A04;

    public C8av(C96y c96y, 9OH r303, MigColorScheme migColorScheme, int i, int i2) {
        C3o5.A0k(c96y, 3, migColorScheme);
        this.A04 = i;
        this.A03 = i2;
        this.A00 = c96y;
        this.A01 = r303;
        this.A02 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI r0 = (1LI) AQr.A00(c2k5, this, 7zL.A1Z(c2k5), 47);
        return new 2cL((C1ro) null, (C1ro) null, C1rp.SPACE_BETWEEN, (EnumC00743oh) null, 7zL.A16(new 8ZK(this.A02, this.A04, this.A03, this.A00.modeDescriptionId), 7zS.A0H(r0, c2k5.A05)), false);
    }
}
