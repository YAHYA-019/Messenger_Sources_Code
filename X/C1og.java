package X;

/* renamed from: X.1og, reason: invalid class name */
/* loaded from: 1og.class */
public enum C1og {
    CHANNEL_CONNECTING(0),
    CHANNEL_CONNECTED(1),
    CHANNEL_DISCONNECTED(2),
    UNKNOWN(3);

    public final int value;

    C1og(int i) {
        this.value = i;
    }

    public static C1og A00(int i) {
        C1og c1og;
        C1og[] values = values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                c1og = UNKNOWN;
                break;
            }
            c1og = values[i3];
            if (c1og.value == i) {
                break;
            }
            i2 = i3 + 1;
        }
        return c1og;
    }
}
