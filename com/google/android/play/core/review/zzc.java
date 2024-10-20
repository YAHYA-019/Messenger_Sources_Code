package com.google.android.play.core.review;

import X.4FE;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: zzc.class */
public final class zzc extends ResultReceiver {
    public final /* synthetic */ 4FE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, 4FE r303) {
        super(handler);
        this.A00 = r303;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.A00.A03((Object) null);
    }
}
