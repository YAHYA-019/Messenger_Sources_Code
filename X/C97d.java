package X;

/* renamed from: X.97d, reason: invalid class name */
/* loaded from: 97d.class */
public enum C97d {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MOTHERS_DAY("MOTHERS_DAY"),
    FATHERS_DAY("FATHERS_DAY"),
    GRADUATION("GRADUATION"),
    NATIONAL_SELFIE("NATIONAL_SELFIE"),
    PH_INDEPENDENCE_DAY("PH_INDEPENDENCE_DAY"),
    JULY_FOURTH("JULY_FOURTH"),
    FRIENDSHIP_DAY("FRIENDSHIP_DAY");

    public final String serverValue;

    C97d(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
