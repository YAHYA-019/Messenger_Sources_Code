package X;

/* renamed from: X.26z, reason: invalid class name */
/* loaded from: 26z.class */
public enum C26z {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);

    public final int mIntValue;

    C26z(int i) {
        this.mIntValue = i;
    }

    public static C26z A00(int i) {
        switch (i) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw 0Pz.A04("Unknown enum value: ", i);
        }
    }
}
