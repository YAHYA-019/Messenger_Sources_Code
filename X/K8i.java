package X;

/* loaded from: K8i.class */
public final class K8i extends KRo {
    public final String A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KRo) {
            return this.A00.equals(((K8i) ((KRo) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return 0Pz.A0j("IntegrityTokenResponse{token=", this.A00, "}");
    }
}
