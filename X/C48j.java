package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.48j, reason: invalid class name */
/* loaded from: 48j.class */
public final class C48j implements C2ot {
    public final MigColorScheme A00;

    public C48j(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    @Override // X.C2ot
    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj, Object obj2) {
        C2od c2od = (C2od) obj;
        11T.A0F(c2od, 1);
        final C2fr c2fr = c2od.A00;
        final MigColorScheme migColorScheme = this.A00;
        final String str = c2od.A01;
        return new 1LH(migColorScheme, c2fr, str) { // from class: X.48k
            public final MigColorScheme A00;
            public final C2fr A01;
            public final String A02;

            {
                11T.A0F(c2fr, 1);
                this.A01 = c2fr;
                this.A00 = migColorScheme;
                this.A02 = str;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                C2pz A00 = C2px.A00(c2k5.A05);
                A00.A2X(C2q0.A08);
                A00.A2Z(this.A01);
                String str2 = this.A02;
                C2px c2px = A00.A01;
                c2px.A0A = str2;
                A00.A0F("android.view.View");
                c2px.A09 = "ThreadListImage";
                A00.A2Y(this.A00);
                c2px.A06 = C2py.ROUND_RECT;
                A00.A24(C26z.VERTICAL, 2RH.A05.A00());
                A00.A24(C26z.END, 2RH.A03.A00());
                A00.A0k(0.0f);
                return A00.A2W();
            }
        };
    }
}
