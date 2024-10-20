package X;

/* loaded from: Ifo.class */
public abstract class Ifo implements JMR {
    public final C47t A00;
    public final long A01;

    public Ifo(C47t c47t) {
        this.A00 = c47t;
        this.A01 = c47t.BHJ();
    }

    public void ADz(String str) {
        this.A00.BYH(str);
    }

    public void ARr(String str) {
        this.A00.ARr(str);
    }

    public long BGc() {
        return this.A01;
    }

    public void Bch(String str, String str2) {
        11T.A0F(str2, 1);
        this.A00.Bch(str, str2);
    }

    public void Bct(String str, String str2) {
        11T.A0F(str, 0);
        this.A00.Bct(str, str2);
    }

    public void Bcv(String str, String str2) {
        Bct(0Pz.A0W(str, "_end"), str2);
    }

    public void Bcw(String str, String str2) {
        Bct(0Pz.A0W(str, "_start"), null);
    }
}
