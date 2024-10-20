package X;

/* renamed from: X.4FI, reason: invalid class name */
/* loaded from: 4FI.class */
public enum C4FI {
    APP_MANAGER_DISABLED(false),
    INSTALLER_DISABLED(false),
    APP_MANAGER_NOT_INSTALLED(true),
    INSTALLER_NOT_INSTALLED(true),
    APP_MANAGER_BAD_SIGNATURE(true),
    INSTALLER_BAD_SIGNATURE(true),
    INSTALLER_NO_PRIVILEGES(true),
    INSTALLER_MISSING_PRIVILEGE(true),
    INSTALLER_INVALID_PRIVILEGE(true),
    INCOMPATIBLE(true),
    UNRECOGNIZED_CONFIGURATION(true),
    FACEBOOK_SERVICES_NO_PERMISSION(true),
    FACEBOOK_SERVICES_NO_DOZE_MODE_WHITELIST(true),
    /* JADX INFO: Fake field, exist only in values array */
    FACEBOOK_SERVICES_NO_PRIVATE_API_WHITELIST(true);

    public final boolean isPresenceIssue;

    C4FI(boolean z) {
        this.isPresenceIssue = z;
    }
}
