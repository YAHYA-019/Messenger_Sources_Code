package X;

/* renamed from: X.2h8, reason: invalid class name */
/* loaded from: 2h8.class */
public final class C2h8 {
    public final 1Br A00 = 1Bq.A00(16634);

    public final void A00(boolean z) {
        2R2 A06 = 2R2.A06(1Br.A02(this.A00));
        if (((0D7) A06).A00.isSampled()) {
            A06.A0E("event", "new_friend_bump_notification_setting_updated");
            A06.A0B("notification_setting_enabled", Boolean.valueOf(z));
            A06.BZL();
        }
    }
}
