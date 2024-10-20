package X;

import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xh.class */
public final class C11794xh {
    public static volatile Integer A07;
    public static volatile Integer A08;
    public final 5DI A00;
    public final 5DI A01;
    public final ImmutableList A02;
    public final String A03;
    public final Integer A04;
    public final Integer A05;
    public final Set A06;

    public C11794xh(C11784xg c11784xg) {
        ImmutableList immutableList = c11784xg.A02;
        C1pq.A08("nonProxyHosts", immutableList);
        this.A02 = immutableList;
        this.A03 = c11784xg.A05;
        this.A00 = c11784xg.A00;
        this.A01 = c11784xg.A01;
        this.A04 = c11784xg.A03;
        this.A05 = c11784xg.A04;
        this.A06 = Collections.unmodifiableSet(c11784xg.A06);
    }

    private Integer A00() {
        if (this.A06.contains("scope")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 0S2.A00;
                }
            }
        }
        return A07;
    }

    private Integer A01() {
        if (this.A06.contains(Property.SYMBOL_Z_ORDER_SOURCE)) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = 0S2.A00;
                }
            }
        }
        return A08;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C11794xh)) {
                return false;
            }
            C11794xh c11794xh = (C11794xh) obj;
            if (!11T.A0O(this.A02, c11794xh.A02) || !11T.A0O(this.A03, c11794xh.A03) || !11T.A0O(this.A00, c11794xh.A00) || !11T.A0O(this.A01, c11794xh.A01) || A00() != c11794xh.A00() || A01() != c11794xh.A01()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02)))) * 31) + C3o5.A04(A00());
        Integer A01 = A01();
        if (A01 != null) {
            i = A01.intValue();
        }
        return (A04 * 31) + i;
    }
}
