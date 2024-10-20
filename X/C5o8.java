package X;

/* renamed from: X.5o8, reason: invalid class name */
/* loaded from: 5o8.class */
public final class C5o8 {
    public static final C5o9 A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5o9] */
    static {
        final boolean z = false;
        final long j = 0;
        A00 = new Object(z, j) { // from class: X.5o9
            public final boolean A00;
            public final long A01;

            {
                this.A00 = z;
                this.A01 = j;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (!(obj instanceof C5o9)) {
                        return false;
                    }
                    C5o9 c5o9 = (C5o9) obj;
                    if (this.A00 != c5o9.A00 || this.A01 != c5o9.A01) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return C1pq.A01(C1pq.A05(this.A00), this.A01);
            }
        };
    }
}
