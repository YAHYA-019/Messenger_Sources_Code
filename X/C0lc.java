package X;

/* renamed from: X.0lc, reason: invalid class name */
/* loaded from: 0lc.class */
public final class C0lc implements Comparable {
    public final String A00;
    public final String A01;
    public final String[] A02;

    public C0lc(String str, String str2, String... strArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = strArr;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((C0lc) obj).A00);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof C0lc)) {
            z = this.A00.equals(((C0lc) obj).A00);
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
