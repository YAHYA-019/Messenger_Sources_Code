package com.google.android.gms.internal.gtm;

import X.K6k;
import X.L9t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: zzcj.class */
public final class zzcj extends BroadcastReceiver {
    public boolean A00;
    public boolean A01;
    public final L9t A02;

    public zzcj(L9t l9t) {
        this.A02 = l9t;
    }

    public static void A00(K6k k6k) {
        Context context = k6k.A06.A02.A00;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra("com.google.android.gms.internal.gtm.zzcj", true);
        context.sendOrderedBroadcast(intent, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        if (r0.isConnected() == false) goto L25;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r302, android.content.Intent r303) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcj.onReceive(android.content.Context, android.content.Intent):void");
    }
}
