package X;

import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: L7x.class */
public abstract class L7x {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (android.text.TextUtils.isEmpty((java.lang.String) r301) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [int] */
    /* JADX WARN: Type inference failed for: r0v121, types: [int] */
    /* JADX WARN: Type inference failed for: r0v125, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A00(java.lang.Object r301, int r302) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L7x.A00(java.lang.Object, int):java.lang.String");
    }

    public static String A01(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        return A00(abstractMap, 0);
    }

    public void A02(L7x l7x) {
        java.util.Map map;
        java.util.Map map2;
        if (this instanceof K1l) {
            K1l k1l = (K1l) this;
            K1l k1l2 = (K1l) l7x;
            if (!TextUtils.isEmpty(k1l.A01)) {
                k1l2.A01 = k1l.A01;
            }
            if (!TextUtils.isEmpty(k1l.A02)) {
                k1l2.A02 = k1l.A02;
            }
            if (!TextUtils.isEmpty(k1l.A03)) {
                k1l2.A03 = k1l.A03;
            }
            if (!TextUtils.isEmpty(k1l.A04)) {
                k1l2.A04 = k1l.A04;
            }
            boolean z = true;
            if (k1l.A06) {
                k1l2.A06 = true;
            }
            if (!TextUtils.isEmpty(k1l.A05)) {
                k1l2.A05 = k1l.A05;
            }
            boolean z2 = k1l.A07;
            if (z2) {
                k1l2.A07 = z2;
            }
            double d = k1l.A00;
            if (d != 0.0d) {
                if (d < 0.0d || d > 100.0d) {
                    z = false;
                }
                AbstractC00481b7.A08(z, "Sample rate must be between 0% and 100%");
                k1l2.A00 = d;
                return;
            }
            return;
        }
        if (this instanceof K1e) {
            K1e k1e = (K1e) this;
            K1e k1e2 = (K1e) l7x;
            if (!TextUtils.isEmpty(k1e.A00)) {
                k1e2.A00 = k1e.A00;
            }
            boolean z3 = k1e.A01;
            if (z3) {
                k1e2.A01 = z3;
                return;
            }
            return;
        }
        if (this instanceof K1i) {
            K1i k1i = (K1i) this;
            K1i k1i2 = (K1i) l7x;
            if (!TextUtils.isEmpty(k1i.A01)) {
                k1i2.A01 = k1i.A01;
            }
            if (!TextUtils.isEmpty(k1i.A03)) {
                k1i2.A03 = k1i.A03;
            }
            if (!TextUtils.isEmpty(k1i.A02)) {
                k1i2.A02 = k1i.A02;
            }
            long j = k1i.A00;
            if (j != 0) {
                k1i2.A00 = j;
                return;
            }
            return;
        }
        if (this instanceof K1g) {
            K1g k1g = (K1g) this;
            K1g k1g2 = (K1g) l7x;
            k1g2.A01.addAll(k1g.A01);
            k1g2.A00.addAll(k1g.A00);
            Iterator A0y = AnonymousClass001.A0y(k1g.A02);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A0z.getKey();
                Iterator A1G = GOn.A1G(A0z.getValue());
                while (A1G.hasNext()) {
                    A1G.next();
                }
            }
            return;
        }
        if (this instanceof K1j) {
            K1j k1j = (K1j) this;
            K1j k1j2 = (K1j) l7x;
            int i = k1j.A00;
            if (i != 0) {
                k1j2.A00 = i;
            }
            int i2 = k1j.A01;
            if (i2 != 0) {
                k1j2.A01 = i2;
            }
            int i3 = k1j.A02;
            if (i3 != 0) {
                k1j2.A02 = i3;
            }
            int i4 = k1j.A03;
            if (i4 != 0) {
                k1j2.A03 = i4;
            }
            int i5 = k1j.A04;
            if (i5 != 0) {
                k1j2.A04 = i5;
            }
            if (TextUtils.isEmpty(k1j.A05)) {
                return;
            }
            k1j2.A05 = k1j.A05;
            return;
        }
        if (this instanceof K1d) {
            K1d k1d = (K1d) l7x;
            AbstractC00481b7.A02(k1d);
            map = k1d.A00;
            map2 = ((K1d) this).A00;
        } else if (this instanceof K1c) {
            map = ((K1c) l7x).A00;
            map2 = ((K1c) this).A00;
        } else {
            if (!(this instanceof K1b)) {
                if (this instanceof K1m) {
                    K1m k1m = (K1m) this;
                    K1m k1m2 = (K1m) l7x;
                    if (!TextUtils.isEmpty(k1m.A00)) {
                        k1m2.A00 = k1m.A00;
                    }
                    if (!TextUtils.isEmpty(k1m.A02)) {
                        k1m2.A02 = k1m.A02;
                    }
                    if (!TextUtils.isEmpty(k1m.A03)) {
                        k1m2.A03 = k1m.A03;
                    }
                    if (!TextUtils.isEmpty(k1m.A04)) {
                        k1m2.A04 = k1m.A04;
                    }
                    if (!TextUtils.isEmpty(k1m.A05)) {
                        k1m2.A05 = k1m.A05;
                    }
                    if (!TextUtils.isEmpty(k1m.A01)) {
                        k1m2.A01 = k1m.A01;
                    }
                    if (!TextUtils.isEmpty(k1m.A06)) {
                        k1m2.A06 = k1m.A06;
                    }
                    if (!TextUtils.isEmpty(k1m.A07)) {
                        k1m2.A07 = k1m.A07;
                    }
                    if (!TextUtils.isEmpty(k1m.A08)) {
                        k1m2.A08 = k1m.A08;
                    }
                    if (TextUtils.isEmpty(k1m.A09)) {
                        return;
                    }
                    k1m2.A09 = k1m.A09;
                    return;
                }
                if (this instanceof K1n) {
                    ((K1n) this).A03((K1n) l7x);
                    return;
                }
                if (this instanceof K1h) {
                    K1h k1h = (K1h) this;
                    K1h k1h2 = (K1h) l7x;
                    if (!TextUtils.isEmpty(k1h.A02)) {
                        k1h2.A02 = k1h.A02;
                    }
                    long j2 = k1h.A00;
                    if (j2 != 0) {
                        k1h2.A00 = j2;
                    }
                    if (!TextUtils.isEmpty(k1h.A01)) {
                        k1h2.A01 = k1h.A01;
                    }
                    if (TextUtils.isEmpty(k1h.A03)) {
                        return;
                    }
                    k1h2.A03 = k1h.A03;
                    return;
                }
                if (this instanceof K1f) {
                    K1f k1f = (K1f) this;
                    K1f k1f2 = (K1f) l7x;
                    if (!TextUtils.isEmpty(k1f.A00)) {
                        k1f2.A00 = k1f.A00;
                    }
                    if (!TextUtils.isEmpty(k1f.A01)) {
                        k1f2.A01 = k1f.A01;
                    }
                    if (TextUtils.isEmpty(k1f.A02)) {
                        return;
                    }
                    k1f2.A02 = k1f.A02;
                    return;
                }
                K1k k1k = (K1k) this;
                K1k k1k2 = (K1k) l7x;
                if (!TextUtils.isEmpty(k1k.A02)) {
                    k1k2.A02 = k1k.A02;
                }
                int i6 = k1k.A00;
                if (i6 != 0) {
                    k1k2.A00 = i6;
                }
                int i7 = k1k.A01;
                if (i7 != 0) {
                    k1k2.A01 = i7;
                }
                if (!TextUtils.isEmpty(k1k.A03)) {
                    k1k2.A03 = k1k.A03;
                }
                if (!TextUtils.isEmpty(k1k.A04)) {
                    String str = k1k.A04;
                    if (TextUtils.isEmpty(str)) {
                        str = null;
                    }
                    k1k2.A04 = str;
                }
                boolean z4 = k1k.A05;
                if (z4) {
                    k1k2.A05 = z4;
                }
                boolean z5 = k1k.A06;
                if (z5) {
                    k1k2.A06 = z5;
                    return;
                }
                return;
            }
            map = ((K1b) l7x).A00;
            map2 = ((K1b) this).A00;
        }
        map.putAll(map2);
    }
}
