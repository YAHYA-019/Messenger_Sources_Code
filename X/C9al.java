package X;

/* renamed from: X.9al, reason: invalid class name */
/* loaded from: 9al.class */
public final class C9al {
    public final String A00;
    public final String A01;

    public C9al(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9al)) {
                return false;
            }
            C9al c9al = (C9al) obj;
            if (!11T.A0O(this.A00, c9al.A00) || !11T.A0O(this.A01, c9al.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }
}
