package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3i7, reason: invalid class name */
/* loaded from: 3i7.class */
public final class C3i7 implements Runnable {
    public static final String __redex_internal_original_name = "SelectiveSyncThreadListHandler$updateSyncForFilter$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 2Wl A01;
    public final /* synthetic */ 1Hb A02;
    public final /* synthetic */ String A03;

    public C3i7(FbUserSession fbUserSession, 2Wl r303, 1Hb r304, String str) {
        this.A00 = fbUserSession;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbUserSession fbUserSession = this.A00;
        2Wl r0 = this.A01;
        2bI r02 = (2bI) 1Lm.A05(r0.A00, fbUserSession, 66503);
        1Hb r03 = this.A02;
        2bK r04 = (2bK) r02.A00.get(r03);
        if (r04 == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Skipping filter ");
            A0k.append(this.A03);
            1BL.A1I(r03, " sync as no data exists for ", "SelectiveSyncThreadListHandler", A0k);
            return;
        }
        1BK.A1Q("Running sync from filter ", this.A03, "SelectiveSyncThreadListHandler");
        2Wl.A02(fbUserSession, r04.A01, r0, r03, r04.A02, r04.A00, 2Wl.A00(r0).A07);
    }
}
