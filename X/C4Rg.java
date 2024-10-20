package X;

/* renamed from: X.4Rg, reason: invalid class name */
/* loaded from: 4Rg.class */
public enum C4Rg implements C07n {
    UNKNOWN("unknown"),
    CALLS("calls"),
    CHATS("chats"),
    DRAWER("drawer"),
    FB_ENTRY_POINT("fb_entry_point"),
    INBOX_PROFILE_IMAGE("inbox_profile_image"),
    MARKETPLACE("marketplace"),
    MESSAGE_REQUESTS("message_requests"),
    SETTINGS("settings"),
    STORIES("stories"),
    SWITCH_ACCOUNT("switch_account"),
    IA_CHANNELS_FOLDER("ia_channels_folder");

    public final String mValue;

    C4Rg(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
