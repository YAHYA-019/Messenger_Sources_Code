package X;

/* loaded from: Lil.class */
public final class Lil implements Comparable {
    public final int A00;
    public final Kqx A01;

    public Lil(Kqx kqx, int i) {
        this.A00 = i;
        this.A01 = kqx;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((Lil) obj).A00;
    }
}
