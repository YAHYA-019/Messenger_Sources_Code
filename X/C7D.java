package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: C7D.class */
public final class C7D {
    public final 1Br A00 = 1BK.A0D();
    public final 1Br A01 = 1BK.A0C();

    public final void A00(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "community_messaging_rooms_client_event");
        if (1Br.A07(this.A01).AZk(36318612822635311L) || !A08.isSampled()) {
            return;
        }
        0DA r0 = new 0DA();
        BRC brc = (BRC) 1Lo.A08(fbUserSession, 84146);
        String str = brc.A00;
        if (str == null) {
            str = 1BK.A0t();
            brc.A00 = str;
        }
        if (str == null) {
            str = "";
        }
        r0.A07("funnel_session_id", str);
        A08.A7R("client_event", "link_shared");
        A08.A7T(r0, "session_ids");
        AbK.A1H(BOc.A01, A08);
        A08.A5c(BOd.A03, "sheet_type");
        A08.BZL();
    }

    public final void A01(FbUserSession fbUserSession) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "community_messaging_rooms_client_event");
        if (1Br.A07(this.A01).AZk(36318612822635311L) || !A08.isSampled()) {
            return;
        }
        0DA r0 = new 0DA();
        BRC brc = (BRC) 1Lo.A08(fbUserSession, 84146);
        String str = brc.A00;
        if (str == null) {
            str = 1BK.A0t();
            brc.A00 = str;
        }
        if (str == null) {
            str = "";
        }
        r0.A07("funnel_session_id", str);
        A08.A7R("client_event", "room_toggle_in_cm_thread_tap");
        A08.A7T(r0, "session_ids");
        AbK.A1H(BOc.A02, A08);
        A08.A5c(BOd.A01, "sheet_type");
        A08.BZL();
    }
}
