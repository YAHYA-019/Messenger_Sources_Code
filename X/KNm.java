package X;

/* loaded from: KNm.class */
public enum KNm {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    public final boolean isList;

    KNm(boolean z) {
        this.isList = z;
    }
}
