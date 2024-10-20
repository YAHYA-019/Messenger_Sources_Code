package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.3Ma, reason: invalid class name */
/* loaded from: 3Ma.class */
public final class C3Ma {
    public final FbSharedPreferences A00 = 1BL.A0W();
    public final 1G2 A01;
    public final 1G2 A02;
    public final 1EZ A03;
    public final 1De A04;

    public C3Ma(1De r302) {
        this.A04 = r302;
        1EZ r0 = (1EZ) 1De.A00(r302, 16428);
        this.A03 = r0;
        String str = 1Fw.A04(r0).A02;
        1G2 r02 = C2bv.A0I;
        1G2 A01 = 1G3.A01(r02.A0D(0Pz.A0W(str, "/")), "already_showed_faq_banner");
        11T.A0A(A01);
        this.A02 = A01;
        1G2 A012 = 1G3.A01(r02.A0D(0Pz.A0W(str, "/")), "should_show_faq_banner");
        11T.A0A(A012);
        this.A01 = A012;
    }
}
