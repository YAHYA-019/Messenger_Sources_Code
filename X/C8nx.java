package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.base.Platform;

/* renamed from: X.8nx, reason: invalid class name */
/* loaded from: 8nx.class */
public final class C8nx extends C1rj {
    public static final CallerContext A0B = CallerContext.A0B("ProfileHeaderComponentSpec");
    public DJY A00;
    public MigColorScheme A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public C8nx() {
        super("ProfileHeaderComponent");
        this.A07 = true;
        this.A09 = true;
        this.A0A = true;
    }

    public static 1Im A00(1Iw r301, String str) {
        return 1LI.A0C(r301, C8nx.class, "ProfileHeaderComponent", new Object[]{str}, 41825311);
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A02, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Boolean.valueOf(this.A09), this.A03, this.A04, this.A05, Boolean.valueOf(this.A0A), this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI A0K;
        String str = this.A03;
        MigColorScheme migColorScheme = this.A01;
        String str2 = this.A02;
        String str3 = this.A05;
        String str4 = this.A06;
        boolean z = this.A0A;
        boolean z2 = this.A07;
        boolean z3 = this.A09;
        boolean z4 = this.A08;
        2KD r314 = null;
        2cM A0j = 7zM.A0j(r302, 0);
        A0j.A0e();
        2cM A0i = 7zM.A0i(r302);
        A0i.A2b();
        A0i.A2H(2dP.A02);
        1Im r319 = null;
        if (str2 == null) {
            A0K = null;
        } else {
            5BH A01 = 5BG.A01(r302);
            C07004ik A00 = C06984ii.A00();
            7zV.A0g(r302.A0D, A00);
            C06984ii.A01(A01, A00);
            A01.A0c();
            A01.A0e();
            A01.A0l(128.0f);
            7zN.A1A(A01, str2);
            A01.A2b(A0B);
            if (z2) {
                r319 = A00(r302, 4YT.A00(125));
            }
            A01.A2T(r319);
            A01.A2Q(true);
            A01.A1J(2131954991);
            A0K = 7zL.A0K(A01);
        }
        A0i.A2e(A0K);
        boolean z5 = !Platform.stringIsNullOrEmpty(str2);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0c();
        A012.A27(C26z.END, 8.0f);
        C26z c26z = C26z.TOP;
        A012.A27(c26z, 2.0f);
        A012.A1D(12.0f);
        8Tl A002 = C5hr.A00(r302);
        A002.A01.A03 = z5;
        A002.A2Y(migColorScheme);
        7zL.A1J(A002);
        8Tl.A07(A012, A002);
        7zN.A1D(A012, r302, C8nx.class, "ProfileHeaderComponent", 1046174140);
        7zL.A1I(A0i, A012);
        5BH A013 = 5BG.A01(r302);
        C07004ik A0J = 7zR.A0J();
        ((C07014il) A0J).A03 = new C5em(C0A8.A00(r302.A0D, 4.0f), 0.0f, migColorScheme.Abp(), true);
        C06984ii.A01(A013, A0J);
        A013.A0z(108.0f);
        A013.A0l(108.0f);
        int i = 52;
        if (str2 != null) {
            i = 74;
        }
        A013.A24(c26z, i);
        C26z c26z2 = C26z.BOTTOM;
        A013.A24(c26z2, 2.0f);
        7zN.A1A(A013, str3);
        A013.A2b(A0B);
        A013.A2T(z3 ? A00(r302, "profile_picture") : null);
        A013.A2Q(true);
        A013.A1J(2131954998);
        A0i.A2e(7zL.A0K(A013));
        A0j.A2d(A0i);
        2KD A0f = 7zR.A0f(r302, str, false);
        7zU.A1U(A0f);
        A0f.A2q(2);
        A0f.A2T(z4 ? A00(r302, "profile_name") : null);
        int i2 = 0;
        if (z) {
            i2 = 16843534;
        }
        A0f.A1G(i2);
        A0f.A2x(migColorScheme);
        A0f.A0e();
        A0f.A2X();
        A0f.A1C(8.0f);
        A0f.A25(c26z, 8.0f);
        float f = 0.0f;
        if (str4 == null) {
            f = 8.0f;
        }
        A0f.A25(c26z2, f);
        A0j.A2d(A0f);
        if (str4 != null) {
            r314 = 7zN.A0Y(r302, false);
            7zQ.A1T(r314, str4);
            r314.A2q(2);
            r314.A2x(migColorScheme);
            r314.A0e();
            r314.A2X();
            r314.A1C(8.0f);
            r314.A25(c26z, 0.0f);
            r314.A25(c26z2, 8.0f);
        }
        return 7zL.A0U(A0j, r314);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 41825311) {
            if (i != 1046174140) {
                return null;
            }
            ((C8nx) r302.A00.A01).A00.Bu9("close_button");
            return null;
        }
        1Is r0 = r302.A00.A01;
        String str = (String) 7zN.A0o(r302);
        C8nx c8nx = (C8nx) r0;
        c8nx.A00.BpC((ParcelableSecondaryData) null, c8nx.A04, str);
        return null;
    }
}
