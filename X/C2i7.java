package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.2i7, reason: invalid class name */
/* loaded from: 2i7.class */
public final class C2i7 {
    public final 1Br A00 = 1Bq.A00(16634);
    public final 1Br A01 = 1Bq.A00(16385);

    /* JADX WARN: Type inference failed for: r0v6, types: [X.7cW, X.0DA] */
    public static final C7cW A00(FbUserSession fbUserSession) {
        2kS r0 = (2kS) 1Lo.A08(fbUserSession, 66483);
        String str = ((1G1) fbUserSession).A02;
        ?? r02 = new 0DA();
        r02.A04("active_now", A01(2kS.A00(r0), 2kS.A01.A0F(str), 1.0d));
        r02.A04("note_click", A01(2kS.A00(r0), 2kS.A02.A0F(str), 0.0d));
        r02.A04("note", A01(2kS.A00(r0), 2kS.A03.A0F(str), 0.0d));
        r02.A04("note_impression", A01(2kS.A00(r0), 2kS.A04.A0F(str), 0.0d));
        r02.A04("note_recency", A01(2kS.A00(r0), 2kS.A05.A0F(str), 0.416d));
        r02.A04("note_reply", A01(2kS.A00(r0), 2kS.A06.A0F(str), -500.0d));
        r02.A04(GOm.A00(30), A01(2kS.A00(r0), 2kS.A07.A0F(str), -500.0d));
        r02.A04("presence", A01(2kS.A00(r0), 2kS.A08.A0F(str), 0.416d));
        r02.A04("story_recency", A01(2kS.A00(r0), 2kS.A0B.A0F(str), 0.0d));
        r02.A04("story", A01(2kS.A00(r0), 2kS.A0C.A0F(str), 0.0d));
        return r02;
    }

    public static Double A01(FbSharedPreferences fbSharedPreferences, 1G2 r302, double d) {
        return Double.valueOf(fbSharedPreferences.Ai9(r302, d));
    }

    public static final void A02(3yM r301, C34P c34p, 3yP r303, C2i7 c2i7) {
        1UG A00 = 1UD.A00((04J) c2i7.A00.A00.get(), 1ZG.A01, "messenger_inbox_tray_event");
        if (A00.isSampled()) {
            A00.A5c(r301, "event_type");
            0DA r0 = new 0DA();
            r0.A01(3yU.A06, "major_surface");
            r0.A01(3yV.A0C, "minor_surface");
            A00.A7T(r0, "surface");
            A00.A7T(r303, "target");
            A00.A7T(c34p, "action_context");
            A00.BZL();
        }
    }

    public static final boolean A03(C2i7 c2i7, Integer num, boolean z) {
        return ((2yD) c2i7.A01.A00.get()).AZk(num == 0S2.A00 ? z ? 36326627231291121L : 36326627231225584L : z ? 36326627231422195L : 36326627231356658L);
    }
}
