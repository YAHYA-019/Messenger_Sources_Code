package com.google.android.gms.wearable;

import X.0FI;
import android.os.IInterface;
import com.facebook.wearlistener.DataLayerListenerService;
import com.google.android.gms.internal.wearable.zzb;

/* loaded from: zzag.class */
public final class zzag extends zzb implements IInterface {
    public volatile int A00;
    public final /* synthetic */ DataLayerListenerService A01;

    public zzag() {
        int A03 = 0FI.A03(-665452977);
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        0FI.A09(-1155489951, A03);
        0FI.A09(-1568303735, 0FI.A03(1928322579));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzag(DataLayerListenerService dataLayerListenerService) {
        this();
        this.A01 = dataLayerListenerService;
        int A03 = 0FI.A03(768747878);
        this.A00 = -1;
        0FI.A09(-1973270492, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013f, code lost:
    
        if (X.L7Q.A00(r0, true) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(com.google.android.gms.wearable.zzag r301, java.lang.Object r302, java.lang.Runnable r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.zzag.A00(com.google.android.gms.wearable.zzag, java.lang.Object, java.lang.Runnable, java.lang.String):boolean");
    }
}
