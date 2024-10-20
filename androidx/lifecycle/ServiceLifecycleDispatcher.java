package androidx.lifecycle;

import X.11T;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* loaded from: ServiceLifecycleDispatcher.class */
public class ServiceLifecycleDispatcher {
    public final Handler handler = new Handler();
    public DispatchRunnable lastDispatchRunnable;
    public final LifecycleRegistry registry;

    /* loaded from: ServiceLifecycleDispatcher$DispatchRunnable.class */
    public final class DispatchRunnable implements Runnable {
        public final Lifecycle.Event event;
        public final LifecycleRegistry registry;
        public boolean wasExecuted;

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            11T.A0F(lifecycleRegistry, 1);
            this.registry = lifecycleRegistry;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        this.registry = new LifecycleRegistry(lifecycleOwner);
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        this.handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
