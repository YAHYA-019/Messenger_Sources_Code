package X;

/* renamed from: X.141, reason: invalid class name */
/* loaded from: 141.class */
public final class AnonymousClass141 implements Comparable {
    public final long A00;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 11T.A01(this.A00 ^ Long.MIN_VALUE, ((AnonymousClass141) obj).A00 ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        boolean z = false;
        if ((obj instanceof AnonymousClass141) && j == ((AnonymousClass141) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return C13t.A01(this.A00, 10);
    }
}
