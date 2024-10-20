package X;

/* loaded from: BP9.class */
public enum BP9 implements 0Eq {
    MARK_READ(1),
    MARK_UNREAD(2),
    KEEP_AS_IS(3);

    public final int value;

    BP9(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
