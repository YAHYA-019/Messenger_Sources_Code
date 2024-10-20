package X;

/* renamed from: X.2dp, reason: invalid class name */
/* loaded from: 2dp.class */
public final class C2dp {
    public final 1Br A01 = 1Bq.A00(16634);
    public final 1Br A00 = 1Bu.A00(66245);

    public void A00(Integer num, Integer num2, int i) {
        11T.A0F(num2, 1);
        1UG A00 = 1UD.A00((04J) this.A01.A00.get(), 1ZG.A03, "messenger_android_alert_dialog_events");
        if (A00.isSampled()) {
            A00.A7R("feature_name", "notifications_system_permission_dialog");
            A00.A7R("event_type", "action");
            int intValue = num.intValue();
            String str = "cancel";
            if (intValue == 0) {
                str = "positive";
            } else if (intValue == 1) {
                str = "negative";
            }
            A00.A7R(AbstractC00603o4.A00(47), str);
            A00.A7R("action_stage", num2.intValue() != 0 ? "post_login" : "pre_login");
            A00.A6H("reshow_times", Long.valueOf(i));
            A00.BZL();
        }
    }
}
