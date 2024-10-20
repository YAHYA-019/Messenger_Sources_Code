package X;

/* loaded from: F82.class */
public final class F82 {
    public 1G2 A00;
    public 1G2 A01;
    public 1G2 A02;
    public final C00i A03;

    public F82() {
        1G2 A01 = 1G3.A01(1G0.A04, "quality_selector/");
        this.A00 = A01;
        this.A02 = 1G3.A01(A01, "user_selected_quality_label_key_new");
        this.A01 = 1G3.A01(this.A00, "user_selected_quality_bar_shown_key");
        this.A03 = AbH.A0S();
    }

    public static final F82 A00() {
        return new F82();
    }

    public void A01(String str) {
        C00i c00i = this.A03;
        c00i.get();
        1Ql A0V = 1BL.A0V(c00i);
        A0V.CaL(this.A02, str);
        A0V.commit();
    }
}
