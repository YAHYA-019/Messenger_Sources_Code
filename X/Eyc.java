package X;

/* loaded from: Eyc.class */
public final class Eyc {
    public final FHf A00;
    public final GHC A01;
    public final ES9 A02;

    public Eyc(FHf fHf, GHC ghc, ES9 es9) {
        1BL.A1F(ghc, es9);
        this.A01 = ghc;
        this.A02 = es9;
        this.A00 = fHf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyc)) {
                return false;
            }
            Eyc eyc = (Eyc) obj;
            if (!11T.A0O(this.A01, eyc.A01) || !11T.A0O(this.A02, eyc.A02) || !11T.A0O(this.A00, eyc.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A02, 1BL.A03(this.A01)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksTreeManagerModification(target=");
        A0k.append(this.A01);
        A0k.append(", updateOperation=");
        A0k.append(this.A02);
        A0k.append(", parseResult=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
