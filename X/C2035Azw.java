package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Azw, reason: case insensitive filesystem */
/* loaded from: Azw.class */
public final class C2035Azw extends C1rj {
    public static final C2ke A05;
    public C2kx A00;
    public AZV A01;
    public MigColorScheme A02;
    public ImmutableList A03;
    public ImmutableList A04;

    static {
        2kW r0 = new 2kW();
        r0.A01 = 0;
        r0.A02 = -1;
        A05 = r0.A00();
    }

    public C2035Azw() {
        super("HorizontalUsersRowLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00, this.A03, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList immutableList = this.A04;
        C2kx c2kx = this.A00;
        MigColorScheme migColorScheme = this.A02;
        ImmutableList immutableList2 = this.A03;
        AZV azv = this.A01;
        11T.A0F(r302, 0);
        7zS.A16(1, immutableList, c2kx, migColorScheme);
        11T.A0F(azv, 5);
        2cM A00 = 2cK.A00(r302);
        C2ki A002 = C2kV.A00(r302);
        A002.A2f(A05);
        7zL.A1K(r302);
        8qP r0 = new 8qP();
        r0.A03 = immutableList;
        r0.A02 = immutableList2;
        r0.A01 = migColorScheme;
        r0.A00 = azv;
        A002.A01.A0L = r0;
        A002.A02.set(0);
        A002.A2e(c2kx);
        A002.A2j(true);
        A002.A0R();
        AbG.A1M(A00, A002);
        A00.A0l(107.0f);
        return A00.A00;
    }
}
