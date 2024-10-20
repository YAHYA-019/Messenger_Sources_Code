package X;

/* loaded from: Eyz.class */
public final class Eyz {
    public final EOo A00;
    public final EOu A01;
    public final Boolean A02;
    public final Double A03;

    public Eyz(EOo eOo, EOu eOu, Boolean bool, Double d) {
        this.A02 = bool;
        this.A00 = eOo;
        this.A03 = d;
        this.A01 = eOu;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyz)) {
                return false;
            }
            Eyz eyz = (Eyz) obj;
            if (!11T.A0O(this.A02, eyz.A02) || this.A00 != eyz.A00 || !11T.A0O(this.A03, eyz.A03) || this.A01 != eyz.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A02(this.A02) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MEmuExtendedCaptureVerificationResult(isSimilar=");
        A0k.append(this.A02);
        A0k.append(", orientation=");
        A0k.append(this.A00);
        A0k.append(", similarityScore=");
        A0k.append(this.A03);
        A0k.append(", verificationStatus=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
