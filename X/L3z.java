package X;

/* loaded from: L3z.class */
public final class L3z {
    public static final L3z A02 = new L3z(KvS.A00(0), KvS.A00(0));
    public final long A00;
    public final long A01;

    public L3z(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L3z)) {
                return false;
            }
            long j = this.A00;
            L3z l3z = (L3z) obj;
            long j2 = l3z.A00;
            KsT[] ksTArr = LCI.A02;
            if (j != j2 || this.A01 != l3z.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        KsT[] ksTArr = LCI.A02;
        return AnonymousClass002.A03(this.A01, AnonymousClass002.A01(j));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextIndent(firstLine=");
        A0k.append((Object) LCI.A02(this.A00));
        A0k.append(", restLine=");
        return AnonymousClass002.A0K(LCI.A02(this.A01), A0k);
    }
}
