package X;

/* renamed from: X.97a, reason: invalid class name */
/* loaded from: 97a.class */
public enum C97a {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE("NONE"),
    YOUTUBE_VIDEO("YOUTUBE_VIDEO"),
    YOUTUBE_SHORTS("YOUTUBE_SHORTS");

    public final String serverValue;

    C97a(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
