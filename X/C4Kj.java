package X;

/* renamed from: X.4Kj, reason: invalid class name */
/* loaded from: 4Kj.class */
public final class C4Kj {
    public final int A00;
    public final int A01;
    public final String A02;

    public C4Kj(String str, int i, int i2) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4Kj)) {
                return false;
            }
            C4Kj c4Kj = (C4Kj) obj;
            if (!11T.A0O(this.A02, c4Kj.A02) || this.A00 != c4Kj.A00 || this.A01 != c4Kj.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SystemIdInfo(workSpecId=");
        A0k.append(this.A02);
        A0k.append(", generation=");
        A0k.append(this.A00);
        A0k.append(", systemId=");
        A0k.append(this.A01);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
