package X;

/* renamed from: X.8sI, reason: invalid class name */
/* loaded from: 8sI.class */
public final class C8sI extends 99N {
    public final long A00;
    public final boolean A01;

    public C8sI(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8sI)) {
                return false;
            }
            C8sI c8sI = (C8sI) obj;
            if (this.A00 != c8sI.A00 || this.A01 != c8sI.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zQ.A02(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
