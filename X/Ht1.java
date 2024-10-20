package X;

import java.util.Arrays;
import java.util.List;

/* loaded from: Ht1.class */
public final class Ht1 {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final H9z A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public Ht1(H9z h9z, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = h9z;
        this.A0D = str;
        this.A04 = i;
        this.A05 = i2;
        this.A0B = str2;
        this.A0K = z;
        this.A08 = str3;
        this.A0C = str4;
        this.A0A = str5;
        this.A0E = list;
        this.A0H = list2;
        this.A0G = list3;
        this.A0I = list4;
        this.A0J = z2;
        this.A07 = num;
        this.A00 = z3;
        this.A01 = z4;
        this.A0L = z5;
        this.A0M = z6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0F = list5;
        this.A09 = str6;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Ht1)) {
                return false;
            }
            Ht1 ht1 = (Ht1) obj;
            if (this.A06 == ht1.A06 && 0CV.A0a(this.A0D, ht1.A0D, false) && this.A04 == ht1.A04 && this.A05 == ht1.A05 && this.A0K == ht1.A0K && 11T.A0O(this.A0B, ht1.A0B) && 11T.A0O(this.A08, ht1.A08) && 11T.A0O(this.A0C, ht1.A0C) && 11T.A0O(this.A0E, ht1.A0E) && 11T.A0O(this.A0H, ht1.A0H) && 11T.A0O(this.A0G, ht1.A0G) && 11T.A0O(this.A0I, ht1.A0I) && 11T.A0O(this.A07, ht1.A07) && this.A00 == ht1.A00 && this.A01 == ht1.A01 && this.A0L == ht1.A0L && this.A0M == ht1.A0M && this.A02 == ht1.A02 && this.A03 == ht1.A03 && this.A0J == ht1.A0J && 11T.A0O(this.A09, ht1.A09)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A0D, null, null, Integer.valueOf(this.A04), Integer.valueOf(this.A05), this.A0B, Boolean.valueOf(this.A0K), this.A08, this.A0C, null, null, this.A0E, this.A0H, this.A0G, this.A0I, Boolean.valueOf(this.A0J), this.A07, Boolean.valueOf(this.A00), AnonymousClass001.A0K(), Boolean.valueOf(this.A01), Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0M), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A09});
    }
}
