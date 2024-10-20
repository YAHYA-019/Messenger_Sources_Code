package X;

import java.util.List;

/* loaded from: Eyx.class */
public final class Eyx {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public Eyx(String str, List list, int i, boolean z) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = i;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyx)) {
                return false;
            }
            Eyx eyx = (Eyx) obj;
            if (!11T.A0O(this.A01, eyx.A01) || !11T.A0O(this.A02, eyx.A02) || this.A00 != eyx.A00 || this.A03 != eyx.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A02, 4YV.A02(this.A01)) + this.A00) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineGenerateResponse(prompt=");
        A0k.append(this.A01);
        A0k.append(", images=");
        A0k.append(this.A02);
        A0k.append(", numOfImagesRequested=");
        A0k.append(this.A00);
        A0k.append(", isMEmuPrompt=");
        return DKH.A0q(A0k, this.A03);
    }
}
