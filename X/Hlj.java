package X;

/* loaded from: Hlj.class */
public final class Hlj {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(String str, int i, int i2, int i3) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(1015));
        0DA r0 = new 0DA();
        GOp.A1K(r0, i);
        r0.A06("total_pages", 1BK.A0l(i3));
        GOq.A1C(r0, i2);
        r0.A07("search_query", "");
        if (A08.isSampled()) {
            GOp.A1L(r0, A08, str);
            A08.A7R("product", "ranking");
            A08.BZL();
        }
    }
}
