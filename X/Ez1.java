package X;

import android.graphics.RectF;

/* loaded from: Ez1.class */
public final class Ez1 {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final EN3 A03;
    public final EMt A04;

    public Ez1(RectF rectF, RectF rectF2, RectF rectF3, EN3 en3, EMt eMt) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = eMt;
        this.A03 = en3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez1)) {
                return false;
            }
            Ez1 ez1 = (Ez1) obj;
            if (!11T.A0O(this.A02, ez1.A02) || !11T.A0O(this.A01, ez1.A01) || !11T.A0O(this.A00, ez1.A00) || this.A04 != ez1.A04 || this.A03 != ez1.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A01, 1BL.A03(this.A02)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TooltipPositionInfo(tooltipRect=");
        A0k.append(this.A02);
        A0k.append(", contentRect=");
        A0k.append(this.A01);
        A0k.append(", arrowRect=");
        A0k.append(this.A00);
        A0k.append(", tooltipPosition=");
        A0k.append(this.A04);
        A0k.append(", arrowLocation=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
