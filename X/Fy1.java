package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;

/* loaded from: Fy1.class */
public final class Fy1 implements GHL {
    public final ENE A00;
    public final Integer A01;

    public Fy1(ENE ene, Integer num) {
        7zR.A1N(num, ene);
        this.A01 = num;
        this.A00 = ene;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        float A01;
        boolean A1X = 1BL.A1X(context, c6tP);
        Integer num = this.A01;
        Integer num2 = 0S2.A00;
        boolean A1W = AnonymousClass001.A1W(num, num2);
        ENE ene = this.A00;
        int i = ene.sizeDp;
        if (A1W) {
            A01 = i / 2.0f;
        } else {
            Integer num3 = 0S2.A1G;
            if (FHT.A04(c6tP, num3)) {
                switch (ene.ordinal()) {
                    case 0:
                    case 1:
                        num3 = 0S2.A0F;
                        break;
                    case 2:
                    case 3:
                        num3 = 0S2.A0E;
                        break;
                    case 4:
                    case 5:
                        num3 = 0S2.A0D;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        num3 = 0S2.A0G;
                        break;
                    default:
                        throw 1BK.A1F();
                }
            }
            A01 = FHT.A01(c6tP, num3);
        }
        EIx eIx = num == num2 ? EIy.A00 : new EIx(A01);
        FHT.A00(MfW.A0R, c6tP);
        EIw eIw = EIw.A00;
        String A0W = 0Pz.A0W("CdsProfilePhotoVariant - ", num == num2 ? "Actor" : "Non Actor");
        context.getResources().getDisplayMetrics();
        int i2 = (int) ((7zO.A0I(context).density * 0.5f) + 0.5f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int intValue = num.intValue();
        if (intValue == 0) {
            gradientDrawable.setShape(A1X ? 1 : 0);
        } else if (intValue == A1X) {
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((int) ((A01 * 7zO.A0I(context).density) + 0.5f));
        }
        gradientDrawable.setStroke(i2, FHT.A00(MfW.A1H, c6tP));
        return new Ez5(gradientDrawable, eIw, eIx, A0W, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy1)) {
                return false;
            }
            Fy1 fy1 = (Fy1) obj;
            if (this.A01 != fy1.A01 || this.A00 != fy1.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A01.intValue();
        return (AnonymousClass002.A05(this.A00, 7zM.A04(1 != intValue ? "ACTOR" : "NON_ACTOR", intValue) * 31 * 31) + 1237) * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsProfilePhotoVariant(photoStyle=");
        A0k.append(1 - this.A01.intValue() != 0 ? "ACTOR" : "NON_ACTOR");
        DKG.A1X(A0k, ", backgroundColor=");
        A0k.append(", photoSize=");
        A0k.append(this.A00);
        4YV.A1Q(A0k, ", hasBorder=");
        A0k.append(", badgeAddOn=");
        return AnonymousClass002.A0K(null, A0k);
    }
}
