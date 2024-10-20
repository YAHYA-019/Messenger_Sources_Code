package androidx.lifecycle;

import X.11T;

/* loaded from: LifecycleOwnerKt.class */
public abstract class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        11T.A0F(lifecycleOwner, 0);
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
