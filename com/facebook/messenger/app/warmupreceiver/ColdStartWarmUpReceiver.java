package com.facebook.messenger.app.warmupreceiver;

import X.0FI;
import X.1Bi;
import X.2yD;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.facebook.messenger.app.warmupreceiver.ColdStartWarmUpReceiver;

/* loaded from: ColdStartWarmUpReceiver.class */
public class ColdStartWarmUpReceiver extends BroadcastReceiver {
    public volatile BroadcastReceiver.PendingResult A00 = null;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(552593461);
        final long Auy = ((2yD) 1Bi.A03(16385)).Auy(36606272552181133L);
        BroadcastReceiver.PendingResult goAsync = goAsync();
        AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
        this.A00 = goAsync;
        new Thread(new Runnable() { // from class: X.3rh
            public static final String __redex_internal_original_name = "ColdStartWarmUpReceiver$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                BroadcastReceiver.PendingResult pendingResult;
                ColdStartWarmUpReceiver coldStartWarmUpReceiver = ColdStartWarmUpReceiver.this;
                long j = Auy;
                try {
                    if (j != -1) {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            try {
                                if (coldStartWarmUpReceiver.A00 != null) {
                                    BroadcastReceiver.PendingResult pendingResult2 = coldStartWarmUpReceiver.A00;
                                    pendingResult2.finish();
                                    AsyncBroadcastReceiverObserver.finish(pendingResult2);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            throw th;
                        }
                        if (coldStartWarmUpReceiver.A00 == null) {
                            return;
                        }
                        pendingResult = coldStartWarmUpReceiver.A00;
                        pendingResult.finish();
                    } else {
                        if (coldStartWarmUpReceiver.A00 == null) {
                            return;
                        }
                        pendingResult = coldStartWarmUpReceiver.A00;
                        pendingResult.finish();
                    }
                    AsyncBroadcastReceiverObserver.finish(pendingResult);
                } catch (IllegalStateException unused3) {
                }
            }
        }).start();
        0FI.A0D(1394703371, A01, intent);
    }
}
