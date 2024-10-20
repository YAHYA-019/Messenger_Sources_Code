package X;

/* loaded from: Etb.class */
public final class Etb {
    public final GH4 A00;
    public volatile Object A01;

    public Etb(GH4 gh4) {
        this.A00 = gh4;
    }

    public Object A00() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    this.A01 = this.A00.get();
                }
            }
        }
        return this.A01;
    }
}
