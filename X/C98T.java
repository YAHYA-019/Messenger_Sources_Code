package X;

/* renamed from: X.98T, reason: invalid class name */
/* loaded from: 98T.class */
public enum C98T implements AYT {
    PRIMARY(2132214312, -570425344),
    SECONDARY(2132214303, -1979711488),
    TERTIARY(2132214454, 1627389952),
    HINT(2132214454, 1627389952),
    INVERSE_PRIMARY(2132213866, -1),
    INVERSE_SECONDARY(2132214456, -1275068417),
    INVERSE_TERTIARY(2132214455, -2130706433),
    INVERSE_HINT(2132214455, -2130706433),
    DISABLED(2132214451, 1124073472),
    BLUE(2132214411, -16743169),
    RED(2132214477, -1032923),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN(2132214453, -11809761);

    public final int colorInt;
    public final int colorResId;

    C98T(int i, int i2) {
        this.colorResId = i;
        this.colorInt = i2;
    }

    public int Acz() {
        return this.colorInt;
    }
}
