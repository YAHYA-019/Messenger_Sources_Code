package X;

/* loaded from: KNl.class */
public enum KNl {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    public final boolean isList;

    KNl(boolean z) {
        this.isList = z;
    }
}
