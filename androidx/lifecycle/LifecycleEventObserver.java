package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: LifecycleEventObserver.class */
public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
