package X;

import android.content.Context;

/* loaded from: Fy6.class */
public final class Fy6 implements GOg {
    public final MfW A00;
    public final EM5 A01;

    public Fy6(MfW mfW, EM5 em5) {
        1BL.A1F(em5, mfW);
        this.A01 = em5;
        this.A00 = mfW;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        Integer num;
        boolean A1X = 1BL.A1X(context, c6tP);
        ELy A03 = FHT.A03(c6tP);
        switch (this.A01.ordinal()) {
            case 0:
                num = 0S2.A00;
                break;
            case 1:
                num = 0S2.A01;
                break;
            case 2:
                num = 0S2.A0C;
                break;
            case 3:
                num = 0S2.A0N;
                break;
            case 4:
                num = 0S2.A0Y;
                break;
            case 5:
                num = 0S2.A0j;
                break;
            case 6:
                num = 0S2.A0u;
                break;
            case 7:
                num = 0S2.A15;
                break;
            case 8:
                num = 0S2.A1G;
                break;
            case 9:
                num = 0S2.A1J;
                break;
            default:
                throw 1BK.A1F();
        }
        11T.A0F(A03, 0);
        11T.A0F(num, A1X ? 1 : 0);
        2KP D5S = F0X.A01(A03).D5S(num);
        return F2e.A01(D5S, ((ER9) D5S.A04).value, A1X ? 1 : 0, FHT.A00(this.A00, c6tP));
    }
}
