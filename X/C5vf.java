package X;

/* renamed from: X.5vf, reason: invalid class name */
/* loaded from: 5vf.class */
public final class C5vf {
    public Integer A00;

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj == null || !(obj instanceof C5vf)) {
                return false;
            }
            if (((C5vf) obj).A00 != this.A00) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int intValue = this.A00.intValue();
        return 527 + (1 != intValue ? "NETWORK_FETCH" : "USE_CACHE_IF_POSSIBLE").hashCode() + intValue + 17;
    }
}
