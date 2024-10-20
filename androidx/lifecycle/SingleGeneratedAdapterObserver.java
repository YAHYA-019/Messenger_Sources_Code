package androidx.lifecycle;

import X.11T;
import androidx.lifecycle.Lifecycle;

/* loaded from: SingleGeneratedAdapterObserver.class */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    public final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        11T.A0F(generatedAdapter, 1);
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        11T.A0F(lifecycleOwner, 0);
        11T.A0F(event, 1);
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, null);
    }
}
