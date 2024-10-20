package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;
import java.util.List;

/* renamed from: X.8lr, reason: invalid class name */
/* loaded from: 8lr.class */
public final class C8lr extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("LandingPageHeaderComponentSpec");
    public 9tT A00;
    public MigColorScheme A01;

    public C8lr() {
        super("LandingPageHeaderComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cq c2cq;
        C1rh c1rh;
        C1rh c1rh2;
        C1rh c1rh3;
        C1rh c1rh4;
        C1rh c1rh5;
        9tT r0 = this.A00;
        MigColorScheme migColorScheme = this.A01;
        boolean A1X = 1BL.A1X(r302, r0);
        C1u2 A0G = 7zS.A0G(migColorScheme, 2);
        1Bn.A0A(114730);
        7XR r02 = (7XR) 1Bn.A0A(67697);
        C1rq A0Q = 7zN.A0Q(r302, 0);
        A0Q.A1D(4YU.A00(2RH.A06));
        C2qg c2qg = C2qg.A0C;
        C2qh c2qh = new C2qh();
        c2qh.A02(47Q.A03);
        C2fd c2fd = C2fd.A0T;
        if (r0.A01) {
            c2fd = C2fd.A01;
            r02.A00(r0.A05, 0S2.A0N);
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0k(0.0f);
        A01.A15(16.0f);
        A01.A2c();
        C1ro c1ro = C1ro.FLEX_START;
        A01.A2g(c1ro);
        2qP A00 = 2qK.A00(r302, 0);
        A00.A1y(c1ro);
        try {
            Uri A03 = C0A2.A03(r0.A07);
            if (A03 != null) {
                A00.A2X(new 2qZ(A03, (UserKey) null, (PicSquare) null, 2qU.A05, (3xU) null, c2fd, (String) null, (String) null, 0, 0));
                2qK r03 = A00.A01;
                r03.A0F = A1X;
                r03.A0C = c2qh;
                r03.A02 = migColorScheme.BDl();
                Context context = r302.A0D;
                r03.A05 = C0A8.A00(7zM.A0B(context), 80.0f);
                A01.A2e(A00);
                7zL.A1M(A01, A0Q);
                C1rq A012 = C1rg.A01(r302, null, 0);
                A012.A0j(1.0f);
                2cM A013 = 2cK.A01(r302, (String) null, 0);
                C1rq A014 = C1rg.A01(r302, null, 0);
                C1rp c1rp = C1rp.FLEX_START;
                A014.A2i(c1rp);
                C1ro c1ro2 = C1ro.CENTER;
                A014.A2g(c1ro2);
                2KD A0Y = 7zN.A0Y(r302, false);
                A0Y.A2z(r0.A04);
                A0Y.A2m();
                A0Y.A2b();
                A0Y.A2x(migColorScheme);
                A014.A2e(A0Y);
                if (r0.A02) {
                    c2cq = C2cp.A00(r302, 0);
                    7zM.A1I(C1u3.A0j, A0G, c2cq, migColorScheme.AZc());
                    c2cq.A0l(28.0f);
                    c2cq.A0z(28.0f);
                    c2cq.A13(2.0f);
                    c2cq.A17(2.0f);
                    c2cq.A0k(0.0f);
                } else {
                    c2cq = null;
                }
                A014.A2e(c2cq);
                7zL.A1I(A013, A014);
                if (r0.A00) {
                    C1rq A015 = C1rg.A01(r302, null, 0);
                    A015.A0j(1.0f);
                    A015.A2i(c1rp);
                    A015.A2g(c1ro2);
                    2KD A0Y2 = 7zN.A0Y(r302, false);
                    A0Y2.A2z(context.getString(2131952657));
                    A0Y2.A2k();
                    A0Y2.A2b();
                    A0Y2.A2x(migColorScheme);
                    c1rh = 7zL.A0c(A0Y2, A015);
                } else {
                    String str = r0.A09;
                    if (str == null || str.length() == 0) {
                        c1rh = null;
                    } else {
                        C1rq A016 = C1rg.A01(r302, null, 0);
                        A016.A0j(1.0f);
                        A016.A17(4.0f);
                        A016.A2i(c1rp);
                        A016.A2g(c1ro2);
                        String str2 = r0.A08;
                        if (str2 == null || str2.length() == 0) {
                            c1rh2 = null;
                        } else {
                            C1uv c1uv = C1uu.A03;
                            ColorFilter A002 = C1uv.A00(migColorScheme.AYz());
                            C07004ik A0I = 7zR.A0I();
                            A0I.A05 = A002;
                            C06974ih A0L = 7zL.A0L(A0I);
                            5BH A017 = 5BG.A01(r302);
                            Uri uri = null;
                            try {
                                uri = C0A2.A03(str2);
                            } catch (SecurityException unused) {
                            }
                            A017.A2X(uri);
                            A017.A2b(A02);
                            A017.A2Z(A0L);
                            A017.A0z(16.0f);
                            A017.A0l(16.0f);
                            C1rq A018 = C1rg.A01(r302, null, 0);
                            A018.A0j(0.0f);
                            A018.A15(4.0f);
                            A018.A2c();
                            A018.A2g(c1ro2);
                            c1rh2 = 7zL.A0c(A017, A018);
                        }
                        A016.A2f(c1rh2);
                        C1rq A019 = C1rg.A01(r302, null, 0);
                        A019.A0j(1.0f);
                        A019.A2i(c1rp);
                        A019.A2g(c1ro2);
                        2KD A0f = 7zR.A0f(r302, str, false);
                        A0f.A2k();
                        A0f.A2b();
                        A0f.A2x(migColorScheme);
                        A019.A2e(A0f);
                        7zL.A1M(A019, A016);
                        c1rh = A016.A00;
                    }
                }
                A013.A2e(c1rh);
                String str3 = r0.A03;
                if (str3 == null || str3.length() == 0) {
                    c1rh3 = null;
                } else {
                    C1rq A0110 = C1rg.A01(r302, null, 0);
                    A0110.A2i(c1rp);
                    A0110.A2g(c1ro2);
                    A0110.A17(4.0f);
                    2KD A0f2 = 7zR.A0f(r302, str3, false);
                    A0f2.A2k();
                    A0f2.A2b();
                    A0f2.A2x(migColorScheme);
                    c1rh3 = 7zL.A0c(A0f2, A0110);
                }
                A013.A2e(c1rh3);
                String str4 = r0.A06;
                if (str4 == null || str4.length() == 0) {
                    c1rh4 = null;
                } else {
                    C1rq A0111 = C1rg.A01(r302, null, 0);
                    A0111.A2i(c1rp);
                    A0111.A2g(c1ro2);
                    A0111.A17(8.0f);
                    2KD A0f3 = 7zR.A0f(r302, str4, false);
                    A0f3.A2k();
                    A0f3.A2d();
                    A0f3.A2x(migColorScheme);
                    A0f3.A2q(2);
                    c1rh4 = 7zL.A0c(A0f3, A0111);
                }
                A013.A2e(c1rh4);
                List list = r0.A0A;
                if (1BK.A1Y(list) == A1X) {
                    C1rq A0112 = C1rg.A01(r302, null, 0);
                    5fH A003 = 5fG.A00(r302);
                    A003.A2Z(context.getString(2131955323, AnonymousClass001.A1a(list.size())));
                    4YU.A1N(A003, 2RH.A04);
                    A003.A2Y(migColorScheme);
                    A003.A01.A02 = C9py.A03(list, 25);
                    c1rh5 = 7zL.A0d(A003.A2W(), A0112);
                } else {
                    c1rh5 = null;
                }
                A013.A2e(c1rh5);
                A012.A2e(A013);
                7zL.A1M(A012, A0Q);
                C6nh c6nh = new C6nh(r302);
                C26z c26z = C26z.BOTTOM;
                c6nh.A07(c26z, 1.0f);
                c6nh.A08(c26z, migColorScheme.Atp());
                A0Q.A1h(c6nh.A01());
                return A0Q.A00;
            }
        } catch (SecurityException unused2) {
        }
        throw 1BK.A0h();
    }
}
