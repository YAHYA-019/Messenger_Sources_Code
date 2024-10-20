package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.4Uj, reason: invalid class name */
/* loaded from: 4Uj.class */
public abstract class C4Uj {
    public static final 1Br A00;
    public static final C04t A01 = new C04t("/+|@+|\n");
    public static final 7IC A02;

    static {
        1Br A0C = 1BK.A0C();
        A00 = A0C;
        String BCy = 1Br.A07(A0C).BCy(36888791205807938L);
        11T.A0A(BCy);
        A02 = new 7IC(0CU.A0M(BCy, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
    }

    public static final boolean A00(String str) {
        Integer num;
        11T.A0F(str, 0);
        7IC r0 = A02;
        String A13 = 1BK.A13(str);
        7IJ r303 = r0.A01;
        int length = A13.length();
        int i = 0;
        while (true) {
            int i2 = i;
            num = null;
            if (i2 < length) {
                char charAt = A13.charAt(i2);
                if (!r303.A03) {
                    if (r303.A02.get(Character.valueOf(charAt)) == null) {
                        break;
                    }
                    Object obj = r303.A02.get(Character.valueOf(charAt));
                    if (obj == null) {
                        throw 1BK.A0h();
                    }
                    r303 = (7IJ) obj;
                    i = i2 + 1;
                } else {
                    num = Integer.valueOf(i2);
                    break;
                }
            } else if (r303.A03) {
                num = Integer.valueOf(length);
            }
        }
        boolean z = false;
        if (num != null) {
            if (0CU.A06(str).toString().length() > num.intValue() + 7) {
                z = true;
            }
        }
        return z;
    }
}
