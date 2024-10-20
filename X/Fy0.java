package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;

/* loaded from: Fy0.class */
public final class Fy0 implements GOi {
    public final Integer A00;
    public final String A01;
    public final C00m A02;

    public Fy0() {
        this(0S2.A01, null, null);
    }

    public Fy0(Integer num, String str, C00m c00m) {
        this.A00 = num;
        this.A02 = c00m;
        this.A01 = str;
    }

    public Integer BKP() {
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            return 0S2.A00;
        }
        if (intValue == 1) {
            return 0S2.A01;
        }
        if (intValue == 2) {
            return 0S2.A0N;
        }
        throw 1BK.A1F();
    }

    public /* bridge */ /* synthetic */ Object BKi(Context context, C6tP c6tP, GDl gDl) {
        11T.A0F(gDl, 2);
        ERA era = ERA.A0P;
        ERD erd = ERD.A02;
        ERB erb = ERB.A02;
        MfW mfW = MfW.A2A;
        String str = this.A01;
        2lO r0 = new 2lO((2lO) null, (2lU) null);
        2lO r312 = 2lO.A02;
        if (str != null) {
            r312 = 7zS.A0d((2lO) null, str);
        }
        return new Dvb(era, null, erb, erd, mfW, r0.A00(r312).A00(7zS.A0b((2lO) null, 0S2.A1G, new GBq(this, gDl, 22))));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy0)) {
                return false;
            }
            Fy0 fy0 = (Fy0) obj;
            if (this.A00 != fy0.A00 || !11T.A0O(this.A02, fy0.A02) || !11T.A0O(this.A01, fy0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "FOCUSED_AND_FILLED";
                break;
            case 2:
                str = "FOCUSED_OR_FILLED";
                break;
            default:
                str = "VISIBLE";
                break;
        }
        return (((7zM.A04(str, intValue) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsClearTextTextInputAddOn(visibilityRule=");
        switch (this.A00.intValue()) {
            case 1:
                str = "FOCUSED_AND_FILLED";
                break;
            case 2:
                str = "FOCUSED_OR_FILLED";
                break;
            default:
                str = "VISIBLE";
                break;
        }
        A0k.append(str);
        A0k.append(", onClick=");
        A0k.append(this.A02);
        A0k.append(7zK.A00(ActionId.CARD_DATA_LOADED));
        return DKH.A0o(this.A01, A0k);
    }
}
