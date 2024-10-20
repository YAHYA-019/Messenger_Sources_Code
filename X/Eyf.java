package X;

import kotlin.jvm.functions.Function2;

/* loaded from: Eyf.class */
public final class Eyf {
    public final String A00;
    public final Function2 A01;
    public final C0Bd A02;

    public Eyf(String str, Function2 function2, C0Bd c0Bd) {
        this.A00 = str;
        this.A01 = function2;
        this.A02 = c0Bd;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyf)) {
                return false;
            }
            Eyf eyf = (Eyf) obj;
            if (!11T.A0O(this.A00, eyf.A00) || !11T.A0O(this.A01, eyf.A01) || !11T.A0O(this.A02, eyf.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, AnonymousClass002.A05(this.A01, 4YV.A02(this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScreenDefinition(name=");
        A0k.append(this.A00);
        A0k.append(", dataSource=");
        A0k.append(this.A01);
        A0k.append(", content=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}
