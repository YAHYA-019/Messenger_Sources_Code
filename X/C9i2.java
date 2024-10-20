package X;

/* renamed from: X.9i2, reason: invalid class name */
/* loaded from: 9i2.class */
public final class C9i2 {
    public final ETe A00;
    public final EzU A01;
    public final EzU A02;
    public final String A03;
    public final boolean A04;

    public C9i2() {
        this(null, null, null, null, false);
    }

    public C9i2(ETe eTe, EzU ezU, EzU ezU2, String str, boolean z) {
        this.A01 = ezU;
        this.A04 = z;
        this.A03 = str;
        this.A02 = ezU2;
        this.A00 = eTe;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i2)) {
                return false;
            }
            C9i2 c9i2 = (C9i2) obj;
            if (!11T.A0O(this.A01, c9i2.A01) || this.A04 != c9i2.A04 || !11T.A0O(this.A03, c9i2.A03) || !11T.A0O(this.A02, c9i2.A02) || !11T.A0O(this.A00, c9i2.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass001.A02(this.A01) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + 1BL.A05(this.A03)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EditHistoryNode(media=");
        A0k.append(this.A01);
        A0k.append(", isEdited=");
        A0k.append(this.A04);
        A0k.append(", editPrompt=");
        A0k.append(this.A03);
        A0k.append(", parentMedia=");
        A0k.append(this.A02);
        A0k.append(", generationError=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
