package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: D8u.class */
public final class D8u implements Runnable {
    public static final String __redex_internal_original_name = "CommunityTabIntentHandlerDelegate$scheduleThreadSummaryObserverTimeoutRemoval$1";
    public final /* synthetic */ LiveData A00;
    public final /* synthetic */ Observer A01;
    public final /* synthetic */ C6H A02;

    public D8u(LiveData liveData, Observer observer, C6H c6h) {
        this.A00 = liveData;
        this.A01 = observer;
        this.A02 = c6h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeObserver(this.A01);
        this.A02.A00((ThreadSummary) null);
    }
}
