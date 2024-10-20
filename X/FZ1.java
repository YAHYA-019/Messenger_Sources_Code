package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: FZ1.class */
public final class FZ1 implements LifecycleOwner {
    public final LifecycleRegistry A00 = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.A00;
    }
}
