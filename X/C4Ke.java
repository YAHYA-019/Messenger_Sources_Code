package X;

import java.util.Set;

/* renamed from: X.4Ke, reason: invalid class name */
/* loaded from: 4Ke.class */
public final class C4Ke {
    public static final C4Ke A08;
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    static {
        long j = -1;
        A08 = new C4Ke(0S2.A00, C0uA.A00, j, j, false, false, false, false);
    }

    public C4Ke(C4Ke c4Ke) {
        11T.A0F(c4Ke, 1);
        this.A05 = c4Ke.A05;
        this.A06 = c4Ke.A06;
        this.A02 = c4Ke.A02;
        this.A04 = c4Ke.A04;
        this.A07 = c4Ke.A07;
        this.A03 = c4Ke.A03;
        this.A01 = c4Ke.A01;
        this.A00 = c4Ke.A00;
    }

    public C4Ke(Integer num, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(num, 1);
        11T.A0F(set, 8);
        this.A02 = num;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = set;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && 11T.A0O(getClass(), obj.getClass())) {
                C4Ke c4Ke = (C4Ke) obj;
                if (this.A05 == c4Ke.A05 && this.A06 == c4Ke.A06 && this.A04 == c4Ke.A04 && this.A07 == c4Ke.A07 && this.A01 == c4Ke.A01 && this.A00 == c4Ke.A00 && this.A02 == c4Ke.A02) {
                    z = 11T.A0O(this.A03, c4Ke.A03);
                }
            }
        }
        return z;
    }

    public int hashCode() {
        Integer num = this.A02;
        return AnonymousClass002.A02(this.A00, AnonymousClass002.A02(this.A01, (((((((C3o5.A05(num, C4S5.A00(num)) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31)) + this.A03.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Constraints{requiredNetworkType=");
        Integer num = this.A02;
        A0k.append(num != null ? C4S5.A00(num) : "null");
        A0k.append(", requiresCharging=");
        A0k.append(this.A05);
        A0k.append(", requiresDeviceIdle=");
        A0k.append(this.A06);
        A0k.append(", requiresBatteryNotLow=");
        A0k.append(this.A04);
        A0k.append(", requiresStorageNotLow=");
        A0k.append(this.A07);
        A0k.append(", contentTriggerUpdateDelayMillis=");
        A0k.append(this.A01);
        A0k.append(", contentTriggerMaxDelayMillis=");
        A0k.append(this.A00);
        A0k.append(", contentUriTriggers=");
        A0k.append(this.A03);
        return AnonymousClass001.A0d(", }", A0k);
    }
}
