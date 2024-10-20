package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8lv, reason: invalid class name */
/* loaded from: 8lv.class */
public final class C8lv extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("ContactShareXMAPreviewComponentSpec");
    public C9xf A00;
    public MigColorScheme A01;

    public C8lv() {
        super("ContactShareXMAPreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2qP A00;
        C9xf c9xf = this.A00;
        MigColorScheme migColorScheme = this.A01;
        boolean A1X = 1BL.A1X(r302, c9xf);
        11T.A0F(migColorScheme, 2);
        2KD r312 = null;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0Q();
        C26z c26z = C26z.HORIZONTAL;
        2RH r0 = 2RH.A04;
        7zO.A1M(A01, r0, c26z);
        5BH A012 = 5BG.A01(r302);
        A012.A0z(80.0f);
        Uri uri = c9xf.A00;
        A012.A2X(uri);
        C07004ik A002 = C06984ii.A00();
        ((C07014il) A002).A09 = new C2592Gib(27, 2.0f, 1717986877);
        ((C07014il) A002).A04 = 5BJ.A01(45.0f, 0.0f, 0.0f, 45.0f);
        C06984ii.A01(A012, A002);
        A012.A2b(A02);
        A012.A0c();
        A01.A2f(7zO.A0O(A012));
        C1rq A013 = C1rg.A01(r302, null, 0);
        Context A0A = 7zL.A0A(r302);
        int A003 = C0A8.A00(A0A, 80.0f);
        C1rq A014 = C1rg.A01(r302, null, 0);
        if (uri == null) {
            A00 = null;
        } else {
            A00 = 2qK.A00(r302, 0);
            A00.A2X(2qZ.A00(uri));
            A00.A0C(A003);
            A00.A1L(A003);
            2qK r02 = A00.A01;
            r02.A05 = A003;
            r02.A0F = A1X;
            A00.A1D(22.0f);
        }
        A014.A2e(A00);
        A014.A0s(80.0f);
        A014.A0r(80.0f);
        7zL.A1M(A014, A013);
        2KD r325 = null;
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        4YU.A1O(A015, r0, c26z);
        A015.A2c();
        String str = c9xf.A02;
        if (str != null) {
            r312 = 2K3.A01(r302, 0);
            7zQ.A1V(r312, str);
            r312.A2x(migColorScheme);
            r312.A2q(2);
            r312.A2Z();
        }
        A015.A2d(r312);
        String str2 = c9xf.A01;
        if (str2 != null) {
            r325 = 7zN.A0Y(r302, false);
            7zQ.A1S(r325, str2);
            r325.A2x(migColorScheme);
            r325.A2q(A1X ? 1 : 0);
            r325.A2Z();
        }
        A015.A2d(r325);
        7zL.A1H(A015, A013);
        7zL.A1M(A013, A01);
        A01.A0D(9DN.A00(A0A, migColorScheme));
        return A01.A00;
    }
}
