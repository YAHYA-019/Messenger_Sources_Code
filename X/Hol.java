package X;

/* loaded from: Hol.class */
public final class Hol {
    public final IFI A00;
    public final IFI A02;
    public final Object A01 = AnonymousClass001.A0R();
    public volatile boolean A03 = false;

    public Hol(IFI ifi, int i) {
        this.A00 = ifi;
        this.A02 = ID2.A01(i);
    }

    public void A00() {
        Object obj = this.A01;
        synchronized (obj) {
            this.A03 = false;
            obj.notifyAll();
        }
        this.A00.A0A();
        this.A02.A0A();
    }
}
