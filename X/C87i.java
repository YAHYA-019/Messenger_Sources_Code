package X;

/* renamed from: X.87i, reason: invalid class name */
/* loaded from: 87i.class */
public enum C87i {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ANDROID("ANDROID"),
    GOOGLE_DRIVE("GOOGLE_DRIVE"),
    GOOGLE_ONE_AUTO_BACKUP("GOOGLE_ONE_AUTO_BACKUP"),
    ICLOUD_KEYCHAIN("ICLOUD_KEYCHAIN"),
    /* JADX INFO: Fake field, exist only in values array */
    IOS("IOS");

    public final String serverValue;

    C87i(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
