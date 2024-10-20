package X;

import android.content.BroadcastReceiver;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* loaded from: Llr.class */
public final class Llr implements Runnable {
    public static final String __redex_internal_original_name = "zzc";
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;

    public Llr(BroadcastReceiver.PendingResult pendingResult) {
        this.A00 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.A00;
        if (pendingResult != null) {
            pendingResult.finish();
            AsyncBroadcastReceiverObserver.finish(pendingResult);
        }
    }
}
