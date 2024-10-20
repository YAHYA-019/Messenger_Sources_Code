package X;

/* renamed from: X.4V3, reason: invalid class name */
/* loaded from: 4V3.class */
public final class C4V3 {
    public final Long A00;
    public final String A01;

    public C4V3() {
        this.A01 = "";
        this.A00 = 0L;
    }

    public C4V3(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C4V3) {
                C4V3 c4v3 = (C4V3) obj;
                if (this.A01 == c4v3.A01 && this.A00 == c4v3.A00) {
                    z = true;
                }
            }
        }
        return z;
    }
}
