package X;

/* loaded from: Cut.class */
public final class Cut implements 7OX {
    public final String A00;
    public final /* synthetic */ BJO A01;

    public Cut(BJO bjo, String str) {
        11T.A0F(str, 2);
        this.A01 = bjo;
        this.A00 = str;
    }

    public void BNt() {
        BJO bjo = this.A01;
        java.util.Map map = bjo.A05;
        map.remove(this.A00);
        bjo.A05(AbM.A15(map));
    }

    public void CXr(6Kt r302) {
        11T.A0F(r302, 0);
        BJO bjo = this.A01;
        java.util.Map map = bjo.A05;
        map.put(this.A00, r302);
        bjo.A05(AbM.A15(map));
    }
}
