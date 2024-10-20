package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Fyn.class */
public final class Fyn implements GHN {
    public final int A00;
    public final String A01;
    public final C00m A02;
    public final C00m A03;
    public final Function1 A04;

    public Fyn(String str, C00m c00m, C00m c00m2, Function1 function1, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = c00m;
        this.A02 = c00m2;
        this.A04 = function1;
    }

    public 1LI D4I(C2k6 c2k6) {
        int i = this.A00;
        String str = this.A01;
        C00m c00m = this.A03;
        C00m c00m2 = this.A02;
        Function1 function1 = this.A04;
        return new Dvq(2lO.A02, C1ro.FLEX_START, str, c00m, c00m2, function1, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fyn)) {
                return false;
            }
            Fyn fyn = (Fyn) obj;
            if (this.A00 != fyn.A00 || !11T.A0O(this.A01, fyn.A01) || !11T.A0O(this.A03, fyn.A03) || !11T.A0O(this.A02, fyn.A02) || !11T.A0O(this.A04, fyn.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A04, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A03, AnonymousClass002.A07(this.A01, this.A00 * 31))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextSuggestion(id=");
        A0k.append(this.A00);
        A0k.append(", text=");
        A0k.append(this.A01);
        A0k.append(", resultOnVisible=");
        A0k.append(this.A03);
        A0k.append(", resultOnClick=");
        A0k.append(this.A02);
        A0k.append(", feedbackOnClick=");
        return AnonymousClass002.A0K(this.A04, A0k);
    }
}
