package X;

/* loaded from: I6B.class */
public abstract class I6B {
    public static final int A00(C6r6 c6r6) {
        if (c6r6 == null) {
            return 999;
        }
        switch (c6r6.ordinal()) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 0;
            case 12:
            case 14:
                return 5;
            case 13:
                return 7;
            case 33:
            case 34:
                return 2;
            case 38:
                return 3;
            case 39:
                return 16;
            default:
                return 999;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000e. Please report as an issue. */
    public static final int A01(C6r6 c6r6, boolean z) {
        int i;
        if (c6r6 != null) {
            i = 998;
            switch (c6r6.ordinal()) {
                case 1:
                case 12:
                case 13:
                case 14:
                    if (!z) {
                        return 0;
                    }
                    return i;
                case 2:
                case 3:
                case 33:
                case 34:
                case 38:
                case 39:
                    if (z) {
                        return 1;
                    }
                    return i;
            }
        }
        i = 999;
        return i;
    }

    public static void A02(1UG r301, C6r6 c6r6, boolean z) {
        r301.A5q("major_entry_point", Integer.valueOf(A00(c6r6)));
        r301.A5q("minor_entry_point", Integer.valueOf(A01(c6r6, z)));
    }
}
