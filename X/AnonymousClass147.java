package X;

/* renamed from: X.147, reason: invalid class name */
/* loaded from: 147.class */
public final class AnonymousClass147 implements Comparable {
    public final int A00;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = (-1) << (-1);
        return 11T.A00(this.A00 ^ i, ((AnonymousClass147) obj).A00 ^ i);
    }

    public boolean equals(Object obj) {
        int i = this.A00;
        boolean z = false;
        if ((obj instanceof AnonymousClass147) && i == ((AnonymousClass147) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(this.A00 & 4294967295L);
    }
}
