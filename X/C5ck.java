package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.database.threads.switchaccountcacher.ThreadsDbCacherCryptoHelper;

/* renamed from: X.5ck, reason: invalid class name */
/* loaded from: 5ck.class */
public final class C5ck {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A03;
    public final C00i A05;
    public final C00i A08;
    public final String A09;
    public final C00i A07 = new 1BQ(83604);
    public final C00i A06 = new 1BQ(49315);
    public final C00i A02 = new 1BQ(131166);
    public final C00i A04 = new 1BQ(16688);

    public C5ck(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Context A00 = FbInjector.A00();
        Integer num = 1Lo.A05;
        this.A03 = new 1MV(fbUserSession, (1BY) null, 49998);
        this.A05 = new 1MV(fbUserSession, (1BY) null, 50001);
        this.A09 = A00.getDatabasePath("threads_db2").getPath();
        this.A08 = new 1MV(fbUserSession, (1BY) null, 98705);
    }

    public void A00(String str) {
        if (this.A07.get() != C0et.A0U) {
            5Xg.A03(str, "sequence_id");
            5Xg.A03(str, "sync_token");
            5Xg.A03(str, JQw.A00(302));
            5Xg.A03(str, JQw.A00(301));
            InterfaceC00051a0 AP5 = 1Oy.A00(C0f1.A00()).AP5();
            AP5.Cdi(JQw.A00(193).concat(str));
            AP5.apply();
            ThreadsDbCacherCryptoHelper.clearThreadsDbCacherKey(str);
            AnonymousClass001.A0E(0Pz.A0v(this.A09, "-", str, ".enc")).delete();
        }
    }
}
