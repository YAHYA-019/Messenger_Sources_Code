package X;

/* loaded from: KNe.class */
public enum KNe {
    CONTIGUOUS(1),
    CHANNELS_LAST(2),
    CHANNELS_LAST_3D(3);

    public final int jniCode;

    KNe(int i) {
        this.jniCode = i;
    }
}
