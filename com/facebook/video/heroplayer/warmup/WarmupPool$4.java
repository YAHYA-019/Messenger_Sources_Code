package com.facebook.video.heroplayer.warmup;

import X.5L4;
import X.5N2;
import X.6VK;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: WarmupPool$4.class */
public final class WarmupPool$4 extends ResultReceiver {
    public final /* synthetic */ 6VK A00;
    public final /* synthetic */ 5L4 A01;
    public final /* synthetic */ 5N2 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarmupPool$4(6VK r302, 5L4 r303, 5N2 r304) {
        super(null);
        this.A02 = r304;
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        5L4 r0 = this.A01;
        6VK r02 = this.A00;
        r0.A0D(r02.A04, false);
        r02.A01();
    }
}
