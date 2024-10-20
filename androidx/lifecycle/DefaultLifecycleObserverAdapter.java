package androidx.lifecycle;

import X.11T;
import X.AnonymousClass001;
import androidx.lifecycle.Lifecycle;

/* loaded from: DefaultLifecycleObserverAdapter.class */
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    public final DefaultLifecycleObserver defaultLifecycleObserver;
    public final LifecycleEventObserver lifecycleEventObserver;

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        11T.A0F(defaultLifecycleObserver, 1);
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(lifecycleOwner, 0);
        11T.A0F(event, 1);
        switch (event) {
            case ON_CREATE:
                this.defaultLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case ON_START:
                this.defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case ON_RESUME:
                this.defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case ON_PAUSE:
                this.defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case ON_STOP:
                this.defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case ON_DESTROY:
                this.defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case ON_ANY:
                throw AnonymousClass001.A0L("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.lifecycleEventObserver;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
