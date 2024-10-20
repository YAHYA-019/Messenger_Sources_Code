package com.facebook.analytics2.logger.legacy.uploader;

import X.0FI;
import X.C09h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* loaded from: HighPriUploadRetryReceiver.class */
public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        int i;
        int A01 = 0FI.A01(393819729);
        if (!C09h.A03().A04(context, intent, this)) {
            i = -1841735270;
        } else if ("com.facebook.analytics2.logger.UPLOAD_NOW".equals(intent.getAction())) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
            new Thread() { // from class: X.3jq
                public static final String __redex_internal_original_name = "HighPriUploadRetryReceiver$1";

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        Bundle extras = intent.getExtras();
                        Context context2 = context;
                        4mV A00 = 4mV.A00(context2, extras);
                        49O.A00(context2).A05(new 4mV(context2, (Bundle) null, (Messenger) null, A00.A06, new 4mU(0L, 0L, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", A00.A02), "com.facebook.analytics2.logger.UPLOAD_NOW");
                        BroadcastReceiver.PendingResult pendingResult = goAsync;
                        pendingResult.finish();
                        AsyncBroadcastReceiverObserver.finish(pendingResult);
                    } catch (4EL e) {
                        0fH.A0w("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
                    }
                }
            }.start();
            i = -1107968825;
        } else {
            i = -1061341555;
        }
        0FI.A0D(i, A01, intent);
    }
}
