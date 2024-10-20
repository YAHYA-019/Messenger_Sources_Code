package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.3v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3v3.class */
public final class C02403v3 extends C2p0 {
    public static final C1u7 A02 = C1u7.A05;
    public final MigColorScheme A00;
    public final boolean A01;

    public C02403v3(MigColorScheme migColorScheme, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A01 = z;
    }

    @Override // X.C2p0
    public /* bridge */ /* synthetic */ 1LI A00(1Iw r302, C2m6 c2m6, Object obj) {
        C1u3 c1u3;
        2pP r0 = (2pP) obj;
        11T.A0F(r302, 0);
        11T.A0F(r0, 1);
        11T.A0F(c2m6, 2);
        C2p8 A00 = C2p6.A00((!((2oT) c2m6).A04 || this.A01) ? 0S2.A01 : 0S2.A0N);
        C2zi A002 = C2pa.A00(r302);
        A002.A2a(r0.A01);
        C1u7 c1u7 = A02;
        A002.A2X(c1u7);
        A002.A2Z(A00.A06);
        MigColorScheme migColorScheme = this.A00;
        A002.A2Y(migColorScheme);
        int intValue = r0.A00.intValue();
        if (intValue == 1) {
            c1u3 = C1u3.A1G;
        } else {
            if (intValue != 0) {
                throw new RuntimeException();
            }
            c1u3 = C1u3.A4r;
        }
        A002.A01.A00 = ((C1uu) 1Bi.A03(66388)).A02(((C1u2) 1Bi.A03(16839)).A04(c1u3, C1u4.SIZE_32), migColorScheme.Chx(c1u7));
        return A002.A2W();
    }
}
