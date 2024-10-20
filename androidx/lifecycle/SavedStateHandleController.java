package androidx.lifecycle;

import X.1BK;
import androidx.lifecycle.Lifecycle;
import java.io.Closeable;

/* loaded from: SavedStateHandleController.class */
public final class SavedStateHandleController implements Closeable, LifecycleEventObserver {
    public final SavedStateHandle handle;
    public boolean isAttached;
    public final String key;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.key = str;
        this.handle = savedStateHandle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        1BK.A1M(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
