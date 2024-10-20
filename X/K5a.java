package X;

import sun.misc.Unsafe;

/* loaded from: K5a.class */
public final class K5a extends Ktw {
    public K5a(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.Ktw
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    @Override // X.Ktw
    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    @Override // X.Ktw
    public final void A02(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // X.Ktw
    public final void A03(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }
}
