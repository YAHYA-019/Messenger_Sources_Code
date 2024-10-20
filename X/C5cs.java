package X;

/* renamed from: X.5cs, reason: invalid class name */
/* loaded from: 5cs.class */
public final class C5cs extends C04v {
    public final long A00;
    public final boolean A01;

    public C5cs(boolean z, long j) {
        this.A01 = z;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5cs)) {
                return false;
            }
            C5cs c5cs = (C5cs) obj;
            if (this.A01 != c5cs.A01 || this.A00 != c5cs.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + 1BL.A01(this.A00);
    }
}
