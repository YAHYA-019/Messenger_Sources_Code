package androidx.lifecycle;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import androidx.lifecycle.Lifecycle;

/* loaded from: SavedStateHandleAttacher.class */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    public final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(lifecycleOwner, 0);
        11T.A0F(event, 1);
        if (event != Lifecycle.Event.ON_CREATE) {
            throw 1BL.A0h(event, "Next event must be ON_CREATE, it was ", AnonymousClass001.A0k());
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.provider.performRestore();
    }
}
