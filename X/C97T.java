package X;

/* renamed from: X.97T, reason: invalid class name */
/* loaded from: 97T.class */
public enum C97T {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    REMINDER("REMINDER"),
    SUBSCRIPTION("SUBSCRIPTION");

    public final String serverValue;

    C97T(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
