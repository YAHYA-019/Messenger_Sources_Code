package X;

/* renamed from: X.1UI, reason: invalid class name */
/* loaded from: 1UI.class */
public final class C1UI {
    public static volatile 04J A00;

    public static void A00(String str, Integer num, String str2) {
        String str3;
        if (A00 == null) {
            0fH.A17(C1UI.class.getName(), "Logger is null, skip logging for: %s", new Object[]{str});
            return;
        }
        1UG A002 = 1UD.A00(A00, 1ZG.A01, "messenger_msys_securemessage");
        if (A002.isSampled()) {
            A002.A7R("call_site", str);
            switch (num.intValue()) {
                case 0:
                    str3 = "ERROR";
                    break;
                case 1:
                    str3 = "WARN";
                    break;
                default:
                    str3 = "INFO";
                    break;
            }
            A002.A7R("event_type", str3);
            A002.A7R("extra_info", str2);
            A002.BZL();
        }
    }

    public static void A01(String str, String str2) {
        A00(str, 0S2.A00, str2);
    }
}
