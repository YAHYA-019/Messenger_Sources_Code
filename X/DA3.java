package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.rtc.interfaces.CallSurfaceLoggingParams;

/* loaded from: DA3.class */
public final class DA3 implements Runnable {
    public static final String __redex_internal_original_name = "CowatchCtaHandler$invoke$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ ThreadKey A03;
    public final /* synthetic */ C7u A04;

    public DA3(View view, FbUserSession fbUserSession, 1Br r304, ThreadKey threadKey, C7u c7u) {
        this.A03 = threadKey;
        this.A04 = c7u;
        this.A00 = view;
        this.A01 = fbUserSession;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadKey threadKey = this.A03;
        if (threadKey.A1F()) {
            this.A04.A01(4YU.A08(this.A00), threadKey, null, null, "cowatch_xma", null, true);
        } else {
            if (!threadKey.A1K()) {
                0fH.A0k(4YT.A00(568), "ThreadKey is neither group nor p2p");
                return;
            }
            ((C5V0) 1Br.A0B(this.A02)).A0B(4YU.A08(this.A00), this.A01, new BHl(threadKey, (CallSurfaceLoggingParams) null, "cowatch_xma", (String) null, "cta", 4001, threadKey.A02, true, false));
        }
    }
}
