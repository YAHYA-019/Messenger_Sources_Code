package X;

/* loaded from: Es2.class */
public final class Es2 {
    public final 1Br A00 = AbG.A0N();

    public final void A00(String str) {
        C1kw A08 = AbI.A08(this.A00);
        if (DTn.A00 == null) {
            synchronized (DTn.class) {
                if (DTn.A00 == null) {
                    DTn.A00 = new C2J3(A08);
                }
            }
        }
        DTn dTn = DTn.A00;
        AbstractC01593ro A3u = dTn.A00.A3u(AbstractC00603o4.A00(172), true);
        if (A3u.A0B()) {
            A3u.A06("pigeon_reserved_keyword_module", "confirmation");
            A3u.A06("error_message", str);
            A3u.A0A();
        }
    }
}
