package X;

import java.util.List;

/* loaded from: Exj.class */
public final class Exj {
    public final List A00;

    public Exj(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Exj) && 11T.A0O(this.A00, ((Exj) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksComponentQueryNetworkParseResponse(results=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
