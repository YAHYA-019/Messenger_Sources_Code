package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.8mk, reason: invalid class name */
/* loaded from: 8mk.class */
public final class C8mk extends C1rj {
    public static final CallerContext A09 = CallerContext.A0B("ProfileBottomSheetHeaderComponentSpec");
    public DJY A00;
    public MigColorScheme A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public C8mk() {
        super("ProfileBottomSheetHeaderComponent");
        this.A06 = true;
        this.A07 = true;
        this.A08 = true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A02, Boolean.valueOf(this.A06), Boolean.valueOf(this.A07), this.A03, this.A04, this.A05, Boolean.valueOf(this.A08), null};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A03;
        MigColorScheme migColorScheme = this.A01;
        String str2 = this.A02;
        String str3 = this.A05;
        5BG r309 = null;
        boolean z = this.A08;
        boolean z2 = this.A06;
        boolean z3 = this.A07;
        int A05 = 7zP.A05(r302, migColorScheme, 0);
        2cM A0j = 7zM.A0j(r302, 0);
        A0j.A0e();
        2cM A0i = 7zM.A0i(r302);
        A0i.A2b();
        A0i.A2H(2dP.A02);
        1Im r318 = null;
        if (str2 != null) {
            C07004ik A00 = C06984ii.A00();
            Context context = r302.A0D;
            7zV.A0g(context, A00);
            A00.A01(5YG.A00(context, 2MR.A1M));
            A00.A0L = true;
            C06974ih A0L = 7zL.A0L(A00);
            5BH A01 = 5BG.A01(r302);
            if (!0CU.A0O(str2)) {
                try {
                    r309 = C0A2.A03(str2);
                } catch (SecurityException unused) {
                }
            }
            A01.A2X(r309);
            A01.A10(94.0f);
            A01.A0l(128.0f);
            A01.A2Z(A0L);
            A01.A2b(A09);
            A01.A0c();
            A01.A1J(2131954991);
            if (z2) {
                r318 = 1LI.A0C(r302, C8mk.class, "ProfileBottomSheetHeaderComponent", new Object[]{4YT.A00(125)}, 41825311);
            }
            A01.A2T(r318);
            r309 = 7zL.A0K(A01);
        }
        A0i.A2e(r309);
        5BH A012 = 5BG.A01(r302);
        A012.A2b(A09);
        1Im r3182 = null;
        7zN.A1A(A012, str3);
        C07004ik A0J = 7zR.A0J();
        ((C07014il) A0J).A03 = new C5em(C0A8.A00(7zL.A0A(r302), 4.0f), 0.0f, migColorScheme.Abp(), true);
        C06984ii.A01(A012, A0J);
        A012.A0z(108.0f);
        A012.A0l(108.0f);
        C26z c26z = C26z.TOP;
        int i = 52;
        if (str2 != null) {
            i = 74;
        }
        A012.A24(c26z, i);
        C26z c26z2 = C26z.BOTTOM;
        A012.A24(c26z2, 2.0f);
        if (z3) {
            r3182 = 1LI.A0C(r302, C8mk.class, "ProfileBottomSheetHeaderComponent", new Object[]{"profile_picture"}, 41825311);
        }
        A012.A2T(r3182);
        A012.A2Q(true);
        A012.A1J(2131954998);
        A0i.A2e(7zL.A0K(A012));
        A0j.A2d(A0i);
        2KD A0f = 7zR.A0f(r302, str, false);
        7zU.A1U(A0f);
        A0f.A2q(A05);
        A0f.A2T(1LI.A0C(r302, C8mk.class, "ProfileBottomSheetHeaderComponent", new Object[]{"profile_name"}, 41825311));
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
        A0f.A25(c26z2, 8.0f);
        return 7zL.A0U(A0j, A0f);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 41825311) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        String str = (String) 7zN.A0o(r302);
        C8mk c8mk = (C8mk) r0;
        String str2 = c8mk.A04;
        DJY djy = c8mk.A00;
        11T.A0F(djy, 2);
        djy.BpC((ParcelableSecondaryData) null, str2, str);
        return null;
    }
}
