package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jb, reason: invalid class name */
/* loaded from: 8jb.class */
public final class C8jb extends C1rj {
    public int A00;
    public int A01;
    public MigColorScheme A02;
    public boolean A03;

    public C8jb() {
        super("MigCharacterCountText");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Boolean.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String formatStrLocaleSafe;
        MigColorScheme migColorScheme = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        boolean A1X2 = 4YV.A1X(i2, i);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A0S();
        A01.A2q(A1X ? 1 : 0);
        A01.A1y(z ? C1ro.FLEX_START : C1ro.FLEX_END);
        A01.A25(C26z.END, 16.0f);
        A01.A19(4.0f);
        A01.A2x(migColorScheme);
        if (i == ((-1) >>> 1)) {
            formatStrLocaleSafe = String.valueOf(i2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s/%s", Integer.valueOf(i2), Integer.valueOf(i));
            11T.A0A(formatStrLocaleSafe);
        }
        A01.A2z(formatStrLocaleSafe);
        A01.A2i();
        A01.A2w(A1X2 ? C1u7.A05 : C1u7.A0A);
        return A01.A2W();
    }
}
