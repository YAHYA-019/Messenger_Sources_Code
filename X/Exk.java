package X;

import java.util.Set;

/* loaded from: Exk.class */
public final class Exk {
    public final Set A00;

    public Exk(Set set) {
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exk) && 11T.A0O(this.A00, ((Exk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksCapabilities(capabilities=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
