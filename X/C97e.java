package X;

/* renamed from: X.97e, reason: invalid class name */
/* loaded from: 97e.class */
public enum C97e {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    LOVE("LOVE"),
    GIFTWRAP("GIFTWRAP"),
    CELEBRATION("CELEBRATION"),
    FIRE("FIRE"),
    AVATAR_LOVE("AVATAR_LOVE"),
    AVATAR_ANGRY("AVATAR_ANGRY"),
    AVATAR_CRY("AVATAR_CRY"),
    AVATAR_LAUGH("AVATAR_LAUGH"),
    /* JADX INFO: Fake field, exist only in values array */
    HALLOWEEN("HALLOWEEN");

    public final String serverValue;

    C97e(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
