package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.1q4, reason: invalid class name */
/* loaded from: 1q4.class */
public final class C1q4 implements LifecycleEventObserver {
    public final /* synthetic */ 1pL A00;

    public C1q4(1pL r302) {
        this.A00 = r302;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        View view;
        if (event != Lifecycle.Event.ON_STOP || (view = this.A00.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
