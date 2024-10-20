package X;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* renamed from: X.0ww, reason: invalid class name */
/* loaded from: 0ww.class */
public final class C0ww implements 0Tx {
    public final Lifecycle A00;
    public final LifecycleEventObserver A01;
    public final 0Tx A02;

    public C0ww(0Tx r302, Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.A00 = lifecycle;
        this.A02 = r302;
        this.A01 = lifecycleEventObserver;
    }

    public void Bza(String str, Bundle bundle) {
        this.A02.Bza(str, bundle);
    }
}
