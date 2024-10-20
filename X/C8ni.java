package X;

import android.graphics.drawable.ShapeDrawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8ni, reason: invalid class name */
/* loaded from: 8ni.class */
public final class C8ni extends C1rj {
    public static final MigColorScheme A04 = LightColorScheme.A00();
    public MigColorScheme A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;

    public C8ni() {
        super("FrxPillButton");
        this.A00 = A04;
        this.A02 = true;
    }

    public static ShapeDrawable A00(1Iw r301, MigColorScheme migColorScheme, boolean z) {
        float f;
        boolean A02 = 0AT.A02(migColorScheme.BDl());
        int BKg = A02 ? migColorScheme.BKg() : migColorScheme.AZN();
        if (z) {
            f = 0.54f;
        } else {
            f = 0.07f;
            if (A02) {
                f = 0.2f;
            }
        }
        return C2cn.A02(4YU.A0E(r301).getDimension(2132279311), 1tG.A05(BKg, (int) (f * 255.0f)));
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, Boolean.valueOf(this.A02), Boolean.valueOf(this.A03), this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int Ahv;
        CharSequence charSequence = this.A01;
        MigColorScheme migColorScheme = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        C5Ax A00 = 5Av.A00(r302);
        A00.A01.A00 = ((C1rs) A00).A02.A06(2132279311);
        A00.A2d(2132279321);
        A00.A2a(7zL.A02());
        float A002 = 4YU.A00(2RH.A07);
        5Av r0 = A00.A01;
        r0.A0A = 7zL.A04(A00, A002);
        A00.A2k(false);
        A00.A0G(z2);
        r0.A0O = false;
        A00.A2i(charSequence);
        A00.A2g(2KV.A07);
        r0.A05 = 3;
        A00.A2h(2KQ.A04);
        A00.A2j(z);
        if (z) {
            A00.A2f(A00(r302, migColorScheme, z2));
            Ahv = z2 ? migColorScheme.BKh() : migColorScheme.B4i();
        } else {
            A00.A2f(A00(r302, migColorScheme, false));
            Ahv = migColorScheme.Ahv();
        }
        return 7zM.A0x(A00, Ahv);
    }
}
