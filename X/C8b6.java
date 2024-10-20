package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8b6, reason: invalid class name */
/* loaded from: 8b6.class */
public final class C8b6 extends 1LH {
    public final C00m A00;
    public final int A01;
    public final C1p8 A02;
    public final MigColorScheme A03;
    public final CharSequence A04;

    public C8b6(C1p8 c1p8, MigColorScheme migColorScheme, CharSequence charSequence, C00m c00m, int i) {
        11T.A0F(charSequence, 1);
        this.A04 = charSequence;
        this.A01 = i;
        this.A03 = migColorScheme;
        this.A02 = c1p8;
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        int A00 = C0A8.A00(3vP.A00(c2k5), 36.0f);
        float f = A00 / 2.0f;
        Drawable drawable = 3vP.A00(c2k5).getDrawable(this.A01);
        if (drawable == null) {
            drawable = null;
        } else if (7Sm.A00(3vP.A00(c2k5))) {
            drawable = new JSr(drawable, false, true);
        }
        2lQ r0 = 2lO.A02;
        2lO A0Y = 7zQ.A0Y(7zQ.A0X((2lO) null, 0S2.A01, 1.0f), 0S2.A00, 9221401712017801216L);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r02 = A0L.A00;
        C2cm A002 = C2cl.A00(r02);
        A002.A1L(A00);
        A002.A0C(A00);
        A002.A2W();
        A002.A2b(drawable);
        MigColorScheme migColorScheme = this.A03;
        A002.A2X(migColorScheme.Chx(this.A02));
        A002.A0D(C2cn.A00(f, migColorScheme.Chx(C1td.A0D), migColorScheme.Chx(2cR.A04)));
        CharSequence charSequence = this.A04;
        A002.A2S(charSequence);
        A002.A0F("android.widget.ImageView");
        C26z c26z = C26z.TOP;
        2RH r03 = 2RH.A06;
        A002.A29(c26z, 4YU.A00(r03));
        A002.A29(C26z.HORIZONTAL, 4YU.A00(r03));
        A002.A29(C26z.BOTTOM, 30.0f);
        7zR.A1A(A002, new AR2(this, 28));
        7zO.A19(A002, A0L);
        2KD A01 = 2K3.A01(r02, 0);
        7zO.A1M(A01, 2RH.A07, c26z);
        A01.A2X();
        A01.A0j(1.0f);
        A01.A2x(migColorScheme);
        A01.A2z(charSequence);
        A01.A32(false);
        A01.A2b();
        A01.A2i();
        7zN.A1Q(A0L, A01);
        return C2so.A03(A0L, c2k5, A0Y);
    }
}
