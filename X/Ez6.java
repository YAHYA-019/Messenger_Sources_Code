package X;

import android.graphics.Typeface;

/* loaded from: Ez6.class */
public final class Ez6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Typeface A03;
    public final 2KO A04;

    public Ez6(Typeface typeface, 2KO r303, float f, float f2, int i) {
        this.A03 = typeface;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = r303;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez6)) {
                return false;
            }
            Ez6 ez6 = (Ez6) obj;
            if (!11T.A0O(this.A03, ez6.A03) || Float.compare(this.A00, ez6.A00) != 0 || Float.compare(this.A01, ez6.A01) != 0 || !11T.A0O(this.A04, ez6.A04) || this.A02 != ez6.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A04, 1BL.A00(1BL.A00(1BL.A03(this.A03), this.A00), this.A01)) + this.A02;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextStyleValues(typeface=");
        A0k.append(this.A03);
        A0k.append(", fontSize=");
        A0k.append(this.A00);
        A0k.append(", letterSpacing=");
        A0k.append(this.A01);
        A0k.append(", lineHeight=");
        A0k.append(this.A04);
        A0k.append(", textColor=");
        return DKH.A0p(A0k, this.A02);
    }
}
