package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8mj, reason: invalid class name */
/* loaded from: 8mj.class */
public final class C8mj extends C1rj {
    public static final MigColorScheme A08 = LightColorScheme.A00();
    public static final Integer A09 = 80;
    public 1Im A00;
    public 2YJ A01;
    public C1326Ae4 A02;
    public 55A A03;
    public 55E A04;
    public MigColorScheme A05;
    public Integer A06;
    public boolean A07;

    public C8mj() {
        super("SearchHscrollUnitComponent");
        this.A05 = A08;
        this.A06 = A09;
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A07), this.A05, this.A00, this.A01, this.A02, this.A06, this.A03, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        55E r0 = this.A04;
        55A r02 = this.A03;
        1Im r03 = this.A00;
        MigColorScheme migColorScheme = this.A05;
        Integer num = this.A06;
        boolean z = this.A07;
        LightColorScheme.A00();
        r0.getClass();
        migColorScheme.getClass();
        9U3 r04 = new 9U3(r02, r0, migColorScheme, false, z);
        8Su A00 = C8lq.A00(r302);
        A00.A2X(r04);
        A00.A01.A00 = num.intValue();
        A00.A1B(6.0f);
        A00.A1G(2130971610);
        7zS.A1J(A00, r302, C8mj.class, "SearchHscrollUnitComponent");
        A00.A2T(r03);
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1932591986) {
            C8mj c8mj = (C8mj) r302.A00.A01;
            C1326Ae4 c1326Ae4 = c8mj.A02;
            2YJ r0 = c8mj.A01;
            if (r0 == null) {
                return null;
            }
            r0.A03(c1326Ae4);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        C8mj c8mj2 = (C8mj) r302.A00.A01;
        C1326Ae4 c1326Ae42 = c8mj2.A02;
        2YJ r02 = c8mj2.A01;
        if (r02 == null) {
            return null;
        }
        r02.A02(c1326Ae42);
        return null;
    }
}
