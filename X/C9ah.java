package X;

/* renamed from: X.9ah, reason: invalid class name */
/* loaded from: 9ah.class */
public final class C9ah {
    public final 1Br A00 = 1BK.A0D();
    public final java.util.Map A01 = 1BK.A1C();

    public final void A00(String str, String str2, String str3, boolean z) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(932));
        if (A08.isSampled()) {
            A08.A7R("thread_session_id", AnonymousClass001.A0b(str, this.A01));
            7zL.A1F(A08, str);
            A08.A7R("pip_position_corners", str2);
            A08.A7R("pip_click_type", str3);
            A08.A7R("screen_orientation", DKB.A00(z ? 109 : 126));
            A08.BZL();
        }
    }

    public final void A01(String str, boolean z) {
        11T.A0F(str, 0);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(933));
        if (A08.isSampled()) {
            String A0b = AnonymousClass001.A0b(str, this.A01);
            A08.A7R("status", z ? "enabled" : "disabled");
            A08.A7R("thread_session_id", A0b);
            7zL.A1F(A08, str);
            A08.BZL();
        }
    }
}
