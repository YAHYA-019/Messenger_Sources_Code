package X;

import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AFt.class */
public final class AFt implements Runnable {
    public static final String __redex_internal_original_name = "QuickReplyController$quickReplyListener$1$onItemClick$callbackRunnable$1";
    public final /* synthetic */ C6m8 A00;
    public final /* synthetic */ QuickReplyItem A01;
    public final /* synthetic */ ThreadKey A02;

    public AFt(C6m8 c6m8, QuickReplyItem quickReplyItem, ThreadKey threadKey) {
        this.A00 = c6m8;
        this.A01 = quickReplyItem;
        this.A02 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Rw r0 = this.A00.A09;
        if (r0 != null) {
            r0.A00(this.A01, this.A02);
        }
    }
}
