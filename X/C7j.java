package X;

/* loaded from: C7j.class */
public final class C7j {
    public final C5ww A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final String A03;

    public C7j(C5ww c5ww, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A00 = c5ww;
        C1pq.A08("key", str);
        this.A03 = str;
        this.A01 = charSequence;
        AbF.A1V(charSequence2);
        this.A02 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7j)) {
                return false;
            }
            C7j c7j = (C7j) obj;
            if (!11T.A0O(this.A00, c7j.A00) || !11T.A0O(this.A03, c7j.A03) || !11T.A0O(this.A01, c7j.A01) || !11T.A0O(this.A02, c7j.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A00)))) * 31;
    }
}
