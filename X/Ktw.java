package X;

import sun.misc.Unsafe;

/* loaded from: Ktw.class */
public abstract class Ktw {
    public final Unsafe A00;

    public Ktw(Unsafe unsafe) {
        this.A00 = unsafe;
    }

    public abstract double A00(Object obj, long j);

    public abstract float A01(Object obj, long j);

    public abstract void A02(Object obj, long j, double d);

    public abstract void A03(Object obj, long j, float f);
}
