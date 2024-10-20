package X;

/* loaded from: E3o.class */
public final class E3o extends FIJ {
    public final 1Br A00;
    public final 1Br A01;
    public final GL7 A02;

    public E3o(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A02 = gl7;
        this.A01 = 1Bq.A00(16885);
        this.A00 = 1Bq.A00(67199);
    }

    public static final void A00(E3o e3o, String str, String str2, String str3) {
        1Rf A01 = 1RX.A01((1RX) 1Br.A0B(e3o.A00), 0S2.A00, "FBInstantGamesShareLinkAction", str, false);
        11T.A0A(A01);
        if (A01.A0D()) {
            A01.A08("share_message", str2);
            if (str3 != null) {
                A01.A08("package", str3);
            }
            A01.A0B();
        }
    }
}
