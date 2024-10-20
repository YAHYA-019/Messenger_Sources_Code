package X;

/* renamed from: X.84w, reason: invalid class name */
/* loaded from: 84w.class */
public enum C84w {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    MENTION("MENTION"),
    /* JADX INFO: Fake field, exist only in values array */
    REPLY("REPLY");

    public final String serverValue;

    C84w(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
