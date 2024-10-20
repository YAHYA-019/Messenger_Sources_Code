package X;

import android.content.Context;
import android.view.animation.Interpolator;

/* loaded from: Fy2.class */
public final class Fy2 implements GHL {
    public final MfW A00;
    public final Integer A01;

    public Fy2(MfW mfW, Integer num) {
        1BL.A1F(mfW, num);
        this.A00 = mfW;
        this.A01 = num;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        int i;
        boolean A1W = 1BL.A1W(context, c6tP);
        switch (this.A01.intValue()) {
            case 0:
                i = 16;
                break;
            case 1:
                i = 20;
                break;
            default:
                i = 24;
                break;
        }
        int A00 = (int) 4YW.A00(context, i, A1W ? 1 : 0);
        Interpolator interpolator = DN5.A09;
        return new EyB(new DN5(context, FHT.A00(this.A00, c6tP), A00), i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy2)) {
                return false;
            }
            Fy2 fy2 = (Fy2) obj;
            if (this.A00 != fy2.A00 || this.A01 != fy2.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A03 = 1BL.A03(this.A00);
        Integer num = this.A01;
        switch (num.intValue()) {
            case 0:
                str = "XX_SMALL";
                break;
            case 1:
                str = "X_SMALL";
                break;
            default:
                str = "SMALL";
                break;
        }
        return A03 + 7zU.A02(num, str);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsSpinnerVariant(color=");
        A0k.append(this.A00);
        A0k.append(", size=");
        switch (this.A01.intValue()) {
            case 0:
                str = "XX_SMALL";
                break;
            case 1:
                str = "X_SMALL";
                break;
            default:
                str = "SMALL";
                break;
        }
        return DKH.A0o(str, A0k);
    }
}
