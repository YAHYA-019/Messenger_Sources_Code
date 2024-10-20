package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: C75.class */
public final class C75 {
    public final 1Br A00;
    public final 1De A01;

    public C75(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = 7zL.A0S(fbUserSession, r303, 67488);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r302.A09() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.1FV A00(com.facebook.user.model.User r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75.A00(com.facebook.user.model.User, boolean):X.1FV");
    }

    public final SettableFuture A01(ThreadSummary threadSummary) {
        ThreadKey A0f = AbF.A0f(threadSummary);
        2bT r0 = new 2bT();
        ((5P5) 1Br.A0B(this.A00)).A05(new A1d((Function1) new C2xy(r0, r0, new AV8(32, threadSummary, this, A0f), 1, false), 88), A0f.A04);
        return r0.A00;
    }
}
