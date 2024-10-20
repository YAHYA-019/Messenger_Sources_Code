package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* renamed from: X.2sa, reason: invalid class name */
/* loaded from: 2sa.class */
public final class C2sa extends Lifecycle {
    public static final C2sa A00 = new Lifecycle();
    public static final Lifecycle.State A01 = Lifecycle.State.RESUMED;

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return A01;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
    }
}
