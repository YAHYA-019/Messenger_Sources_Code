package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8m1, reason: invalid class name */
/* loaded from: 8m1.class */
public final class C8m1 extends C1rj {
    public static final C06974ih A04;
    public static final C06974ih A05;
    public C9xg A00;
    public MigColorScheme A01;
    public static final CallerContext A03 = CallerContext.A0B("FallbackXMAPreviewComponentSpec");
    public static final int A02 = 7zL.A02();

    static {
        C07004ik A00 = C06984ii.A00();
        ((C07014il) A00).A04 = 5BJ.A01(45.0f, 0.0f, 0.0f, 45.0f);
        A00.A01(2132345116);
        A04 = 7zL.A0L(A00);
        C07004ik A002 = C06984ii.A00();
        ((C07014il) A002).A04 = 5BJ.A01(45.0f, 45.0f, 45.0f, 45.0f);
        A002.A01(2132345116);
        A05 = 7zL.A0L(A002);
    }

    public C8m1() {
        super("FallbackXMAPreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        String str2;
        String str3;
        5BG r308;
        2KD A01;
        2KD A012;
        C9xg c9xg = this.A00;
        MigColorScheme migColorScheme = this.A01;
        11T.A0F(r302, 0);
        1BL.A1F(c9xg, migColorScheme);
        String str4 = c9xg.A04;
        boolean z = false;
        if ((str4 == null || str4.length() == 0) && (((str = c9xg.A03) == null || str.length() == 0) && (((str2 = c9xg.A02) == null || str2.length() == 0) && ((str3 = c9xg.A01) == null || str3.length() == 0)))) {
            z = true;
        }
        2KD r309 = null;
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A0Q();
        C26z c26z = C26z.HORIZONTAL;
        float f = A02;
        A013.A24(c26z, f);
        if (1iQ.A00()) {
            5BH A014 = 5BG.A01(r302);
            A014.A0z(80.0f);
            A014.A2X(c9xg.A00);
            A014.A2Z(z ? A05 : A04);
            r308 = 7zO.A0P(A014, A03);
        } else {
            C5bd A00 = C5bc.A00(r302);
            A00.A0z(80.0f);
            A00.A2W(c9xg.A00);
            A00.A00.A04 = z ? A05 : A04;
            A00.A2X(A03);
            A00.A0J();
            r308 = A00.A00;
        }
        11T.A0D(r308);
        A013.A2f(r308);
        if (!z) {
            2cM A015 = 2cK.A01(r302, (String) null, 0);
            A015.A25(c26z, f);
            A015.A2c();
            if (str4 == null) {
                A01 = null;
            } else {
                A01 = 2K3.A01(r302, 0);
                A01.A2z(str4);
                7zN.A1Y(A01);
                A01.A2x(migColorScheme);
                A01.A2q(1);
                A01.A2Z();
            }
            A015.A2d(A01);
            String str5 = c9xg.A03;
            if (str5 == null) {
                A012 = null;
            } else {
                A012 = 2K3.A01(r302, 0);
                A012.A32(false);
                7zQ.A1S(A012, str5);
                A012.A2x(migColorScheme);
                A012.A2q(3);
                A012.A2Z();
            }
            A015.A2d(A012);
            String str6 = c9xg.A02;
            if (str6 != null) {
                r309 = 7zN.A0Y(r302, false);
                7zQ.A1S(r309, str6);
                r309.A2x(migColorScheme);
                r309.A2q(1);
                r309.A2Z();
            }
            r309 = 7zL.A0U(A015, r309);
        }
        A013.A2f(r309);
        if (z) {
            A013.A2c();
        } else {
            A013.A0D(9DN.A00(7zL.A0A(r302), migColorScheme));
        }
        return A013.A00;
    }
}
