package X;

/* loaded from: Lim.class */
public final class Lim implements Comparable {
    public final int A00;
    public final Kqx A01;

    public Lim(Kqx kqx, int i) {
        this.A00 = i;
        this.A01 = kqx;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        int i2 = this.A00;
        int i3 = ((Lim) obj).A00;
        if (i2 == i3) {
            i = 0;
        } else {
            i = 1;
            if (i2 < i3) {
                return -1;
            }
        }
        return i;
    }
}
