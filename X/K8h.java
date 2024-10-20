package X;

/* loaded from: K8h.class */
public final class K8h extends KRn {
    public final String A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof KRn) && this.A00.equals(((K8h) ((KRn) obj)).A00));
    }

    public final int hashCode() {
        return (this.A00.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String str = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IntegrityTokenRequest{nonce=");
        A0k.append(str);
        A0k.append(", cloudProjectNumber=");
        return AbstractC2327GOs.A0U(null, A0k);
    }
}
