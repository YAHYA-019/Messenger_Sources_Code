package X;

import java.util.List;

/* loaded from: Eys.class */
public final class Eys {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final java.util.Map A03;

    public Eys(Object obj, String str, List list, java.util.Map map) {
        7zT.A1W(obj, map, str, list);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eys)) {
                return false;
            }
            Eys eys = (Eys) obj;
            if (!11T.A0O(this.A00, eys.A00) || !11T.A0O(this.A03, eys.A03) || !11T.A0O(this.A01, eys.A01) || !11T.A0O(this.A02, eys.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A07(this.A01, AnonymousClass002.A05(this.A03, 1BL.A03(this.A00))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Template(templateObject=");
        A0k.append(this.A00);
        A0k.append(", expandedVariables=");
        A0k.append(this.A03);
        A0k.append(", scopeKey=");
        A0k.append(this.A01);
        A0k.append(", keyPathBase=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
