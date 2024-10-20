package X;

import java.util.List;

/* loaded from: Fyt.class */
public final class Fyt implements GDv {
    public final List A00;

    public Fyt(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Fyt) && 11T.A0O(this.A00, ((Fyt) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FBVideoCreationInput(mediaUrls=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
