package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ACa.class */
public final class ACa implements Aaq {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public ACa(Context context) {
        this.A02 = context;
        this.A00 = 1Bu.A01(context, 16980);
        this.A01 = 1Bu.A01(context, 16981);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    @Override // X.Aaq
    public int Chy(C97i c97i, boolean z) {
        int i;
        11T.A0F(c97i, 0);
        MigColorScheme A0m = 7zQ.A0m(z ? this.A00 : this.A01);
        switch (c97i.ordinal()) {
            case 0:
                return A0m.B4i();
            case 1:
            case 38:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return A0m.B9Q();
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
            case 11:
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 36:
            case 39:
            case 40:
            case 41:
            case 42:
            default:
                i = C9kH.A00.Chy(c97i, z);
                return i;
            case 4:
            case 14:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return A0m.BKh();
            case 5:
            case 15:
            case 25:
            case 43:
            case 46:
                return A0m.B4d();
            case 8:
                return 7zQ.A0m(this.A01).B4i();
            case 10:
            case 35:
                return A0m.BEi();
            case 12:
                return A0m.B9I();
            case 16:
                return A0m.B36();
            case 19:
                return A0m.BDl();
            case 20:
                return A0m.Aht();
            case 21:
            case 22:
                return A0m.AmV();
            case 32:
                i = -1;
                if (!z) {
                    return -16777216;
                }
                return i;
            case 34:
                return !z ? A0m.BKg() : A0m.B4n();
            case 37:
                return A0m.BL8();
            case ActionId.ON_START_END /* 47 */:
                return A0m.AZL();
            case ActionId.QUEUED /* 48 */:
                return -16089857;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.Aaq
    public int Chz(Integer num) {
        Integer num2;
        11T.A0F(num, 0);
        C1pE c1pE = C1pE.A00;
        int i = 3;
        switch (num.intValue()) {
            case 9:
                return 10;
            case 10:
                return 52;
            case 11:
            case 14:
                num2 = 0S2.A00;
                break;
            case 12:
            case 24:
                num2 = 0S2.A0Y;
                break;
            case 13:
            case 18:
            case 19:
            case 20:
            case 21:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 36:
            default:
                i = C9kH.A00.Chz(num);
                return i;
            case 15:
                return c1pE.AIM(0S2.A0Y);
            case 16:
            case 17:
                return 36;
            case 22:
            case 23:
            case 25:
            case 26:
                return 0;
            case 27:
            case 28:
                return i;
            case 34:
            case 35:
                return 20;
            case 37:
                return 16;
            case 38:
                return 4;
            case 39:
                return 18;
            case 40:
                return 24;
            case 41:
                return 32;
        }
        return (int) c1pE.D17(num2);
    }

    @Override // X.Aaq
    public boolean Ci0(Integer num) {
        11T.A0F(num, 0);
        boolean z = true;
        if (num.intValue() != 1) {
            z = C9kH.A00.Ci0(num);
        }
        return z;
    }

    @Override // X.Aaq
    public float Ci5(C95x c95x, boolean z) {
        float f;
        11T.A0F(c95x, 0);
        int ordinal = c95x.ordinal();
        if (ordinal == 0) {
            f = 0.05f;
            if (!z) {
                return 0.04f;
            }
        } else if (ordinal == 1) {
            f = 0.2f;
            if (!z) {
                return 0.17f;
            }
        } else {
            if (ordinal != 2) {
                throw 1BK.A1F();
            }
            f = 0.9f;
        }
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.Aaq
    public 2KP CiA(Integer num) {
        2KP D5R;
        Integer num2 = 0S2.A01;
        C1pE c1pE = C1pE.A00;
        switch (num.intValue()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 27:
            case 28:
            case 29:
                num2 = 0S2.A0C;
                D5R = c1pE.D5R(num2);
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 14:
            case 17:
            case 20:
            case 22:
            case 30:
            default:
                D5R = C9kH.A00.CiA(num);
                break;
            case 5:
            case 12:
            case 18:
                num2 = 0S2.A00;
                D5R = c1pE.D5R(num2);
                break;
            case 7:
                num2 = 0S2.A0N;
                D5R = c1pE.D5R(num2);
                break;
            case 13:
            case 26:
                num2 = 0S2.A0u;
                D5R = c1pE.D5R(num2);
                break;
            case 15:
            case 23:
                num2 = 0S2.A03;
                D5R = c1pE.D5R(num2);
                break;
            case 16:
            case 19:
            case 25:
                D5R = c1pE.D5R(num2);
                break;
            case 21:
            case 24:
                num2 = 0S2.A1G;
                D5R = c1pE.D5R(num2);
                break;
            case 31:
                num2 = 0S2.A06;
                D5R = c1pE.D5R(num2);
                break;
        }
        if (D5R == null) {
            D5R = C9kH.A00.CiA(num);
        }
        return D5R;
    }
}
