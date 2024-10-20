package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: Fel.class */
public final class Fel implements GKK {
    public static final Fel A00 = new Object();

    public ColorData AGf(2MR r302) {
        return null;
    }

    public Integer AIK(EPF epf) {
        Integer num = 12;
        switch (DKE.A0C(epf)) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            default:
                num = null;
                break;
        }
        return num;
    }

    public EPD B1Q() {
        return EPD.A0K;
    }

    public Dq2 Cwy(Integer num) {
        return null;
    }

    public Float D0g(EPH eph) {
        return null;
    }

    public Float D16(EPJ epj) {
        float f;
        int A0C = DKE.A0C(epj);
        if (A0C != 23) {
            f = 0.0f;
            if (A0C != 32) {
                f = 12.0f;
                if (A0C != 70 && A0C != 80) {
                    return null;
                }
            }
        } else {
            f = 8.0f;
        }
        return Float.valueOf(f);
    }

    public 2KP D5Q(EMF emf) {
        return null;
    }
}
