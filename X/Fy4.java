package X;

import android.content.Context;

/* loaded from: Fy4.class */
public final class Fy4 implements GOe {
    public final EL8 A00;
    public final Integer A01;

    public Fy4(EL8 el8, Integer num) {
        1BL.A1F(num, el8);
        this.A01 = num;
        this.A00 = el8;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        MfW mfW;
        EM5 em5;
        int i;
        boolean A1X = 1BL.A1X(context, c6tP);
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            mfW = MfW.A1r;
        } else {
            if (intValue != A1X) {
                throw 1BK.A1F();
            }
            mfW = MfW.A0K;
        }
        int ordinal = this.A00.ordinal();
        if (ordinal == A1X) {
            em5 = EM5.A0A;
        } else {
            if (ordinal != 0) {
                throw 1BK.A1F();
            }
            em5 = EM5.A09;
        }
        Fy6 fy6 = new Fy6(mfW, em5);
        Integer num = 0S2.A00;
        if (ordinal == A1X) {
            i = 32;
        } else {
            if (ordinal != 0) {
                throw 1BK.A1F();
            }
            i = 36;
        }
        C94b c94b = C94b.A00;
        int i2 = 6;
        if (ordinal != A1X) {
            i2 = 4;
        }
        Integer num2 = 0S2.A01;
        ACE ace = new ACE(num, num2, num2);
        if (ordinal != A1X) {
            num2 = 0S2.A0C;
        }
        return new C9cl(new Fy2(mfW, num2), c94b, ace, fy6, 6, 8, null, null, null, null, 0.5f, i, 0, 0, 16, 16, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fy4)) {
                return false;
            }
            Fy4 fy4 = (Fy4) obj;
            if (this.A01 != fy4.A01 || this.A00 != fy4.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A01.intValue();
        return 1BK.A03(this.A00, 7zM.A04(1 != intValue ? "DEFAULT" : "EMPHASIZED", intValue) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CdsTextButtonVariant(color=");
        A0k.append(1 - this.A01.intValue() != 0 ? "DEFAULT" : "EMPHASIZED");
        A0k.append(", size=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
