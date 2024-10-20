package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8lo, reason: invalid class name */
/* loaded from: 8lo.class */
public final class C8lo extends C1rj {
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final CallerContext A06;
    public 56S A00;

    static {
        2RH r0 = 2RH.A03;
        A02 = r0.A00();
        A05 = r0.A00();
        A01 = r0.A00();
        A03 = r0.A00();
        A04 = 7zM.A01();
        A06 = CallerContext.A0B("CatalogListItemLayoutSpec");
    }

    public C8lo() {
        super("CatalogListItemLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        56S r0 = this.A00;
        C1rq A0Q = 7zN.A0Q(r302, 0);
        C1ro c1ro = C1ro.CENTER;
        A0Q.A2h(c1ro);
        A0Q.A1C(A03);
        A0Q.A1B(A04);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0S();
        C26z c26z = C26z.RIGHT;
        A012.A25(c26z, A02);
        A012.A2h(c1ro);
        5BH A013 = 5BG.A01(r302);
        A013.A00.A0A = false;
        Uri uri = null;
        try {
            uri = C0A2.A03(r0.A03);
        } catch (SecurityException unused) {
        }
        A013.A2X(uri);
        A013.A2b(A06);
        C07004ik A00 = C06984ii.A00();
        7zM.A1K(A00, C0A8.A03(4YU.A0E(r302), 12.0f));
        C06984ii.A01(A013, A00);
        A013.A0z(78.0f);
        A013.A0l(78.0f);
        7zO.A1B(A013, A012);
        7zL.A1M(A012, A0Q);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        A014.A25(c26z, A05);
        7zQ.A1C(A014);
        2KD A015 = 2K3.A01(r302, 0);
        MigColorScheme migColorScheme = r0.A02;
        7zU.A1T(migColorScheme, A015);
        A015.A2z(r0.A05);
        4YU.A1K(A014, A015);
        2KD A016 = 2K3.A01(r302, 0);
        7zQ.A1M(migColorScheme, A016);
        A016.A2z(r0.A04);
        4YU.A1K(A014, A016);
        7zL.A1H(A014, A0Q);
        8Sp A002 = 59U.A00(r302);
        A002.A2X(r0.A01);
        A002.A0S();
        A002.A1y(c1ro);
        A002.A13(A01);
        return 7zL.A0d(A002.A2W(), A0Q);
    }
}
