package X;

/* renamed from: X.989, reason: invalid class name */
/* loaded from: 989.class */
public enum AnonymousClass989 implements C07n {
    /* JADX INFO: Fake field, exist only in values array */
    FORWARD_SHARE_ANYWAY("forward_cancel"),
    /* JADX INFO: Fake field, exist only in values array */
    FORWARD_SHARE_ANYWAY("forward_friction_impression"),
    /* JADX INFO: Fake field, exist only in values array */
    FORWARD_SHARE_ANYWAY("forward_share_anyway"),
    IMPRESSION("impression"),
    TAP_TO_REVEAL("tap_to_reveal"),
    VIEW_INFO_CLICK("view_info_click");

    public final String mValue;

    AnonymousClass989(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
