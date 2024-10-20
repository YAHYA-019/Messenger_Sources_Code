package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.1j1, reason: invalid class name */
/* loaded from: 1j1.class */
public abstract class C1j1 {
    public static final long A00;

    static {
        long j;
        Integer[] A002 = 0S2.A00(14);
        int length = A002.length;
        long j2 = 0;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A00 = j2;
                return;
            }
            switch (A002[i2].intValue()) {
                case 1:
                    j = 2;
                    break;
                case 2:
                    j = 4;
                    break;
                case 3:
                    j = 8;
                    break;
                case 4:
                    j = 16;
                    break;
                case 5:
                    j = 32;
                    break;
                case 6:
                    j = 64;
                    break;
                case 7:
                    j = 128;
                    break;
                case 8:
                    j = 256;
                    break;
                case 9:
                    j = 512;
                    break;
                case 10:
                    j = 1024;
                    break;
                case 11:
                    j = OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
                    break;
                case 12:
                    j = 8388608;
                    break;
                case 13:
                    j = 1073741824;
                    break;
                default:
                    j = 1;
                    break;
            }
            j2 |= j;
            i = i2 + 1;
        }
    }
}
