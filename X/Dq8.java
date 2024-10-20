package X;

/* loaded from: Dq8.class */
public final class Dq8 extends C04v {
    public final int A00;
    public final 2MQ A01;
    public final DLQ A02;
    public final GJj A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public Dq8(2MQ r302, DLQ dlq, GJj gJj, String str, String str2, int i, boolean z) {
        this.A02 = dlq;
        this.A01 = r302;
        this.A05 = str;
        this.A03 = gJj;
        this.A06 = z;
        this.A04 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq8)) {
                return false;
            }
            Dq8 dq8 = (Dq8) obj;
            if (!11T.A0O(this.A02, dq8.A02) || this.A01 != dq8.A01 || !11T.A0O(this.A05, dq8.A05) || !11T.A0O(this.A03, dq8.A03) || this.A06 != dq8.A06 || !11T.A0O(this.A04, dq8.A04) || this.A00 != dq8.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((1BL.A03(this.A02) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + 7zN.A05(this.A04)) * 31) + this.A00;
    }
}
