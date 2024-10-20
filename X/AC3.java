package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AC3.class */
public final class AC3 implements 1K9 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 6RU A02;
    public final /* synthetic */ 6RU A03;
    public final /* synthetic */ 7CK A04;
    public final /* synthetic */ 7CK A05;
    public final /* synthetic */ 2Og A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public AC3(FbUserSession fbUserSession, ThreadKey threadKey, 6RU r304, 6RU r305, 7CK r306, 7CK r307, 2Og r308, String str, boolean z) {
        this.A00 = fbUserSession;
        this.A02 = r304;
        this.A04 = r306;
        this.A06 = r308;
        this.A07 = str;
        this.A01 = threadKey;
        this.A08 = z;
        this.A03 = r305;
        this.A05 = r307;
    }

    public void onFailure(Throwable th) {
        C9mP.A02(this.A03, this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AC3.onSuccess(java.lang.Object):void");
    }
}
