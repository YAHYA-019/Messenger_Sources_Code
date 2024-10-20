package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.bubbles.activity.StaxThreadViewBubblesActivity;

/* loaded from: Cn0.class */
public final class Cn0 implements 7NA {
    public final /* synthetic */ StaxThreadViewBubblesActivity A00;

    public Cn0(StaxThreadViewBubblesActivity staxThreadViewBubblesActivity) {
        this.A00 = staxThreadViewBubblesActivity;
    }

    public final void CQM(ThreadKey threadKey) {
        this.A00.onBackPressed();
    }
}
