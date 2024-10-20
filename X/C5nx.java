package X;

/* renamed from: X.5nx, reason: invalid class name */
/* loaded from: 5nx.class */
public final class C5nx extends C04v {
    public static final C5nx A02 = new C5nx(null, null);
    public final String A00;
    public final String A01;

    public C5nx(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5nx)) {
                return false;
            }
            C5nx c5nx = (C5nx) obj;
            if (!11T.A0O(this.A00, c5nx.A00) || !11T.A0O(this.A01, c5nx.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
