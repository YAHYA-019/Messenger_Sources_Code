package X;

/* loaded from: L3y.class */
public final class L3y {
    public static final MHv A02 = new LO5(M5v.A00, M8W.A00);
    public final long A00;
    public final Lie A01;

    public L3y(Lie lie, long j) {
        this.A01 = lie;
        int length = lie.A00.length();
        int A0C = JQz.A0C(j);
        int A022 = 07C.A02(A0C, 0, length);
        int A0I = JR0.A0I(j);
        int A023 = 07C.A02(A0I, 0, length);
        this.A00 = (A022 == A0C && A023 == A0I) ? j : KUx.A00(A022, A023);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof L3y)) {
                return false;
            }
            L3y l3y = (L3y) obj;
            if (this.A00 == l3y.A00 && 11T.A0O(this.A01, l3y.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextFieldValue(text='");
        A0k.append((Object) this.A01);
        A0k.append("', selection=");
        long j = this.A00;
        A0k.append((Object) 0Pz.A0b("TextRange(", ", ", ')', JQz.A0C(j), JR0.A0I(j)));
        DKG.A1X(A0k, ", composition=");
        return AnonymousClass001.A0g(A0k, ')');
    }
}
