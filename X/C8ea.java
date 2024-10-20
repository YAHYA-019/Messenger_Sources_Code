package X;

import android.net.Uri;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ea, reason: invalid class name */
/* loaded from: 8ea.class */
public final class C8ea extends 1LH {
    public final 2MQ A00;
    public final 9Aj A01;
    public final MigColorScheme A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final float A0B;
    public final Uri A0C;
    public final boolean A0D;

    public C8ea(Uri uri, 2MQ r303, 9Aj r304, MigColorScheme migColorScheme, Integer num, Integer num2, String str, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        1BL.A1F(migColorScheme, str);
        7zR.A1Q(num2, r303);
        11T.A0F(r304, 13);
        this.A02 = migColorScheme;
        this.A05 = str;
        this.A03 = num;
        this.A07 = z;
        this.A0C = uri;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A04 = num2;
        this.A00 = r303;
        this.A0B = f;
        this.A06 = z5;
        this.A01 = r304;
        this.A0D = z6;
    }

    public 1LI A0s(C2k5 c2k5) {
        int B9O;
        11T.A0F(c2k5, 0);
        1Br A00 = 1Bu.A00(67678);
        C2cm A002 = C2cl.A00(c2k5.A05);
        float f = this.A0B;
        A002.A0l(f);
        A002.A0z(f);
        A002.A2a(4YV.A0I().A02(this.A00, 2Re.A02));
        if (this.A06) {
            B9O = this.A02.AWT();
        } else {
            boolean z = this.A0D;
            MigColorScheme migColorScheme = this.A02;
            B9O = z ? migColorScheme.B9O() : migColorScheme.B4h();
        }
        A002.A2X(B9O);
        A002.A1J(2131964661);
        A002.A0F("android.widget.ImageView");
        A002.A2c(ImageView.ScaleType.FIT_XY);
        7zR.A1A(A002, AV8.A00(c2k5, this, A00, 43));
        return 7zN.A09(A002);
    }
}
