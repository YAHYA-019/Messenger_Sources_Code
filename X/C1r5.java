package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1r5, reason: invalid class name */
/* loaded from: 1r5.class */
public final class C1r5 {
    public static final 1G2 A06;
    public static final 1G2 A07;
    public ThreadLocal A00;
    public final C00i A01 = new 1BQ(67382);
    public final FbSharedPreferences A02;
    public final C1r8 A03;
    public final C1r6 A04;
    public final 1GS A05;

    static {
        1G2 A0D = 1G0.A05.A0D("contact_phone_book_utils/");
        A07 = A0D;
        A06 = A0D.A0D("phone_book_index_conversion");
    }

    public C1r5() {
        1GS r0 = (1GS) 1Bi.A03(16504);
        C1r6 c1r6 = (C1r6) 1Bi.A03(16829);
        C1r8 c1r8 = (C1r8) 1Bn.A0A(16830);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        this.A05 = r0;
        this.A04 = c1r6;
        this.A03 = c1r8;
        this.A02 = fbSharedPreferences;
        this.A00 = new 1rA(this);
    }
}
