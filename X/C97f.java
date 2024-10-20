package X;

/* renamed from: X.97f, reason: invalid class name */
/* loaded from: 97f.class */
public enum C97f {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NONE("NONE"),
    COLLAGE("COLLAGE"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    MULTI_PHOTO("MULTI_PHOTO"),
    MESSENGER_ICON("MESSENGER_ICON"),
    INSTAGRAM_ICON("INSTAGRAM_ICON"),
    REELS_ICON("REELS_ICON"),
    LIVE("LIVE"),
    YOUTUBE_VIDEO("YOUTUBE_VIDEO"),
    YOUTUBE_SHORTS("YOUTUBE_SHORTS"),
    BLUR("BLUR"),
    /* JADX INFO: Fake field, exist only in values array */
    PILL("PILL");

    public final String serverValue;

    C97f(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
