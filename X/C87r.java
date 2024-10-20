package X;

/* renamed from: X.87r, reason: invalid class name */
/* loaded from: 87r.class */
public enum C87r {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    BLOCK_STORE("BLOCK_STORE"),
    CLOUDKIT("CLOUDKIT"),
    GOOGLE_DRIVE("GOOGLE_DRIVE"),
    GOOGLE_ONE_AUTO_BACKUP("GOOGLE_ONE_AUTO_BACKUP"),
    HSM("HSM"),
    ICLOUD_DRIVE("ICLOUD_DRIVE"),
    ICLOUD_KEYCHAIN("ICLOUD_KEYCHAIN"),
    ICLOUD_KVS("ICLOUD_KVS"),
    KEYCHAIN("KEYCHAIN"),
    OFFLINE("OFFLINE"),
    PASSKEY("PASSKEY"),
    SECURITY_QUESTION_HSM("SECURITY_QUESTION_HSM"),
    /* JADX INFO: Fake field, exist only in values array */
    TRUSTED_CONTACT("TRUSTED_CONTACT");

    public final String serverValue;

    C87r(String str) {
        this.serverValue = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
