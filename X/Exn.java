package X;

/* loaded from: Exn.class */
public final class Exn {
    public final 03Y A00;

    public boolean equals(Object obj) {
        03Y r0 = this.A00;
        boolean z = false;
        if ((obj instanceof Exn) && 11T.A0O(r0, ((Exn) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        03Y r0 = this.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WriteThroughCacheResponse(response=");
        return AnonymousClass002.A0K(r0, A0k);
    }
}
