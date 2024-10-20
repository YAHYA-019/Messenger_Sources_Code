package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: J0e.class */
public final class J0e implements Runnable {
    public static final String __redex_internal_original_name = "ThreadIdUpdatesModelHandler$checkForThreadIdChange$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ IY2 A01;
    public final /* synthetic */ String A02;

    public J0e(FbUserSession fbUserSession, IY2 iy2, String str) {
        this.A00 = fbUserSession;
        this.A01 = iy2;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2QN r0 = (2QN) 4YU.A0n(this.A00, this.A01.A02, 99978);
        ThreadKey threadKey = r0.A05;
        String valueOf = String.valueOf(threadKey != null ? 4YU.A0l(threadKey) : null);
        String str = this.A02;
        if (str == null || str.equals(valueOf)) {
            return;
        }
        4zI.A03.A05("ThreadIdUpdatesModelHandler", "Updated group thread id for call to %s", new Object[]{str});
        r0.A04(ThreadKey.A08(Long.parseLong(str)));
    }
}
