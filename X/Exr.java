package X;

import java.util.List;

/* loaded from: Exr.class */
public final class Exr {
    public final List A00;

    public Exr(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exr) && 11T.A0O(this.A00, ((Exr) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        DKG.A1Y(A0k, "SpotlightItem(title=");
        DKG.A1Y(A0k, AbE.A00(15));
        A0k.append(", imagineSuggestions=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
