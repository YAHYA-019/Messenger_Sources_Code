package X;

/* loaded from: K15.class */
public abstract class K15 extends Lbf {
    public final long A00;

    public K15(6Yl r302, 6D7 r303, 6DQ r304, Object obj, int i, long j, long j2, long j3) {
        super(r302, r303, r304, obj, 1, i, j, j2);
        r302.getClass();
        this.A00 = j3;
    }

    public long A00() {
        long j;
        if (this instanceof K12) {
            j = ((K15) ((K12) this)).A00 + r0.A02;
        } else {
            long j2 = this.A00;
            j = -1;
            if (j2 != j) {
                return 1 + j2;
            }
        }
        return j;
    }

    public boolean A01() {
        return this instanceof K12 ? ((K12) this).A00 : ((K11) this).A00;
    }
}
