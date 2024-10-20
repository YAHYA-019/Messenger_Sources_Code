package X;

/* renamed from: X.Ary, reason: case insensitive filesystem */
/* loaded from: Ary.class */
public final class C1764Ary extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public C1764Ary(String str, String str2, int i, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1764Ary)) {
                return false;
            }
            C1764Ary c1764Ary = (C1764Ary) obj;
            if (this.A02 != c1764Ary.A02 || this.A01 != c1764Ary.A01 || !11T.A0O(this.A03, c1764Ary.A03) || !11T.A0O(this.A04, c1764Ary.A04) || this.A00 != c1764Ary.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A02;
        return AnonymousClass002.A07(this.A04, (AnonymousClass002.A02(this.A01, ((int) (j ^ (j >>> 32))) * 31) + 1BL.A05(this.A03)) * 31) + this.A00;
    }
}
