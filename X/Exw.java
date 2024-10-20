package X;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: Exw.class */
public final class Exw {
    public final List A00;
    public final Function2 A01;

    public Exw(List list, Function2 function2) {
        11T.A0F(function2, 3);
        this.A00 = list;
        this.A01 = function2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Exw)) {
                return false;
            }
            Exw exw = (Exw) obj;
            if (!"Image Source".equals("Image Source") || !11T.A0O(this.A00, exw.A00) || !11T.A0O(this.A01, exw.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A05(this.A00, 1678712128));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Entry(name=");
        A0k.append("Image Source");
        A0k.append(", data=");
        A0k.append(this.A00);
        A0k.append(", updateFunction=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
