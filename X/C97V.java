package X;

/* renamed from: X.97V, reason: invalid class name */
/* loaded from: 97V.class */
public enum C97V {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SQUARE("SQUARE"),
    CIRCLE("CIRCLE");

    public final String serverValue;

    C97V(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
