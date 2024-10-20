package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.4mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mx.class */
public final class C08434mx extends 2K2 {
    public final double _value;

    public C08434mx(double d) {
        this._value = d;
    }

    public static C08434mx A00(double d) {
        return new C08434mx(d);
    }

    public double A02() {
        return this._value;
    }

    public int A04() {
        return (int) this._value;
    }

    public long A08() {
        return (long) this._value;
    }

    public Number A0G() {
        return Double.valueOf(this._value);
    }

    public String A0H() {
        double d = this._value;
        String[] strArr = 43N.A04;
        return Double.toString(d);
    }

    public BigDecimal A0J() {
        return BigDecimal.valueOf(this._value);
    }

    public BigInteger A0K() {
        return BigDecimal.valueOf(this._value).toBigInteger();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 > 2.147483647E9d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0Q() {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0._value
            r302 = r0
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L26
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            r307 = r0
            r0 = r302
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 <= 0) goto L29
        L26:
            r0 = 0
            r306 = r0
        L29:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08434mx.A0Q():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0d() {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0._value
            r302 = r0
            r0 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L26
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            r307 = r0
            r0 = r302
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 <= 0) goto L29
        L26:
            r0 = 0
            r306 = r0
        L29:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08434mx.A0d():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (java.lang.Double.isInfinite(r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0e() {
        /*
            r301 = this;
            r0 = r301
            double r0 = r0._value
            r302 = r0
            r0 = r302
            boolean r0 = java.lang.Double.isNaN(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1b
            r0 = r302
            boolean r0 = java.lang.Double.isInfinite(r0)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L1d
        L1b:
            r0 = 1
            r304 = r0
        L1d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08434mx.A0e():boolean");
    }

    public C42h AAi() {
        return C42h.A0A;
    }

    public C27n Bgt() {
        return C27n.DOUBLE;
    }

    public final void ClJ(28Q r302, C26c c26c) {
        r302.A0d(this._value);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null || !(obj instanceof C08434mx)) {
                return false;
            }
            if (Double.compare(this._value, ((C08434mx) obj)._value) != 0) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }
}
