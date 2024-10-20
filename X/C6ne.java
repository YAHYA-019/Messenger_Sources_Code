package X;

/* renamed from: X.6ne, reason: invalid class name */
/* loaded from: 6ne.class */
public enum C6ne {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MAGIC_MOD_BACKDROP("MAGIC_MOD_BACKDROP"),
    MAGIC_MOD_RESTYLE("MAGIC_MOD_RESTYLE"),
    IMAGINE("IMAGINE"),
    MEMU("MEMU");

    public final String serverValue;

    C6ne(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
