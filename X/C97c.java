package X;

/* renamed from: X.97c, reason: invalid class name */
/* loaded from: 97c.class */
public enum C97c {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    DEFAULT("DEFAULT"),
    THREADS_ICON("THREADS_ICON"),
    FACEBOOK_ICON("FACEBOOK_ICON"),
    EXTERNAL_LINK_ICON("EXTERNAL_LINK_ICON"),
    MESSENGER_ICON("MESSENGER_ICON"),
    INSTAGRAM_ICON("INSTAGRAM_ICON"),
    /* JADX INFO: Fake field, exist only in values array */
    OCULUS_ICON("OCULUS_ICON");

    public final String serverValue;

    C97c(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
