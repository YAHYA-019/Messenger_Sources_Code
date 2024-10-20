package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.8m9, reason: invalid class name */
/* loaded from: 8m9.class */
public final class C8m9 extends C1rj {
    public static final 1Ih A04 = (1Ih) 7zM.A19();
    public Uri A00;
    public Uri A01;
    public MigColorScheme A02;
    public Long A03;

    public C8m9() {
        super("ContentUriImageTileLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A00, this.A03, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String format;
        Uri uri = this.A00;
        Uri uri2 = this.A01;
        Long l = this.A03;
        MigColorScheme migColorScheme = this.A02;
        11T.A0F(r302, 0);
        7zT.A1T(uri, uri2, migColorScheme);
        C07004ik A00 = C06984ii.A00();
        7zM.A1K(A00, 40.0f);
        ((C07014il) A00).A06 = AbstractC02343uw.A01(18, 18);
        1Ih r0 = A04;
        A00.A02(r0.getColor(2132213982));
        A00.A0C = r0.getDrawable(2132347268);
        C06974ih A0L = 7zL.A0L(A00);
        C1rq A01 = C1rg.A01(r302, null, 0);
        5BH A012 = 5BG.A01(r302);
        A012.A2a(5Bm.A01(uri, (java.util.Map) null));
        A012.A2W(1.0f);
        A012.A2Z(A0L);
        7zO.A1B(A012, A01);
        C2sS A002 = C2rr.A00(r302);
        A002.A2Y(new C2q1(0.0f, 0.0f, 3.0f, 22.0f, 3.0f, 7, 25, 0, 0, 18));
        A002.A2Z(migColorScheme);
        A002.A2X(uri2);
        A002.A01.A00 = -1;
        C2rr A2W = A002.A2W();
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A0c();
        C1ro c1ro = C1ro.CENTER;
        A013.A2g(c1ro);
        A013.A2f(c1ro);
        A013.A2A(C26z.ALL, 20);
        A013.A2e(A2W);
        7zL.A1H(A013, A01);
        if (l != null) {
            2cM A014 = 2cK.A01(r302, (String) null, 0);
            A014.A0c();
            A014.A2g(c1ro);
            A014.A2f(c1ro);
            A014.A27(C26z.RIGHT, 10.0f);
            A014.A1E(10.0f);
            2KD A015 = 2K3.A01(r302, 0);
            long longValue = l.longValue();
            if (longValue < 1000) {
                format = "00:01";
            } else {
                format = new SimpleDateFormat("mm:ss", ((1GS) 1Bi.A03(16504)).A05()).format(new Date(longValue));
                11T.A0A(format);
            }
            A015.A2z(format);
            A015.A2i();
            A015.A2e();
            A015.A2x(migColorScheme);
            A014.A2d(A015);
            A01.A2e(A014);
        }
        return A01.A00;
    }
}
