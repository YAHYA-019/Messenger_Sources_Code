package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* renamed from: X.3i3, reason: invalid class name */
/* loaded from: 3i3.class */
public final /* synthetic */ class C3i3 implements Runnable {
    public static final String __redex_internal_original_name = "MicroBatchUploadManager$JobRanReceiver$$ExternalSyntheticLambda0";
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ 4mL A03;

    public /* synthetic */ C3i3(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, 4mL r305) {
        this.A03 = r305;
        this.A01 = context;
        this.A02 = intent;
        this.A00 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        4mL r0 = this.A03;
        Context context = this.A01;
        Intent intent = this.A02;
        BroadcastReceiver.PendingResult pendingResult = this.A00;
        4mL.A00(context, intent, r0);
        if (pendingResult != null) {
            pendingResult.finish();
            AsyncBroadcastReceiverObserver.finish(pendingResult);
        }
    }
}
