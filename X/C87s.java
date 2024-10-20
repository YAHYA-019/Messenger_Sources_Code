package X;

/* renamed from: X.87s, reason: invalid class name */
/* loaded from: 87s.class */
public enum C87s {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DOES_NOT_REQUIRE_MIGRATION("DOES_NOT_REQUIRE_MIGRATION"),
    REQUIRES_MIGRATION("REQUIRES_MIGRATION"),
    REQUIRES_PIN_RESET_FOR_NORMALIZATION("REQUIRES_PIN_RESET_FOR_NORMALIZATION"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUIRES_PIN_RESET_FOR_PIN_NOT_REGISTERED("REQUIRES_PIN_RESET_FOR_PIN_NOT_REGISTERED");

    public final String serverValue;

    C87s(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
