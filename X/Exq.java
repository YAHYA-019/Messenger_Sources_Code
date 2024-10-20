package X;

import java.util.List;

/* loaded from: Exq.class */
public final class Exq {
    public final List A00;

    public Exq(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exq) && 11T.A0O(this.A00, ((Exq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineCreateResponse(images=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
