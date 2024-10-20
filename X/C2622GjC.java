package X;

/* renamed from: X.GjC, reason: case insensitive filesystem */
/* loaded from: GjC.class */
public final class C2622GjC extends C04v {
    public boolean A03 = false;
    public long A01 = 0;
    public long A02 = 0;
    public long A00 = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2622GjC)) {
                return false;
            }
            C2622GjC c2622GjC = (C2622GjC) obj;
            if (this.A03 != c2622GjC.A03 || this.A01 != c2622GjC.A01 || this.A02 != c2622GjC.A02 || this.A00 != c2622GjC.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A01, AnonymousClass002.A00(this.A03 ? 1 : 0) * 31));
        long j = this.A00;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BcfMemoryInfo(lowMemoryState=");
        A0k.append(this.A03);
        A0k.append(", deviceTotalMemoryBytes=");
        A0k.append(this.A01);
        A0k.append(", lowMemoryThresholdBytes=");
        A0k.append(this.A02);
        A0k.append(", availableMemoryBytes=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
