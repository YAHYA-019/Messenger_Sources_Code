package X;

/* loaded from: Hou.class */
public final class Hou {
    public String A00;
    public final C00i A01;
    public final 1Br A02 = 1BK.A0D();
    public final 1De A03;

    public Hou(1De r302) {
        this.A03 = r302;
        this.A01 = 7zM.A0h(r302, 115394);
    }

    public final void A00() {
        this.A00 = 1BK.A0t();
        1UG A08 = 1BK.A08(1Br.A02(this.A02), "rtc_active_drawer_open");
        if (A08.isSampled()) {
            String str = this.A00;
            if (str == null) {
                str = "";
            }
            A08.A7R("sid", str);
            A08.A0A("prefetch_decision");
            I5Y.A00(A08, this.A01);
        }
    }
}
