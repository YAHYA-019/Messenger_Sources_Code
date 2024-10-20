package X;

/* renamed from: X.67Z, reason: invalid class name */
/* loaded from: 67Z.class */
public enum C67Z {
    FACEBOOK(0, "com.facebook.auth.login", "com.facebook.katana"),
    FACEBOOK_DEBUG(1, "com.facebook.auth.login", "com.facebook.wakizashi"),
    FACEBOOK_LITE(2, "com.facebook.lite", "com.facebook.lite"),
    INSTAGRAM(3, "www.instagram.com", "com.instagram.android"),
    INSTAGRAM_WITH_V2_PROVIDER(4, "www.instagram.com", "com.instagram.android"),
    MLITE(5, "com.facebook.mlite", "com.facebook.mlite"),
    MESSENGER(6, "com.facebook.messenger", "com.facebook.orca"),
    MESSENGER_WITH_LITE_PROVIDER(7, "com.facebook.messenger", "com.facebook.orca"),
    OCULUS(8, "com.oculus.twilight", "com.oculus.twilight"),
    MWA(9, "com.facebook.stella", "com.facebook.stella"),
    MWA_DEBUG(10, "com.facebook.stella_debug", "com.facebook.stella_debug"),
    UNKNOWN(11, "unknown", "unknown");

    public final String mAccountManagerType;
    public final String mPackageName;
    public final String mPrefPrefix;

    C67Z(int i, String str, String str2) {
        this.mPrefPrefix = r303;
        this.mAccountManagerType = str;
        this.mPackageName = str2;
    }
}
