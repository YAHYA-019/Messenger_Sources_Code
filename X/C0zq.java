package X;

/* renamed from: X.0zq, reason: invalid class name */
/* loaded from: 0zq.class */
public final class C0zq {
    public final String A00;
    public final 07E A01;

    public C0zq(String str, 07E r303) {
        this.A00 = str;
        this.A01 = r303;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0zq)) {
                return false;
            }
            C0zq c0zq = (C0zq) obj;
            if (!11T.A0O(this.A00, c0zq.A00) || !11T.A0O(this.A01, c0zq.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MatchGroup(value=");
        A0k.append(this.A00);
        A0k.append(", range=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
