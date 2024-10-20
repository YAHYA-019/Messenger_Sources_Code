package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: Fy3.class */
public final class Fy3 implements GHL {
    public final ERA A00;
    public final ERA A01;
    public final ERB A02;
    public final ERD A03;
    public final MfW A04;

    public Fy3(ERA era, ERA era2, ERB erb, ERD erd, MfW mfW) {
        7zT.A1W(era, erd, erb, mfW);
        this.A00 = era;
        this.A03 = erd;
        this.A02 = erb;
        this.A04 = mfW;
        this.A01 = era2;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        boolean A1W = 1BL.A1W(context, c6tP);
        int A00 = FHT.A00(this.A04, c6tP);
        boolean A1V = 4YV.A1V(4YU.A0B(context).getLayoutDirection(), A1W ? 1 : 0);
        GHk gHk = this.A01;
        if (gHk == null || !A1V) {
            gHk = this.A00;
        }
        11T.A0I(gHk, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Name<com.facebook.fbui.fbicon.model.IconSet.Type>");
        GHm gHm = this.A03;
        11T.A0I(gHm, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Variant<com.facebook.fbui.fbicon.model.IconSet.Type>");
        GHl gHl = this.A02;
        11T.A0I(gHl, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Size<com.facebook.fbui.fbicon.model.IconSet.Type>");
        Drawable A06 = ((Fcg) DKC.A0y()).A06(context, gHk, gHl, gHm);
        11T.A0A(A06);
        return new EyA(C1uu.A03.A03(4YU.A0C(context), A06, A00), ((ERB) gHl).mSizeDp);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy3)) {
                return false;
            }
            Fy3 fy3 = (Fy3) obj;
            if (this.A00 != fy3.A00 || this.A03 != fy3.A03 || this.A02 != fy3.A02 || this.A04 != fy3.A04 || this.A01 != fy3.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A03, 1BL.A03(this.A00)))) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsIconVariant(iconName=");
        A0k.append(this.A00);
        A0k.append(", iconVariant=");
        A0k.append(this.A03);
        A0k.append(", iconSize=");
        A0k.append(this.A02);
        A0k.append(", iconColor=");
        A0k.append(this.A04);
        A0k.append(", rtlIconName=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
