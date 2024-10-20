package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dym.class */
public final class Dym extends C1rj {
    public static final CallerContext A03 = CallerContext.A0B("MontageViewerWarningScreenComponentSpec");
    public GL2 A00;
    public HU6 A01;
    public MigColorScheme A02;

    public Dym() {
        super("MontageViewerWarningScreenComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2JY A0B;
        String A0r;
        MontageMetadata montageMetadata;
        2JY A0B2;
        String A0r2;
        MontageMetadata montageMetadata2;
        String str;
        MontageMetadata montageMetadata3;
        IXN ixn = this.A00;
        MigColorScheme migColorScheme = this.A02;
        11T.A0G(r302, 0, migColorScheme);
        1Br A0U = 7zM.A0U();
        1Br A00 = 1Bq.A00(99791);
        if (ixn == null) {
            return null;
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.CENTER;
        A01.A1y(c1ro);
        A01.A2g(c1ro);
        A01.A10(100.0f);
        A01.A0m(100.0f);
        MontageCard montageCard = ixn.A01;
        A01.A0D(F3E.A00((montageCard == null || (montageMetadata3 = montageCard.A0A) == null) ? null : montageMetadata3.A03));
        A01.A1J(2131952137);
        Eio eio = (Eio) A00.get();
        Hsm Avt = ixn.Avt();
        5BG r303 = null;
        if (Avt != null && (str = Avt.A04) != null) {
            try {
                Uri A032 = C0A2.A03(str);
                if (A032 != null) {
                    2IA A012 = 2IA.A01(A032);
                    A012.A0C = eio.A00;
                    5Q7 r0 = new 5Q7();
                    ((2rA) r0).A08 = true;
                    ((2rA) r0).A0A = true;
                    A012.A04 = new C06804hy(r0);
                    A012.A0I = true;
                    2Dp A04 = A012.A04();
                    5BH A013 = 5BG.A01(r302);
                    A013.A10(100.0f);
                    A013.A0m(100.0f);
                    A013.A2a(5BL.A01(A04));
                    A013.A2b(A03);
                    A013.A0J();
                    r303 = A013.A00;
                }
            } catch (SecurityException unused) {
            }
        }
        A01.A2e(r303);
        C4Eb c4Eb = (montageCard == null || (montageMetadata2 = montageCard.A0A) == null) ? null : montageMetadata2.A06;
        2K3 r3032 = null;
        if (c4Eb != null && (A0B2 = 1BK.A0B(c4Eb, 2JX.class, -1881759102, -750386191)) != null && (A0r2 = A0B2.A0r(-1038316416)) != null) {
            2KD A0f = 7zR.A0f(r302, A0r2, false);
            A0f.A0c();
            A0f.A28(C26z.TOP, 50.0f);
            A0f.A2F(C26z.LEFT, 2132279384);
            A0f.A2F(C26z.RIGHT, 2132279384);
            A0f.A1y(c1ro);
            A0f.A2X();
            A0f.A2l();
            A0f.A2b();
            A0f.A01.A00 = A0f.A02.A03(3.0f);
            r3032 = 7zN.A0Z(migColorScheme, A0f);
        }
        A01.A2e(r3032);
        C1u2 c1u2 = (C1u2) A0U.get();
        C4Eb c4Eb2 = (montageCard == null || (montageMetadata = montageCard.A0A) == null) ? null : montageMetadata.A06;
        2cL r3033 = null;
        if (c4Eb2 != null && (A0B = 1BK.A0B(c4Eb2, 2JX.class, -1881759102, -750386191)) != null && (A0r = A0B.A0r(146300310)) != null) {
            2cM A014 = 2cK.A01(r302, (String) null, 0);
            C2cm A002 = C2cl.A00(r302);
            A002.A2a(c1u2.A03(C1u3.A2c));
            A002.A2X(-1);
            A002.A0J();
            A014.A2e(A002.A00);
            2KD A0f2 = 7zR.A0f(r302, A0r, false);
            A0f2.A1y(c1ro);
            A0f2.A2X();
            A0f2.A2h();
            A0f2.A2b();
            A0f2.A2x(migColorScheme);
            4YU.A1K(A014, A0f2);
            A014.A0c();
            A014.A2F(C26z.BOTTOM, 2132279369);
            A014.A2F(C26z.LEFT, 2132279387);
            A014.A2F(C26z.RIGHT, 2132279387);
            A014.A2g(c1ro);
            A014.A1y(c1ro);
            A014.A2h(C1rp.FLEX_END);
            7zN.A1C(A014, r302, Dym.class, "MontageViewerWarningScreenComponent");
            r3033 = A014.A00;
        }
        return 7zL.A0V(A01, r3033);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        HU6 hu6 = ((Dym) r302.A00.A01).A01;
        11T.A0F(hu6, 1);
        Goo goo = hu6.A00;
        goo.A00 = true;
        goo.A06();
        return null;
    }
}
