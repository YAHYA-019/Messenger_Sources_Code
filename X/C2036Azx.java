package X;

import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Azx, reason: case insensitive filesystem */
/* loaded from: Azx.class */
public final class C2036Azx extends C1rj {
    public static final Layout.Alignment A05 = Layout.Alignment.ALIGN_NORMAL;
    public Layout.Alignment A00;
    public C1u3 A01;
    public MigColorScheme A02;
    public String A03;
    public boolean A04;

    public C2036Azx() {
        super("BroadcastFlowBannerTextComponent");
        this.A00 = A05;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A01, Boolean.valueOf(this.A04), this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A03;
        MigColorScheme migColorScheme = this.A02;
        C1u3 c1u3 = this.A01;
        Layout.Alignment alignment = this.A00;
        boolean z = this.A04;
        C1u2 A0R = 7zP.A0R();
        C2cl c2cl = null;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A1C(20.0f);
        A01.A0Z();
        if (c1u3 != null) {
            C2cm A00 = C2cl.A00(r302);
            A00.A2b(7zO.A0F(c1u3, A0R, migColorScheme));
            A00.A0z(20.0f);
            A00.A0l(20.0f);
            A00.A24(C26z.RIGHT, 4.0f);
            if (z) {
                A00.A2X(C2qb.A00(migColorScheme, migColorScheme.B9Q()));
            }
            c2cl = 7zL.A0J(A00);
        }
        A01.A2f(c2cl);
        2KD A012 = 2K3.A01(r302, 0);
        int i = 0;
        A012.A32(false);
        A012.A2z(str);
        A012.A0j(1.0f);
        A012.A2s(alignment);
        A012.A2i();
        A012.A2w(z ? C1u7.A0A : C1u7.A08);
        A012.A17(1.0f);
        A012.A2x(migColorScheme);
        A01.A2e(A012);
        if (!z) {
            i = C2qb.A00(migColorScheme, migColorScheme.AYp());
        }
        A01.A1H(i);
        return A01.A00;
    }
}
