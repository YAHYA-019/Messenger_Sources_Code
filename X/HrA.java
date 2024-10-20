package X;

/* loaded from: HrA.class */
public final class HrA {
    public final C1ko A00 = AbstractC2327GOs.A0M();

    public boolean A00(String str) {
        boolean A1W;
        synchronized (this) {
            A1W = AnonymousClass001.A1W(this.A00.Apt(str), H9Y.A01);
        }
        return A1W;
    }

    public boolean A01(String str) {
        boolean z;
        synchronized (this) {
            C1ko c1ko = this.A00;
            H9Y h9y = (H9Y) c1ko.Apt(str);
            if (h9y != H9Y.A02) {
                H9Y h9y2 = H9Y.A01;
                if (h9y != h9y2) {
                    c1ko.CZv(str, h9y2);
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }
}
