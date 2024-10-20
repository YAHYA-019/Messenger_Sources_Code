package X;

/* renamed from: X.44m, reason: invalid class name */
/* loaded from: 44m.class */
public abstract class C44m implements Runnable, Comparable, C2a8, C44n {
    public static final String __redex_internal_original_name = "EventLoopImplBase$DelayedTask";
    public int A00;
    public long A01;
    public volatile Object _heap;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        long j = this.A01 - ((C44m) obj).A01;
        if (j > 0) {
            i = 1;
        } else {
            i = 0;
            if (j < 0) {
                return -1;
            }
        }
        return i;
    }

    @Override // X.C2a8
    public final void dispose() {
        synchronized (this) {
            Object obj = this._heap;
            0DJ r0 = C44g.A01;
            if (obj != r0) {
                if (obj instanceof C44o) {
                    C44o c44o = (C44o) obj;
                    if (c44o != null) {
                        synchronized (c44o) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof C44f) && ((C44f) obj2) != null) {
                                c44o.A03(this.A00);
                            }
                        }
                    }
                }
                this._heap = r0;
            }
        }
    }

    public String toString() {
        return 0Pz.A0Q("Delayed[nanos=", ']', this.A01);
    }
}
