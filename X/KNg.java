package X;

/* loaded from: KNg.class */
public enum KNg {
    HALF(0),
    SINGLE(1),
    DOUBLE(2);

    public static final KNg[] A00 = new KNg[values().length];
    public short flatbufID;

    static {
        for (KNg kNg : values()) {
            A00[kNg.flatbufID] = kNg;
        }
    }

    KNg(short s) {
        this.flatbufID = s;
    }
}
