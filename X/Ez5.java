package X;

import android.graphics.drawable.Drawable;

/* loaded from: Ez5.class */
public final class Ez5 {
    public final int A00;
    public final Drawable A01;
    public final ESC A02;
    public final ESD A03;
    public final String A04;

    public Ez5(Drawable drawable, ESC esc, ESD esd, String str, int i) {
        7zP.A1L(esc, 2, str);
        this.A03 = esd;
        this.A02 = esc;
        this.A00 = i;
        this.A01 = drawable;
        this.A04 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez5)) {
                return false;
            }
            Ez5 ez5 = (Ez5) obj;
            if (!11T.A0O(this.A03, ez5.A03) || !11T.A0O(this.A02, ez5.A02) || this.A00 != ez5.A00 || !11T.A0O(this.A01, ez5.A01) || !11T.A0O(this.A04, ez5.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A04, AnonymousClass002.A05(this.A01, (AnonymousClass002.A05(this.A02, 1BL.A03(this.A03)) + this.A00) * 31 * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProfilePhotoStyleValues(roundingOptions=");
        A0k.append(this.A03);
        A0k.append(", borderOptions=");
        A0k.append(this.A02);
        A0k.append(", imageSizeDp=");
        A0k.append(this.A00);
        DKG.A1X(A0k, ", backgroundColor=");
        A0k.append(", photoOverlay=");
        A0k.append(this.A01);
        A0k.append(", attributionLabel=");
        A0k.append(this.A04);
        A0k.append(", badgeAddOn=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
