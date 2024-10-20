package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;

/* renamed from: X.8m0, reason: invalid class name */
/* loaded from: 8m0.class */
public final class C8m0 extends C1rj {
    public MigColorScheme A00;
    public MediaResource A01;
    public static final int A04 = 2RH.A07.A00();
    public static final int A03 = 7zL.A02();
    public static final int A02 = 7zL.A03();

    public C8m0() {
        super("DocSharePreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        MigColorScheme migColorScheme = this.A00;
        MediaResource mediaResource = this.A01;
        C1u2 A0R = 7zP.A0R();
        66I r0 = (66I) 1Bi.A03(49956);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        8Tm A00 = C8mf.A00(r302);
        A00.A2Z(18.0f);
        8Tm.A08(A00, migColorScheme);
        C1rq A012 = C1rg.A01(r302, null, 0);
        C1rq A013 = C1rg.A01(r302, null, 0);
        C1rp c1rp = C1rp.CENTER;
        A013.A2i(c1rp);
        A013.A2b();
        A013.A0z(62.0f);
        A013.A0l(62.0f);
        A013.A1H(migColorScheme.Ahs());
        float f = A02;
        A013.A1B(f);
        C2cm A002 = C2cl.A00(r302);
        7zN.A18(A002, C1u3.A4h, A0R);
        7zM.A1H(A002, migColorScheme);
        A013.A2e(A002);
        2cM A0K = 7zN.A0K(A013, r302, A012);
        A0K.A0g(1.0f);
        A0K.A0k(1.0f);
        A0K.A2h(c1rp);
        C26z c26z = C26z.HORIZONTAL;
        A0K.A25(c26z, f);
        2KD A003 = 2K3.A00(r302);
        A003.A2x(migColorScheme);
        String str2 = mediaResource.A0n;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        7zQ.A1W(A003, str2);
        A003.A2q(1);
        A003.A18(A04);
        A0K.A2d(A003);
        2KD A004 = 2K3.A00(r302);
        A004.A2x(migColorScheme);
        long j = mediaResource.A07;
        A004.A2z(j != 0 ? r0.A01((int) j) : "");
        A004.A2d();
        A004.A2n();
        A004.A2q(1);
        A0K.A2d(A004);
        A012.A2e(A0K);
        A00.A2f(A012);
        A01.A2d(A00);
        A01.A0g(1.0f);
        A01.A0l(62.0f);
        A01.A24(c26z, A03);
        A01.A0D(9DN.A00(r302.A0D, migColorScheme));
        return A01.A00;
    }
}
