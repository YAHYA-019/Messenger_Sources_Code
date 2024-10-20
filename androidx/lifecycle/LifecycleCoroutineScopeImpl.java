package androidx.lifecycle;

import X.0DE;
import X.11T;
import X.2aK;
import X.2aN;
import X.2sD;
import androidx.lifecycle.Lifecycle;

/* loaded from: LifecycleCoroutineScopeImpl.class */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final 0DE coroutineContext;
    public final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, 0DE r303) {
        11T.A0F(r303, 2);
        this.lifecycle = lifecycle;
        this.coroutineContext = r303;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            2sD.A01(this.coroutineContext);
        }
    }

    public 0DE getCoroutineContext() {
        return this.coroutineContext;
    }

    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (this.lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            this.lifecycle.removeObserver(this);
            2sD.A01(this.coroutineContext);
        }
    }

    public final void register() {
        2aK.A03(null, 2aN.A00().A01(), new LifecycleCoroutineScopeImpl$register$1(this, null), this, 2);
    }
}
