package X;

/* loaded from: Ewn.class */
public final class Ewn {
    public final C00i A00 = AbH.A0M();
    public final RQi A01 = new RQi("pay");
    public final RQi A02 = new RQi("post_pay");

    public void A00() {
        Qul qul;
        RQi rQi = this.A02;
        Qul qul2 = rQi.A00;
        if (qul2 == Qul.A01 || qul2 == (qul = Qul.A03)) {
            return;
        }
        rQi.A00 = qul;
        1BK.A0U(this.A00).markerPoint(23265283, rQi.A00());
    }

    public void A01() {
        RQi rQi = this.A02;
        rQi.A00 = Qul.A02;
        1BK.A0U(this.A00).markerPoint(23265283, rQi.A00());
    }
}
