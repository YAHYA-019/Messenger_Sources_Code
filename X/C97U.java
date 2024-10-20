package X;

/* renamed from: X.97U, reason: invalid class name */
/* loaded from: 97U.class */
public enum C97U {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    SIMPLE("SIMPLE"),
    RETRO("RETRO"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGES("MESSAGES");

    public final String serverValue;

    C97U(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
