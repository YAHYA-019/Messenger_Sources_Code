package X;

import sun.misc.Unsafe;

/* loaded from: K7j.class */
public final class K7j extends Kuk {
    public K7j(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.Kuk
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    @Override // X.Kuk
    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    @Override // X.Kuk
    public final void A02(Object obj, long j, byte b) {
        if (LEl.A01) {
            LEl.A0D(obj, j, b);
        } else {
            LEl.A0E(obj, j, b);
        }
    }

    @Override // X.Kuk
    public final void A03(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // X.Kuk
    public final void A04(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // X.Kuk
    public final void A05(Object obj, long j, boolean z) {
        if (LEl.A01) {
            LEl.A0L(obj, j, z);
        } else {
            LEl.A0M(obj, j, z);
        }
    }

    @Override // X.Kuk
    public final boolean A06(Object obj, long j) {
        return LEl.A01 ? LEl.A0S(obj, j) : LEl.A0T(obj, j);
    }
}
