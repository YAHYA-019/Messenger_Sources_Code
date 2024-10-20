package X;

import com.facebookpay.common.models.ErrorDialogContent;

/* loaded from: L69.class */
public abstract class L69 {
    public static final EtZ A00(K0H k0h) {
        Integer num;
        int i;
        11T.A0F(k0h, 0);
        String str = k0h.paymentErrorTitle;
        String str2 = k0h.paymentErrorDescription;
        Kfo kfo = k0h.primaryCta;
        Kfo kfo2 = k0h.secondaryCta;
        QtM qtM = k0h.errorFormFieldId;
        if (qtM != null) {
            num = 2;
            switch (qtM.ordinal()) {
                case 3:
                    i = 13;
                    num = Integer.valueOf(i);
                    break;
                case 4:
                case 13:
                    break;
                case 5:
                    i = 7;
                    num = Integer.valueOf(i);
                    break;
                case 8:
                    i = 15;
                    num = Integer.valueOf(i);
                    break;
                case 10:
                    i = 1;
                    num = Integer.valueOf(i);
                    break;
                case 11:
                    i = 14;
                    num = Integer.valueOf(i);
                    break;
                case 20:
                    i = 0;
                    num = Integer.valueOf(i);
                    break;
                case 24:
                    i = 8;
                    num = Integer.valueOf(i);
                    break;
                case 25:
                    i = 5;
                    num = Integer.valueOf(i);
                    break;
                case 26:
                    i = 6;
                    num = Integer.valueOf(i);
                    break;
                case 30:
                    i = 9;
                    num = Integer.valueOf(i);
                    break;
            }
            return new EtZ(new ErrorDialogContent(null, null, kfo, kfo2, null, null, num, null, str, str2));
        }
        num = null;
        return new EtZ(new ErrorDialogContent(null, null, kfo, kfo2, null, null, num, null, str, str2));
    }

    public static final K0H A01(MQL mql) {
        Qtp qtp;
        Kfo kfo;
        MPw A9b;
        MPw A9b2;
        int AkN = mql.AkN();
        String AkZ = mql.AkZ();
        if (AkZ == null) {
            AkZ = "";
        }
        String AkO = mql.AkO();
        if (AkO == null) {
            AkO = "";
        }
        MOG B4g = mql.B4g();
        if (B4g == null || (A9b2 = B4g.A9b()) == null) {
            qtp = Qtp.A03;
        } else {
            A9b2.Asw();
            qtp = A9b2.BHa();
            if (qtp == null) {
                qtp = Qtp.A03;
            }
            A9b2.Atr();
        }
        Kfo kfo2 = new Kfo(qtp);
        MOH B9L = mql.B9L();
        if (B9L == null || (A9b = B9L.A9b()) == null) {
            kfo = null;
        } else {
            A9b.Asw();
            Qtp BHa = A9b.BHa();
            if (BHa == null) {
                BHa = Qtp.A03;
            }
            A9b.Atr();
            kfo = new Kfo(BHa);
        }
        return new K0H(kfo2, kfo, mql.AkP(), AkZ, AkO, mql.AlN(), AkN);
    }

    public static final K0H A02(MOZ moz) {
        MPd AmH;
        MOY AkF;
        MQL AAc;
        if (moz == null || (AmH = moz.AmH()) == null || (AkF = AmH.AkF()) == null || (AAc = AkF.AAc()) == null) {
            return null;
        }
        return A01(AAc);
    }
}
