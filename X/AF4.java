package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AF4.class */
public final class AF4 implements Runnable {
    public static final String __redex_internal_original_name = "PinnedMessagesViewData$getPinnedMessagesLiveData$1$onChanged$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ C9qp A01;

    public AF4(ThreadKey threadKey, C9qp c9qp) {
        this.A01 = c9qp;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9qp.A00(this.A00, this.A01);
    }
}
