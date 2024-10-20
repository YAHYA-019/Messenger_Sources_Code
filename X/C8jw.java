package X;

/* renamed from: X.8jw, reason: invalid class name */
/* loaded from: 8jw.class */
public final class C8jw extends C1rj {
    public C8jw() {
        super("QuicksilverCloseToSButtonComponent");
    }

    public final Object[] A0k() {
        return 1LI.A0A;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C8Sa A00 = C8m7.A00(r302);
        A00.A2W(2132345587);
        A00.A2K("quicksilver_tos_close_button");
        7zN.A1D(A00, r302, C8jw.class, "QuicksilverCloseToSButtonComponent", -432198881);
        A00.A2S(r302.A0D.getString(2131967404));
        C1rs.A01(A00.A02, A00.A03);
        A00.A0J();
        return A00.A01;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        ETr eTr;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -432198881 || (eTr = (ETr) 1Hv.A02(r302.A00.A00.A0D, 98316)) == null) {
            return null;
        }
        eTr.A02("TOS Close Manually");
        return null;
    }
}
