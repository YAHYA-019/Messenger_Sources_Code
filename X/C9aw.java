package X;

/* renamed from: X.9aw, reason: invalid class name */
/* loaded from: 9aw.class */
public final class C9aw {
    public final int A00;
    public final String A01;

    public C9aw(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9aw)) {
                return false;
            }
            C9aw c9aw = (C9aw) obj;
            if (!11T.A0O(this.A01, c9aw.A01) || this.A00 != c9aw.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, Integer.valueOf(this.A00));
    }
}
