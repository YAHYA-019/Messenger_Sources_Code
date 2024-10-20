package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.3ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ts.class */
public final class C02043ts extends 2K2 {
    public final long _value;

    public C02043ts(long j) {
        this._value = j;
    }

    public static C02043ts A00(long j) {
        return new C02043ts(j);
    }

    public double A02() {
        return this._value;
    }

    public int A04() {
        return (int) this._value;
    }

    public long A08() {
        return this._value;
    }

    public Number A0G() {
        return Long.valueOf(this._value);
    }

    public String A0H() {
        long j = this._value;
        String[] strArr = 43N.A04;
        return (j > 2147483647L || j < 2147483648L) ? Long.toString(j) : 43N.A08((int) j);
    }

    public BigDecimal A0J() {
        return BigDecimal.valueOf(this._value);
    }

    public BigInteger A0K() {
        return BigInteger.valueOf(this._value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0 > 2147483647L) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0Q() {
        /*
            r301 = this;
            r0 = r301
            long r0 = r0._value
            r302 = r0
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L26
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C02043ts.A0Q():boolean");
    }

    public boolean A0T() {
        return true;
    }

    public boolean A0b(boolean z) {
        return AnonymousClass001.A1N((this._value > 0L ? 1 : (this._value == 0L ? 0 : -1)));
    }

    public boolean A0d() {
        return true;
    }

    public C42h AAi() {
        return C42h.A0B;
    }

    public C27n Bgt() {
        return C27n.LONG;
    }

    public final void ClJ(28Q r302, C26c c26c) {
        r302.A0g(this._value);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null || !(obj instanceof C02043ts)) {
                return false;
            }
            if (((C02043ts) obj)._value != this._value) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        long j = this._value;
        return ((int) j) ^ ((int) (j >> 32));
    }
}
