package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AEd.class */
public final class AEd implements Runnable {
    public static final String __redex_internal_original_name = "QuickReplyController$hideQuickReply$internalEndAction$2";
    public final /* synthetic */ C6m8 A00;
    public final /* synthetic */ Runnable A01;

    public AEd(C6m8 c6m8, Runnable runnable) {
        this.A00 = c6m8;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6m8 c6m8 = this.A00;
        8Ao r0 = (8Ao) 1Br.A0B(c6m8.A0R);
        boolean z = c6m8.A0L;
        FbUserSession fbUserSession = c6m8.A07;
        if (fbUserSession == null) {
            throw 1BK.A0h();
        }
        r0.A00 = fbUserSession;
        r0.A02 = null;
        r0.A04 = z;
        r0.A07();
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}
