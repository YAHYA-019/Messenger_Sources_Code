package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: Fea.class */
public final class Fea implements GKK {
    public static final Fea A00 = new Object();

    public ColorData AGf(2MR r302) {
        return null;
    }

    public Integer AIK(EPF epf) {
        return null;
    }

    public EPD B1Q() {
        return EPD.A0E;
    }

    public Dq2 Cwy(Integer num) {
        return null;
    }

    public Float D0g(EPH eph) {
        return null;
    }

    public Float D16(EPJ epj) {
        return null;
    }

    public 2KP D5Q(EMF emf) {
        ER8 er8;
        Integer num;
        2KN A0P;
        float f;
        int A0C = DKE.A0C(emf);
        if (A0C != 2) {
            if (A0C == 4) {
                er8 = ER8.A07;
                f = 14.0f;
                num = 0S2.A0C;
            } else if (A0C == 5) {
                er8 = ER8.A07;
                num = 0S2.A0N;
                A0P = DKC.A0P(20.0f);
                f = 14.0f;
            } else if (A0C == 6) {
                er8 = ER8.A07;
                f = 14.0f;
                num = 0S2.A00;
            } else {
                if (A0C != 14) {
                    return null;
                }
                er8 = ER8.A07;
                f = 32.0f;
                num = 0S2.A00;
                A0P = DKC.A0P(32.0f);
            }
            A0P = DKC.A0P(20.0f);
        } else {
            er8 = ER8.A07;
            num = 0S2.A00;
            A0P = DKC.A0P(20.0f);
            f = 16.0f;
        }
        return new 2KP(A0P, num, er8, f, 0.0f);
    }
}
