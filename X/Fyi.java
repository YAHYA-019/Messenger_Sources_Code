package X;

import java.util.List;

/* loaded from: Fyi.class */
public final class Fyi implements GDs {
    public final List A00;
    public final List A01;

    public Fyi(List list, List list2) {
        11T.A0F(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fyi)) {
                return false;
            }
            Fyi fyi = (Fyi) obj;
            if (!11T.A0O(this.A01, fyi.A01) || !11T.A0O(this.A00, fyi.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Success(suggestions=");
        A0k.append(this.A01);
        A0k.append(", spotlightItems=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
