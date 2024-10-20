package X;

/* renamed from: X.32C, reason: invalid class name */
/* loaded from: 32C.class */
public enum C32C {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NORMALIZED("NORMALIZED"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_NORMALIZED("NOT_NORMALIZED");

    public final String serverValue;

    C32C(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
