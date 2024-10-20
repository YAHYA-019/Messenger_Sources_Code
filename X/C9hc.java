package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9hc, reason: invalid class name */
/* loaded from: 9hc.class */
public final class C9hc {
    public final 1Br A00 = 1BK.A0D();

    public static final void A00(EQw eQw, C9hc c9hc, String str) {
        1UG A08 = 1BK.A08(1Br.A02(c9hc.A00), "meta_ai_memu_onboarding");
        if (A08.isSampled()) {
            A08.A5c(eQw, "event_type");
            A08.A5c(EQa.A05, "entry_point");
            A08.A7R("surface_session_id", str);
            A08.A7R("thread_type", C1yg.AI_BOT.toString());
            A08.BZL();
        }
    }

    public final void A01(ThreadKey threadKey, String str) {
        C1yg c1yg;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "meta_ai_memu_onboarding");
        if (A08.isSampled()) {
            A08.A5c(EQw.A0J, "event_type");
            A08.A5c(EQa.A06, "entry_point");
            A08.A7R("surface_session_id", str);
            A08.A7R("thread_type", (threadKey == null || (c1yg = threadKey.A06) == null) ? null : c1yg.toString());
            A08.BZL();
        }
    }

    public final void A02(ThreadKey threadKey, String str) {
        C1yg c1yg;
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "meta_ai_memu_onboarding");
        if (A08.isSampled()) {
            A08.A5c(EQw.A0K, "event_type");
            A08.A5c(EQa.A06, "entry_point");
            A08.A7R("surface_session_id", str);
            A08.A7R("thread_type", (threadKey == null || (c1yg = threadKey.A06) == null) ? null : c1yg.toString());
            A08.BZL();
        }
    }
}
