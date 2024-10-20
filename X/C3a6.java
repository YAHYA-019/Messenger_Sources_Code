package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.msys.MontageMsysThreadListBroadcastListener;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3a6, reason: invalid class name */
/* loaded from: 3a6.class */
public final class C3a6 implements 2Ux {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ MontageMsysThreadListBroadcastListener A01;

    public C3a6(FbUserSession fbUserSession, MontageMsysThreadListBroadcastListener montageMsysThreadListBroadcastListener) {
        this.A01 = montageMsysThreadListBroadcastListener;
        this.A00 = fbUserSession;
    }

    public final void CSk(C2f5 c2f5, String str, String str2, Set set) {
        MontageMsysThreadListBroadcastListener montageMsysThreadListBroadcastListener = this.A01;
        new ArrayList(set);
        FbUserSession fbUserSession = this.A00;
        0fH.A0d(str, c2f5, "MontageMsysThreadListBroadcastListener", "onUpdateThreads: intent=%s, refreshType=%s");
        if ("com.facebook.orca.ACTION_THREAD_LIST_UPDATED_FOR_UI".equals(str) || "com.facebook.orca.ACTION_MULTIPLE_THREADS_UPDATED_FOR_UI".equals(str)) {
            ((C05214d9) 1Br.A0B(montageMsysThreadListBroadcastListener.A02)).A00(fbUserSession);
        }
    }
}
