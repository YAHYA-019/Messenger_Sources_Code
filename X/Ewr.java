package X;

/* loaded from: Ewr.class */
public abstract class Ewr {
    public final String A00;
    public final java.util.Map A02 = 1BK.A1C();
    public final java.util.Map A01 = 1BK.A1C();

    public Ewr(String str) {
        this.A00 = str;
    }

    public final void A00(String str, long j) {
        this.A02.put(0Pz.A0Y(this.A00, str, '_'), Long.valueOf(j));
    }

    public final void A01(String str, String str2) {
        this.A01.put(0Pz.A0Y(this.A00, str, '_'), str2);
    }
}
