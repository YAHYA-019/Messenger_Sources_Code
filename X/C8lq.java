package X;

import android.content.Context;
import android.text.Layout;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8lq, reason: invalid class name */
/* loaded from: 8lq.class */
public final class C8lq extends C1rj {
    public int A00;
    public 9U3 A01;

    public C8lq() {
        super("MigHScrollListItemLayout");
        this.A00 = 80;
    }

    public static 8Su A00(1Iw r301) {
        return new 8Su(r301, new C8lq());
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl c2cl;
        1LI A2W;
        9U3 r0 = this.A01;
        int i = this.A00;
        boolean A1X = 1BL.A1X(r302, r0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        55E r02 = r0.A02;
        boolean z = r0.A04;
        MigColorScheme migColorScheme = r0.A03;
        boolean z2 = r0.A00;
        C1rq A012 = C1rg.A01(r302, null, 0);
        8Am A00 = 58I.A00(r302);
        A00.A2X(r02);
        A00.A2Y(BYE.A00);
        A012.A2f(A00.A2W());
        if (z) {
            Context A0A = 7zL.A0A(r302);
            int A002 = C0A8.A00(A0A, 20.0f);
            int A003 = ((int) (C6qg.A00 * C0A8.A00(A0A, 56.0f))) - (A002 / 2);
            C2cm A004 = C2cl.A00(r302);
            A004.A2b(A0A.getDrawable(2132346252));
            7zR.A0x(A0A, A004, 10.0f, migColorScheme.Abp());
            7zM.A1H(A004, migColorScheme);
            A004.A0c();
            A004.A2E(C26z.TOP, A003);
            A004.A2E(C26z.END, A003);
            A004.A1U(A002);
            A004.A1L(A002);
            A004.A1D(5.0f);
            A004.A0w(4.0f);
            C7as A02 = C5B1.A02();
            if (A02 != null) {
                A004.A1g(A02);
            }
            c2cl = 7zN.A09(A004);
        } else {
            c2cl = null;
        }
        A012.A2f(c2cl);
        if (z2) {
            4YU.A1M(A012, 2RH.A05);
        }
        7zL.A1I(A01, A012);
        55A r03 = r0.A01;
        if (r03 == null) {
            A2W = null;
        } else {
            8Al A005 = 58J.A00(r302);
            A005.A2X(r03);
            Context A0A2 = 7zL.A0A(r302);
            2KE r04 = 2KE.A02;
            A005.A2Y(new 58C(2KK.A04(r04).A00(A0A2), Layout.Alignment.ALIGN_CENTER, 2KK.A03(r04).textSizeSp, migColorScheme.Chx(C1u7.A08), A1X ? 1 : 0, A1X));
            7zO.A1K(A005, 2RH.A07);
            A2W = A005.A2W();
        }
        A01.A2e(A2W);
        A01.A2b();
        A01.A0z(i);
        C26z c26z = C26z.VERTICAL;
        A01.A24(c26z, 8.0f);
        A01.A25(c26z, 4.0f);
        return A01.A00;
    }
}
