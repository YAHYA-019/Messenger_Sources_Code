package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8lu, reason: invalid class name */
/* loaded from: 8lu.class */
public final class C8lu extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("GameSharePreviewComponentSpec");
    public C9xd A00;
    public MigColorScheme A01;

    public C8lu() {
        super("GameSharePreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5BK A01;
        C9xd c9xd = this.A00;
        MigColorScheme migColorScheme = this.A01;
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0g(1.0f);
        5BH A013 = 5BG.A01(r302);
        A013.A2X(c9xd.A00);
        A013.A2b(A02);
        C07004ik A00 = C06984ii.A00();
        A00.A01(2132345116);
        Integer num = c9xd.A01;
        Integer num2 = 0S2.A0C;
        if (num == num2) {
            A013.A0z(56.0f);
            A013.A0l(56.0f);
            A01 = 5BK.A05;
        } else {
            int A014 = 3yG.A01(18.0f);
            A013.A0z(100.0f);
            float f = A014;
            A01 = 5BJ.A01(f, 0.0f, 0.0f, f);
        }
        ((C07014il) A00).A04 = A01;
        C06984ii.A01(A013, A00);
        7zO.A1B(A013, A012);
        2KD A0Y = 7zN.A0Y(r302, false);
        7zQ.A1V(A0Y, c9xd.A03);
        A0Y.A2x(migColorScheme);
        if (num == num2) {
            A0Y.A2q(1);
        } else {
            A0Y.A2q(2);
        }
        A0Y.A2Z();
        2KD A0Y2 = 7zN.A0Y(r302, false);
        7zR.A1L(migColorScheme, A0Y2, c9xd.A02);
        A0Y2.A2q(2);
        A0Y2.A2Z();
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        A015.A0j(1.0f);
        A015.A2c();
        A015.A1X(2RH.A04.sizeRes);
        4YU.A1K(A015, A0Y);
        4YU.A1K(A015, A0Y2);
        7zL.A1H(A015, A012);
        if (num == num2) {
            7zO.A1D(A012);
        }
        A012.A0D(9DN.A00(r302.A0D, migColorScheme));
        return A012.A00;
    }
}
