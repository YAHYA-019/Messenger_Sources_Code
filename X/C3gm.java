package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3gm, reason: invalid class name */
/* loaded from: 3gm.class */
public final class C3gm implements Runnable {
    public static final String __redex_internal_original_name = "SelectiveSyncThreadListHandler$onInboxVisible$1";
    public final /* synthetic */ 2Wl A00;
    public final /* synthetic */ 1Hb A01;

    public C3gm(2Wl r302, 1Hb r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2Wl r0 = this.A00;
        FbUserSession fbUserSession = r0.A01;
        2bI r02 = (2bI) 1Lm.A05(r0.A00, fbUserSession, 66503);
        1Hb r03 = this.A01;
        11T.A0F(r03, 0);
        2bK r04 = (2bK) r02.A00.get(r03);
        if (r04 == null) {
            1BL.A1I(r03, "Skipping visible sync as no data exists for ", "SelectiveSyncThreadListHandler", AnonymousClass001.A0k());
            return;
        }
        0fH.A0j("SelectiveSyncThreadListHandler", "Running sync from now visible");
        2Wl.A02(fbUserSession, r04.A01, r0, r03, r04.A02, r04.A00, 2Wl.A00(r0).A0B);
    }
}
