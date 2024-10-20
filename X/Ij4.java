package X;

/* loaded from: Ij4.class */
public final class Ij4 implements JKX {
    public final /* synthetic */ Gtj A00;

    public Ij4(Gtj gtj) {
        this.A00 = gtj;
    }

    public HC9 B75() {
        return HC9.A09;
    }

    public void disable() {
        Gtj gtj = this.A00;
        synchronized (gtj) {
            Gtj.A00(gtj, false, null);
        }
    }

    public void enable() {
        Gtj gtj = this.A00;
        synchronized (gtj) {
            Gtj.A00(gtj, true, null);
        }
    }
}
