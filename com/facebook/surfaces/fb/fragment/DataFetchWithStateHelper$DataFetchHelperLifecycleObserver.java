package com.facebook.surfaces.fb.fragment;

import X.1sP;
import X.6tZ;
import androidx.lifecycle.LifecycleObserver;

/* loaded from: DataFetchWithStateHelper$DataFetchHelperLifecycleObserver.class */
public final class DataFetchWithStateHelper$DataFetchHelperLifecycleObserver implements LifecycleObserver {
    public final /* synthetic */ 6tZ A00;

    public DataFetchWithStateHelper$DataFetchHelperLifecycleObserver(6tZ r302) {
        this.A00 = r302;
    }

    public void onDestroy() {
        6tZ r0 = this.A00;
        r0.A07();
        r0.A06();
    }

    public void onStart() {
        6tZ r0 = this.A00;
        1sP.A00();
        r0.A0G.A00();
    }

    public void onStop() {
        6tZ.A03(this.A00);
    }
}
