package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.5y4, reason: invalid class name */
/* loaded from: 5y4.class */
public final class C5y4 {
    public 1BY A00;
    public final FbUserSession A01;
    public final FbUserSession A02;
    public final C00i A06;
    public final C00i A08;
    public final C00i A0A;
    public final C00i A03 = new 1BQ(16458);
    public final C00i A0B = new 1BV((1BY) null, 16671);
    public final C00i A04 = new 1BQ(66265);
    public final C00i A07 = new 1BQ(66584);
    public final C00i A05 = new 1BV((1BY) null, 83613);
    public final C00i A09 = new 1BV((1BY) null, 67581);

    public C5y4(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        Integer num = 1Lo.A05;
        this.A06 = new 1MV(fbUserSession, (1BY) null, 49711);
        this.A02 = fbUserSession;
        this.A08 = new 1MV(fbUserSession, (1BY) null, 82714);
        this.A0A = new 1MV(fbUserSession, (1BY) null, 67578);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static SettableFuture A00(ThreadKey threadKey, C5y4 c5y4, String str, boolean z) {
        int A00 = 5Xa.A00(threadKey);
        0fH.A0j("MsysLookupService", "load thread by key");
        FbUserSession fbUserSession = c5y4.A01;
        1BY r0 = c5y4.A00;
        22B r02 = (22B) 1Lo.A04((Context) null, fbUserSession, r0, 84153);
        Executor executor = (Executor) 1Bn.A0E((Context) null, r0, 16478);
        ?? obj = new Object();
        MailboxFutureImpl A01 = r02.A01(0, (Number) null, String.valueOf(threadKey.A0s()), str, A00, 0, 0, threadKey.A0s(), false, false, false, z, false, false, true, false, ((1SI) c5y4.A0B.get()).A07());
        A01.A00(executor);
        A01.Cu4(new Cy7(A00, 0, threadKey, c5y4, obj, executor));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A01(int i, boolean z) {
        22B r0 = (22B) 1Lo.A04((Context) null, this.A01, this.A00, 84153);
        Executor executor = (Executor) 1Bi.A03(16449);
        ?? obj = new Object();
        String str = 1F9.A0I.dbName;
        boolean A07 = ((1SI) this.A0B.get()).A07();
        C00i c00i = this.A07;
        MailboxFutureImpl A02 = r0.A02((Number) null, (Number) null, str, (List) null, (List) null, i, true, false, z, false, false, true, A07, ((1Ux) c00i.get()).A02(), ((1Ux) c00i.get()).A03());
        A02.A00(executor);
        A02.Cu4(new Cze(this, (Object) obj, 7));
        return obj;
    }
}
