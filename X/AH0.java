package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AH0.class */
public final class AH0 implements Runnable {
    public static final String __redex_internal_original_name = "ArmadilloThreadSendAttemptLoggerPluginSpec$logMessageSendRequest$1$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ 6RU A03;
    public final /* synthetic */ String A04;

    public AH0(FbUserSession fbUserSession, ThreadKey threadKey, ThreadKey threadKey2, 6RU r305, String str) {
        this.A01 = threadKey;
        this.A00 = fbUserSession;
        this.A03 = r305;
        this.A02 = threadKey2;
        this.A04 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A01.A0w() ? 16 : 15;
        FbUserSession fbUserSession = this.A00;
        Context context = this.A03.A00;
        C9Ju c9Ju = (C9Ju) 1Lm.A05(context, fbUserSession, 67489);
        5P5 r0 = (5P5) 1Lm.A05(context, fbUserSession, 67488);
        ThreadKey threadKey = this.A02;
        long A0s = threadKey.A0s();
        java.util.Map map = c9Ju.A00;
        if (map.get(Long.valueOf(A0s)) == null) {
            r0.A02(new A0R(c9Ju, threadKey, this.A04, 6, j), threadKey.A0s());
            return;
        }
        Object obj = map.get(7zO.A0k(threadKey));
        if (obj == null) {
            obj = null;
        }
        9Cg.A00((Long) obj, this.A04, j);
    }
}
