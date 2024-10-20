package com.facebook.base.receiver;

import X.0FI;
import X.0Pz;
import X.0Xu;
import X.0Xv;
import X.0Zi;
import X.0fH;
import X.11T;
import X.C0ft;
import X.C0g6;
import X.C0t9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import java.util.LinkedList;
import java.util.stream.Collectors;

/* loaded from: AppInitReplayBroadcastReceiver.class */
public final class AppInitReplayBroadcastReceiver extends BroadcastReceiver {
    public static BroadcastReceiver.PendingResult A00;
    public static final LinkedList A02 = new LinkedList();
    public static final LinkedList A01 = new LinkedList();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A012 = 0FI.A01(1142214918);
        11T.A0F(context, 0);
        11T.A0F(intent, 1);
        0fH.A0n("AppInitBroadcast", 0Pz.A0W("Received broadcast during app init: ", intent.getAction()));
        LinkedList linkedList = A02;
        synchronized (linkedList) {
            try {
                linkedList.push(intent);
                C0ft.A06(C0g6.A4k, String.valueOf(linkedList.size()));
                C0ft.A06(C0g6.A4i, (String) linkedList.stream().map(0Xu.A00).collect(Collectors.joining(", ")));
                C0t9 A013 = 0Zi.A01(context);
                if (A013.A9O) {
                    if (A00 == null) {
                        0fH.A0n("AppInitBroadcast", "No PendingResult, creating one");
                        BroadcastReceiver.PendingResult goAsync = goAsync();
                        AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
                        A00 = goAsync;
                    } else {
                        0fH.A0n("AppInitBroadcast", "Existing PendingResult found, relying on that one");
                    }
                    if (A013.A2c) {
                        new Thread((Runnable) 0Xv.A00).start();
                    }
                }
            } catch (Throwable th) {
                0FI.A0D(1410107245, A012, intent);
                throw th;
            }
        }
        0FI.A0D(1438656871, A012, intent);
    }
}
