package X;

/* loaded from: K8s.class */
public final class K8s extends KRp {
    public final int A00;
    public final long A01;

    public K8s(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof KRp)) {
                return false;
            }
            K8s k8s = (K8s) ((KRp) obj);
            if (this.A00 != k8s.A00 || this.A01 != k8s.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 ^ 1000003;
        long j = this.A01;
        return (i * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return 0Pz.A0r("EventRecord{eventType=", ", eventTimestamp=", "}", this.A00, this.A01);
    }
}
