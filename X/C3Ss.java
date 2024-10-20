package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.3Ss, reason: invalid class name */
/* loaded from: 3Ss.class */
public final class C3Ss {
    public 3EW A00;
    public String A01;
    public String A02;
    public final 1Br A03 = 1BK.A0D();
    public final 1Br A04 = 1BK.A0C();

    public static final void A00(98G r301, 3EW r302, 98A r303, C3Ss c3Ss, String str, String str2) {
        1UG A08 = 1BK.A08(1Br.A02(c3Ss.A03), "gaming_emoji_pong_pigeon_event");
        if (A08.isSampled()) {
            A08.A5c(r303, "event");
            A08.A5c(r301, TraceFieldType.ContentType);
            A08.A5c(r302, "entry_point");
            A08.A7R("session_id", str2);
            if (1Br.A07(c3Ss.A04).AZk(36322001553409035L)) {
                A08.A7R("message_id", str);
            }
            A08.BZL();
        }
    }

    public static void A01(98G r301, 98A r302, C3Ss c3Ss) {
        A00(r301, c3Ss.A00, r302, c3Ss, c3Ss.A01, c3Ss.A02);
    }
}
