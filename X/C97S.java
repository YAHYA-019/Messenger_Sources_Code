package X;

/* renamed from: X.97S, reason: invalid class name */
/* loaded from: 97S.class */
public enum C97S {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MEMU("MEMU"),
    IMAGINE("IMAGINE");

    public final String serverValue;

    C97S(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
