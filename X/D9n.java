package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* loaded from: D9n.class */
public final class D9n implements Runnable {
    public static final String __redex_internal_original_name = "JoinRequestIntentHandler$2";
    public final /* synthetic */ C00i A00;
    public final /* synthetic */ C4Tt A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ UserKey A03;

    public D9n(C00i c00i, C4Tt c4Tt, ThreadKey threadKey, UserKey userKey) {
        this.A01 = c4Tt;
        this.A02 = threadKey;
        this.A00 = c00i;
        this.A03 = userKey;
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadKey threadKey = this.A02;
        if (threadKey != null) {
            boolean A1A = threadKey.A1A();
            CNV cnv = (CNV) this.A00.get();
            if (!A1A) {
                cnv.A02(threadKey);
                return;
            }
            UserKey userKey = this.A03;
            synchronized (cnv) {
                C00i c00i = cnv.A02;
                ((4aO) c00i.get()).A03(threadKey.A0u(), 10134);
                ((4aO) c00i.get()).A03(0Pz.A0j(threadKey.A0u(), ":", userKey.id), 10134);
            }
        }
    }
}
