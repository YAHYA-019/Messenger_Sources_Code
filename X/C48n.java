package X;

import java.util.Arrays;

/* renamed from: X.48n, reason: invalid class name */
/* loaded from: 48n.class */
public abstract class C48n {
    public static final C48o A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.48o] */
    static {
        final long j = 36315108128858581L;
        A00 = new Object(j) { // from class: X.48o
            public final long A00;

            {
                this.A00 = j;
            }

            public boolean equals(Object obj) {
                boolean z = true;
                if (this != obj) {
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    if (this.A00 != ((C48o) obj).A00) {
                        z = false;
                    }
                }
                return z;
            }

            public int hashCode() {
                return Arrays.hashCode(1BK.A1Z(this.A00));
            }
        };
    }
}
