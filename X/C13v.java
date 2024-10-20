package X;

/* renamed from: X.13v, reason: invalid class name */
/* loaded from: 13v.class */
public final class C13v implements Comparable {
    public final short A00;

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        char c = (char) (-1);
        return 11T.A00(this.A00 & c, ((C13v) obj).A00 & c);
    }

    public boolean equals(Object obj) {
        short s = this.A00;
        boolean z = false;
        if ((obj instanceof C13v) && s == ((C13v) obj).A00) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        return String.valueOf(this.A00 & ((char) (-1)));
    }
}
